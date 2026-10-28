package li;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.k71;
public final class x5 implements f1 {
    public final d6 f17626a;

    public x5(d6 d6Var) {
        this.f17626a = d6Var;
    }

    @Override
    public final void E(g1 g1Var, int i10, int i11) {
        a6 a6Var;
        s9 textSelectionHelper;
        d6 d6Var = this.f17626a;
        if (!d6Var.F && i10 != i11 && (a6Var = d6Var.f17202y) != null && (textSelectionHelper = ((d3) a6Var).f17188a.getTextSelectionHelper()) != null) {
            d6Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void R() {
        a aVar;
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var != null && (aVar = d6Var.f17201x) != null) {
            v3.W1(((d3) a6Var).f17188a, aVar, true);
        }
    }

    @Override
    public final void T(CharSequence charSequence) {
        a6 a6Var = this.f17626a.f17202y;
        if (a6Var != null) {
            d3 d3Var = (d3) a6Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f17188a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public final void Y(Editable editable) {
        a aVar;
        d6 d6Var = this.f17626a;
        if (d6Var.f17201x != null) {
            d6Var.D(editable);
            d6Var.J();
            d6.d(d6Var.f17201x.f17053b, editable);
            d6Var.B();
            d6Var.F();
            int i10 = 0;
            if (d6Var.n() && !d6Var.k()) {
                ((TL_iv.pageBlockBlockquote) d6Var.f17201x.f17053b).collapsed = false;
            }
            d6Var.G();
            a6 a6Var = d6Var.f17202y;
            if (a6Var != null) {
                v3 v3Var = ((d3) a6Var).f17188a;
                f2 f2Var = v3Var.R3;
                if (f2Var != null) {
                    f2Var.g();
                }
                v3Var.f17556p3.onContentChanged();
            }
            a6 a6Var2 = d6Var.f17202y;
            if (a6Var2 != null) {
                ((d3) a6Var2).f17188a.f17556p3.p(d6Var, d6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = d6Var.f17201x;
            if (aVar2 != null && obj != null && aVar2.f17054c == 0 && (aVar2.f17053b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && d6Var.f17202y != null) {
                d6Var.post(new ai.h0(this, d6Var.f17201x, i10, 21));
            } else {
                c6 r6 = d6.r(editable.toString(), d6Var.f17201x);
                if (r6 != null && d6Var.f17202y != null) {
                    d6Var.post(new jg.f1(this, d6Var.f17201x, r6, 7));
                }
            }
            if (!d6Var.V && ((aVar = d6Var.f17201x) == null || !(aVar.f17053b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            d6Var.invalidate();
        }
    }

    @Override
    public final void b(g1 g1Var) {
        a6 a6Var = this.f17626a.f17202y;
        if (a6Var != null) {
            v3 v3Var = ((d3) a6Var).f17188a;
            v3.S1(v3Var, g1Var);
            v3Var.f17556p3.s(g1Var, true);
        }
    }

    @Override
    public final boolean e() {
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var != null && d6Var.f17201x != null) {
            return ((d3) a6Var).f17188a.Y4();
        }
        return false;
    }

    @Override
    public final boolean f0(boolean z10) {
        a aVar;
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var != null && (aVar = d6Var.f17201x) != null) {
            return ((d3) a6Var).f17188a.c4(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean g(g1 g1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var != null && (aVar = d6Var.f17201x) != null) {
            v3 v3Var = ((d3) a6Var).f17188a;
            ClipboardManager clipboardManager = (ClipboardManager) v3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList C4 = v3Var.C4(d4.z(htmlText, hashMap));
                            if (!C4.isEmpty() && ((C4.size() != 1 || !v3.L3((a) C4.get(0))) && (indexOf = v3Var.f17564t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(g1Var.getSelectionStart(), g1Var.getSelectionEnd()));
                                boolean O4 = v3Var.O4(indexOf, indexOf, max, Math.max(max, Math.max(g1Var.getSelectionStart(), g1Var.getSelectionEnd())), C4);
                                if (O4 && !hashMap.isEmpty()) {
                                    v3Var.f17566u3.putAll(hashMap);
                                }
                                return O4;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void k(int i10, int i11) {
        f2 f2Var;
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var != null && d6Var.f17201x != null && (f2Var = ((d3) a6Var).f17188a.R3) != null) {
            f2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(g1 g1Var) {
        a aVar;
        d6 d6Var = this.f17626a;
        a6 a6Var = d6Var.f17202y;
        if (a6Var == null || (aVar = d6Var.f17201x) == null) {
            return false;
        }
        return v3.W1(((d3) a6Var).f17188a, aVar, false);
    }

    @Override
    public final void t(g1 g1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i10;
        g1 editText;
        Editable text;
        d6 d6Var = this.f17626a;
        if (d6Var.f17202y != null && d6Var.f17201x != null) {
            String obj = g1Var.getText().toString();
            ((d3) d6Var.f17202y).f17188a.f17556p3.p(d6Var, null);
            String b10 = d6.b(obj);
            if (b10 != null) {
                ArrayList a2 = m0.a(b10);
                if (!a2.isEmpty()) {
                    d6Var.C((m0) a2.get(0));
                    return;
                }
            }
            int p10 = d6.p(g1Var.getText().toString());
            if (p10 != 0) {
                ((d3) d6Var.f17202y).c(d6Var.f17201x, p10);
                return;
            }
            c6 q5 = d6.q(g1Var.getText().toString(), d6Var.f17201x);
            if (q5 != null) {
                ((d3) d6Var.f17202y).d(d6Var.f17201x, q5.f17175a, q5.f17176b, q5.f17177c, q5.d, q5.e);
            } else if ((d6Var.f17201x.f17053b instanceof TL_iv.pageBlockPullquote) && d6Var.f17196f.length() > 0) {
                d6Var.h();
            } else {
                a6 a6Var = d6Var.f17202y;
                a aVar = d6Var.f17201x;
                v3 v3Var = ((d3) a6Var).f17188a;
                ArrayList arrayList = v3Var.f17573x4;
                k71 k71Var = v3Var.f32504g3;
                ArrayList arrayList2 = v3Var.f17564t3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    View F1 = v3Var.F1(aVar);
                    boolean z12 = F1 instanceof d6;
                    if (z12) {
                        g1 editText2 = ((d6) F1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder z13 = d6.z(aVar.f17053b);
                        length = z13.length();
                        spannableStringBuilder = z13;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f17059k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f17059k;
                            arrayList3.remove(arrayList3.size() - 1);
                            v3Var.y4();
                            k71Var.O(false);
                            f2 f2Var2 = v3Var.R3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                            v3Var.post(new m2(v3Var, aVar, 27));
                            return;
                        } else if (aVar.f17054c > 0) {
                            v3Var.z2(indexOf);
                            v3Var.y4();
                            k71Var.O(false);
                            f2 f2Var3 = v3Var.R3;
                            if (f2Var3 != null) {
                                f2Var3.h();
                            }
                            v3Var.post(new m2(v3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f17053b;
                    ArrayList arrayList4 = aVar.f17059k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = o0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f17053b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            v3Var.f17566u3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f17053b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    d6.d(aVar.f17053b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    d6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f17054c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f17059k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    v3Var.y4();
                    if (z11) {
                        k71Var.O(false);
                        f2 f2Var4 = v3Var.R3;
                        if (f2Var4 != null) {
                            f2Var4.h();
                        }
                        v3Var.post(new m2(v3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((d6) F1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = z10;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    k71Var.T();
                    v3Var.v4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        k71Var.l();
                    } else {
                        s4.m0 itemAnimator = v3Var.getItemAnimator();
                        v3Var.setItemAnimator(null);
                        k71Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            k71Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        v3Var.post(new x2(v3Var, itemAnimator, 0));
                    }
                    f2 f2Var5 = v3Var.R3;
                    if (f2Var5 != null) {
                        f2Var5.h();
                    }
                    v3Var.post(new y2(v3Var, aVar2, 0));
                }
            }
        }
    }
}
