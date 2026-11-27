package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class fm9 implements cg9 {
    public final km9 a;

    public fm9(km9 km9Var) {
        this.a = km9Var;
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        mk0 mk0Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var == null || (mk0Var = km9Var.y) == null) {
            return false;
        }
        return ((zh9) hm9Var).a.V3(mk0Var, false);
    }

    @Override
    public final void G() {
        mk0 mk0Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var != null && (mk0Var = km9Var.y) != null) {
            ((zh9) hm9Var).a.V3(mk0Var, true);
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        hm9 hm9Var = this.a.E;
        if (hm9Var != null) {
            zh9 zh9Var = (zh9) hm9Var;
            if (charSequence != null && charSequence.length() > 0) {
                zh9Var.a.v4(charSequence.toString());
            }
        }
    }

    @Override
    public final void Q(Editable editable) {
        mk0 mk0Var;
        km9 km9Var = this.a;
        if (km9Var.y != null) {
            km9Var.D(editable);
            km9Var.K();
            km9.b(km9Var.y.b, editable);
            km9Var.B();
            km9Var.G();
            int i = 0;
            if (km9Var.m() && !km9Var.i()) {
                ((TL_iv.pageBlockBlockquote) km9Var.y.b).collapsed = false;
            }
            km9Var.H();
            hm9 hm9Var = km9Var.E;
            if (hm9Var != null) {
                pi9 pi9Var = ((zh9) hm9Var).a;
                ch9 ch9Var = pi9Var.R3;
                if (ch9Var != null) {
                    ch9Var.g();
                }
                pi9Var.p3.onContentChanged();
            }
            hm9 hm9Var2 = km9Var.E;
            if (hm9Var2 != null) {
                ((zh9) hm9Var2).a.p3.b(km9Var, km9.E(editable.toString()));
            }
            String obj = editable.toString();
            mk0 mk0Var2 = km9Var.y;
            if (mk0Var2 != null && obj != null && mk0Var2.c == 0 && (mk0Var2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i = 6;
            }
            if (i != 0 && km9Var.E != null) {
                km9Var.post(new sb4(this, km9Var.y, i, (byte) 14));
            } else {
                jm9 r = km9.r(km9Var.y, editable.toString());
                if (r != null && km9Var.E != null) {
                    km9Var.post(new sa8(this, km9Var.y, r, (byte) 23));
                }
            }
            if (!km9Var.W && ((mk0Var = km9Var.y) == null || !(mk0Var.b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            km9Var.invalidate();
        }
    }

    @Override
    public final void U(dg9 dg9Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        boolean z2;
        byte b;
        int i;
        dg9 editText;
        Editable text;
        km9 km9Var = this.a;
        if (km9Var.E != null && km9Var.y != null) {
            String obj = dg9Var.getText().toString();
            ((zh9) km9Var.E).a.p3.b(km9Var, null);
            String E = km9.E(obj);
            if (E != null) {
                ArrayList a = kf9.a(E);
                if (!a.isEmpty()) {
                    km9Var.C((kf9) a.get(0));
                    return;
                }
            }
            int p = km9.p(dg9Var.getText().toString());
            if (p != 0) {
                ((zh9) km9Var.E).c(km9Var.y, p);
                return;
            }
            jm9 q = km9.q(km9Var.y, dg9Var.getText().toString());
            if (q != null) {
                ((zh9) km9Var.E).d(km9Var.y, q.a, q.b, q.c, q.d, q.e);
            } else if ((km9Var.y.b instanceof TL_iv.pageBlockPullquote) && km9Var.f.length() > 0) {
                km9Var.f();
            } else {
                hm9 hm9Var = km9Var.E;
                mk0 mk0Var = km9Var.y;
                pi9 pi9Var = ((zh9) hm9Var).a;
                ArrayList arrayList = pi9Var.x4;
                l9c l9cVar = pi9Var.g3;
                ArrayList arrayList2 = pi9Var.t3;
                int indexOf = arrayList2.indexOf(mk0Var);
                if (indexOf >= 0) {
                    ch9 ch9Var = pi9Var.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    View D1 = pi9Var.D1(mk0Var);
                    boolean z3 = D1 instanceof km9;
                    if (z3) {
                        dg9 editText2 = ((km9) D1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder z4 = km9.z(mk0Var.b);
                        length = z4.length();
                        spannableStringBuilder = z4;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!mk0Var.k.isEmpty()) {
                            ArrayList arrayList3 = mk0Var.k;
                            arrayList3.remove(arrayList3.size() - 1);
                            pi9Var.u4();
                            l9cVar.O(false);
                            ch9 ch9Var2 = pi9Var.R3;
                            if (ch9Var2 != null) {
                                ch9Var2.h();
                            }
                            pi9Var.post(new jh9(pi9Var, mk0Var, (byte) 27));
                            return;
                        } else if (mk0Var.c > 0) {
                            pi9Var.q2(indexOf);
                            pi9Var.u4();
                            l9cVar.O(false);
                            ch9 ch9Var3 = pi9Var.R3;
                            if (ch9Var3 != null) {
                                ch9Var3.h();
                            }
                            pi9Var.post(new jh9(pi9Var, mk0Var, (byte) 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    ArrayList arrayList4 = mk0Var.k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a2 = mf9.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) mk0Var.b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            z = true;
                            pi9Var.u3.put(Long.valueOf(a2), richText);
                        } else {
                            z = true;
                        }
                        arrayList4.add(Long.valueOf(a2));
                        pageBlock = new TL_iv.pageBlockParagraph();
                        mk0Var.b = pageBlock;
                        z2 = z;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    km9.b(pageBlock, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    km9.b(pageblockparagraph, subSequence2);
                    int i2 = mk0Var.d;
                    if (i2 > 0) {
                        i2++;
                    }
                    mk0 mk0Var2 = new mk0(pageblockparagraph, mk0Var.c, i2);
                    mk0Var2.e = mk0Var.e;
                    mk0Var2.k.addAll(arrayList4);
                    int i3 = indexOf + 1;
                    arrayList2.add(i3, mk0Var2);
                    pi9Var.u4();
                    if (z2) {
                        l9cVar.O(false);
                        ch9 ch9Var4 = pi9Var.R3;
                        if (ch9Var4 != null) {
                            ch9Var4.h();
                        }
                        pi9Var.post(new jh9(pi9Var, mk0Var2, (byte) 29));
                        return;
                    }
                    if (z3 && (text = (editText = ((km9) D1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.j2 = z;
                        text.delete(length, text.length());
                        editText.j2 = false;
                    }
                    l9cVar.T();
                    pi9Var.r4(i3);
                    int indexOf2 = arrayList.indexOf(mk0Var2);
                    if (indexOf2 < 0) {
                        l9cVar.f();
                    } else {
                        o79 itemAnimator = pi9Var.getItemAnimator();
                        pi9Var.setItemAnimator(null);
                        l9cVar.i(indexOf2);
                        if (mk0Var.d > 0 && (i = indexOf2 + 1) < arrayList.size()) {
                            b = 1;
                            l9cVar.l(i, (arrayList.size() - indexOf2) - 1);
                        } else {
                            b = 1;
                        }
                        pi9Var.post(new kh9(pi9Var, itemAnimator, b));
                    }
                    ch9 ch9Var5 = pi9Var.R3;
                    if (ch9Var5 != null) {
                        ch9Var5.h();
                    }
                    pi9Var.post(new th9(pi9Var, mk0Var2, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean W(boolean z) {
        mk0 mk0Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var != null && (mk0Var = km9Var.y) != null) {
            return ((zh9) hm9Var).a.W3(mk0Var, z);
        }
        return false;
    }

    @Override
    public final void e(dg9 dg9Var) {
        hm9 hm9Var = this.a.E;
        if (hm9Var != null) {
            pi9 pi9Var = ((zh9) hm9Var).a;
            pi9Var.j4(dg9Var);
            pi9Var.p3.j(dg9Var, true);
        }
    }

    @Override
    public final boolean i() {
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var != null && km9Var.y != null) {
            return ((zh9) hm9Var).a.W4();
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ch9 ch9Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var != null && km9Var.y != null && (ch9Var = ((zh9) hm9Var).a.R3) != null) {
            ch9Var.f(i, i2);
        }
    }

    @Override
    public final void s(dg9 dg9Var, int i, int i2) {
        hm9 hm9Var;
        amb textSelectionHelper;
        km9 km9Var = this.a;
        if (!km9Var.G && i != i2 && (hm9Var = km9Var.E) != null && (textSelectionHelper = ((zh9) hm9Var).a.getTextSelectionHelper()) != null) {
            km9Var.post(new hz0(this, dg9Var, i2, textSelectionHelper, i, (byte) 6));
        }
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        mk0 mk0Var;
        ClipData primaryClip;
        int indexOf;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var != null && (mk0Var = km9Var.y) != null) {
            pi9 pi9Var = ((zh9) hm9Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) pi9Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList y4 = pi9Var.y4(wi9.z(htmlText, hashMap));
                            if (!y4.isEmpty() && ((y4.size() != 1 || !pi9.C3((mk0) y4.get(0))) && (indexOf = pi9Var.t3.indexOf(mk0Var)) >= 0)) {
                                int max = Math.max(0, Math.min(dg9Var.getSelectionStart(), dg9Var.getSelectionEnd()));
                                boolean M4 = pi9Var.M4(indexOf, indexOf, max, Math.max(max, Math.max(dg9Var.getSelectionStart(), dg9Var.getSelectionEnd())), y4);
                                if (M4 && !hashMap.isEmpty()) {
                                    pi9Var.u3.putAll(hashMap);
                                }
                                return M4;
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}
