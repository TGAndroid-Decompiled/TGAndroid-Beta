package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
public final class gi implements TextWatcher {
    public final byte a = 2;
    public int b;
    public boolean c;
    public Object d;

    public gi(zt3 zt3Var, int i, boolean z) {
        this.d = zt3Var;
        this.b = i;
        this.c = z;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z = true;
        switch (this.a) {
            case 0:
                ij ijVar = (ij) this.d;
                if (!this.c) {
                    int length = editable.length();
                    int i = this.b;
                    if (length > i) {
                        this.c = true;
                        editable.delete(i, editable.length());
                        hl.z3(ijVar);
                        try {
                            ijVar.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.c = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i2 = this.b;
                zt3 zt3Var = (zt3) this.d;
                yt3 yt3Var = zt3Var.d;
                if (!zt3Var.c) {
                    if (i2 > 0 && editable != null && editable.length() > i2) {
                        zt3Var.c = true;
                        yt3Var.setText(editable.subSequence(0, i2));
                        yt3Var.setSelection(yt3Var.length());
                        zt3Var.c = false;
                    }
                    zt3Var.b(editable);
                }
                if (this.c) {
                    return;
                }
                while (true) {
                    int indexOf = editable.toString().indexOf("\n");
                    if (indexOf >= 0) {
                        editable.delete(indexOf, indexOf + 1);
                    } else {
                        return;
                    }
                }
            case 2:
                return;
            default:
                sf6 sf6Var = (sf6) this.d;
                m7 m7Var = sf6Var.c;
                if (!this.c) {
                    sf6Var.p(true);
                    hl.r(sf6Var.W);
                    sf6Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        sf6Var.E = false;
                    }
                    if (!sf6Var.o(editable.toString())) {
                        sf6Var.r(true);
                        this.c = true;
                        if (m7Var.getSelectionEnd() < m7Var.getText().length()) {
                            z = false;
                        }
                        if (!sf6Var.E) {
                            String str = sf6Var.L;
                            m7Var.setText(str.substring(0, Utilities.j(this.b, str.length(), 0)));
                            if (z) {
                                m7Var.setSelection(m7Var.getText().length());
                            }
                        }
                        this.c = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        switch (this.a) {
            case 0:
                return;
            case 1:
                zt3 zt3Var = (zt3) this.d;
                if (!zt3Var.c) {
                    zt3Var.r = false;
                    return;
                }
                return;
            case 2:
                if (!this.c) {
                    HashMap hashMap = new HashMap();
                    boolean z = charSequence instanceof Spannable;
                    if (z) {
                        Spannable spannable = (Spannable) charSequence;
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                        ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
                        if (characterStyleArr != null && characterStyleArr.length > 0) {
                            for (CharacterStyle characterStyle : characterStyleArr) {
                                if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                                    hashMap.put(characterStyle, new Pair(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                                }
                            }
                        }
                        if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                            for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                                if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                                    hashMap.put(paragraphStyle, new Pair(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                                }
                            }
                        }
                    }
                    this.d = hashMap;
                    if (z) {
                        i4 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    }
                    this.b = i4;
                    return;
                }
                return;
            default:
                if (!this.c && charSequence != null && ((sf6) this.d).L != null) {
                    this.b = sf6.s(charSequence.toString()).length();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!this.c) {
                    boolean z = charSequence instanceof Spannable;
                    if (z) {
                        i4 = ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length;
                    } else {
                        i4 = 0;
                    }
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((i4 > 0 || this.b > 0) && i == 0 && i2 == i3) {
                            this.c = true;
                            if (z) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.c = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public gi() {
    }

    public gi(int i, ij ijVar) {
        this.b = i;
        this.d = ijVar;
    }

    public gi(sf6 sf6Var) {
        this.d = sf6Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }
}
