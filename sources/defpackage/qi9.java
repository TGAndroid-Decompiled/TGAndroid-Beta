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
public final class qi9 implements lc9 {
    public final wi9 a;

    public qi9(wi9 wi9Var) {
        this.a = wi9Var;
    }

    @Override
    public final boolean G(mc9 mc9Var) {
        lk0 lk0Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var == null || (lk0Var = wi9Var.y) == null) {
            return false;
        }
        return ((ie9) ti9Var).a.U3(lk0Var, false);
    }

    @Override
    public final void I() {
        lk0 lk0Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var != null && (lk0Var = wi9Var.y) != null) {
            ((ie9) ti9Var).a.U3(lk0Var, true);
        }
    }

    @Override
    public final void O(CharSequence charSequence) {
        ti9 ti9Var = this.a.E;
        if (ti9Var != null) {
            ie9 ie9Var = (ie9) ti9Var;
            if (charSequence != null && charSequence.length() > 0) {
                ie9Var.a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void U(Editable editable) {
        lk0 lk0Var;
        wi9 wi9Var = this.a;
        if (wi9Var.y != null) {
            wi9Var.D(editable);
            wi9Var.K();
            wi9.b(wi9Var.y.b, editable);
            wi9Var.B();
            wi9Var.G();
            int i = 0;
            if (wi9Var.m() && !wi9Var.i()) {
                ((TL_iv.pageBlockBlockquote) wi9Var.y.b).collapsed = false;
            }
            wi9Var.H();
            ti9 ti9Var = wi9Var.E;
            if (ti9Var != null) {
                ye9 ye9Var = ((ie9) ti9Var).a;
                ld9 ld9Var = ye9Var.R3;
                if (ld9Var != null) {
                    ld9Var.g();
                }
                ye9Var.p3.onContentChanged();
            }
            ti9 ti9Var2 = wi9Var.E;
            if (ti9Var2 != null) {
                ((ie9) ti9Var2).a.p3.b(wi9Var, wi9.E(editable.toString()));
            }
            String obj = editable.toString();
            lk0 lk0Var2 = wi9Var.y;
            if (lk0Var2 != null && obj != null && lk0Var2.c == 0 && (lk0Var2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i = 6;
            }
            if (i != 0 && wi9Var.E != null) {
                wi9Var.post(new o94(this, wi9Var.y, i, (byte) 14));
            } else {
                vi9 r = wi9.r(wi9Var.y, editable.toString());
                if (r != null && wi9Var.E != null) {
                    wi9Var.post(new gm8(this, wi9Var.y, r, (byte) 14));
                }
            }
            if (!wi9Var.W && ((lk0Var = wi9Var.y) == null || !(lk0Var.b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            wi9Var.invalidate();
        }
    }

    @Override
    public final void Y(mc9 mc9Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        boolean z2;
        int i;
        mc9 editText;
        Editable text;
        wi9 wi9Var = this.a;
        if (wi9Var.E != null && wi9Var.y != null) {
            String obj = mc9Var.getText().toString();
            ((ie9) wi9Var.E).a.p3.b(wi9Var, null);
            String E = wi9.E(obj);
            if (E != null) {
                ArrayList a = ub9.a(E);
                if (!a.isEmpty()) {
                    wi9Var.C((ub9) a.get(0));
                    return;
                }
            }
            int p = wi9.p(mc9Var.getText().toString());
            if (p != 0) {
                ((ie9) wi9Var.E).c(wi9Var.y, p);
                return;
            }
            vi9 q = wi9.q(wi9Var.y, mc9Var.getText().toString());
            if (q != null) {
                ((ie9) wi9Var.E).d(wi9Var.y, q.a, q.b, q.c, q.d, q.e);
            } else if ((wi9Var.y.b instanceof TL_iv.pageBlockPullquote) && wi9Var.f.length() > 0) {
                wi9Var.f();
            } else {
                ti9 ti9Var = wi9Var.E;
                lk0 lk0Var = wi9Var.y;
                ye9 ye9Var = ((ie9) ti9Var).a;
                ArrayList arrayList = ye9Var.x4;
                l5c l5cVar = ye9Var.g3;
                ArrayList arrayList2 = ye9Var.t3;
                int indexOf = arrayList2.indexOf(lk0Var);
                if (indexOf >= 0) {
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    View C1 = ye9Var.C1(lk0Var);
                    boolean z3 = C1 instanceof wi9;
                    if (z3) {
                        mc9 editText2 = ((wi9) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder z4 = wi9.z(lk0Var.b);
                        length = z4.length();
                        spannableStringBuilder = z4;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!lk0Var.k.isEmpty()) {
                            ArrayList arrayList3 = lk0Var.k;
                            arrayList3.remove(arrayList3.size() - 1);
                            ye9Var.t4();
                            l5cVar.O(false);
                            ld9 ld9Var2 = ye9Var.R3;
                            if (ld9Var2 != null) {
                                ld9Var2.h();
                            }
                            ye9Var.post(new sd9(ye9Var, lk0Var, (byte) 27));
                            return;
                        } else if (lk0Var.c > 0) {
                            ye9Var.p2(indexOf);
                            ye9Var.t4();
                            l5cVar.O(false);
                            ld9 ld9Var3 = ye9Var.R3;
                            if (ld9Var3 != null) {
                                ld9Var3.h();
                            }
                            ye9Var.post(new sd9(ye9Var, lk0Var, (byte) 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = lk0Var.b;
                    ArrayList arrayList4 = lk0Var.k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a2 = wb9.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) lk0Var.b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            z = true;
                            ye9Var.u3.put(Long.valueOf(a2), richText);
                        } else {
                            z = true;
                        }
                        arrayList4.add(Long.valueOf(a2));
                        pageBlock = new TL_iv.pageBlockParagraph();
                        lk0Var.b = pageBlock;
                        z2 = z;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    wi9.b(pageBlock, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    wi9.b(pageblockparagraph, subSequence2);
                    int i2 = lk0Var.d;
                    if (i2 > 0) {
                        i2++;
                    }
                    lk0 lk0Var2 = new lk0(pageblockparagraph, lk0Var.c, i2);
                    lk0Var2.e = lk0Var.e;
                    lk0Var2.k.addAll(arrayList4);
                    int i3 = indexOf + 1;
                    arrayList2.add(i3, lk0Var2);
                    ye9Var.t4();
                    if (z2) {
                        l5cVar.O(false);
                        ld9 ld9Var4 = ye9Var.R3;
                        if (ld9Var4 != null) {
                            ld9Var4.h();
                        }
                        ye9Var.post(new sd9(ye9Var, lk0Var2, (byte) 29));
                        return;
                    }
                    if (z3 && (text = (editText = ((wi9) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.i2 = z;
                        text.delete(length, text.length());
                        editText.i2 = false;
                    }
                    l5cVar.T();
                    ye9Var.q4(i3);
                    int indexOf2 = arrayList.indexOf(lk0Var2);
                    if (indexOf2 < 0) {
                        l5cVar.f();
                    } else {
                        b49 itemAnimator = ye9Var.getItemAnimator();
                        ye9Var.setItemAnimator(null);
                        l5cVar.i(indexOf2);
                        if (lk0Var.d > 0 && (i = indexOf2 + 1) < arrayList.size()) {
                            l5cVar.l(i, (arrayList.size() - indexOf2) - 1);
                        }
                        ye9Var.post(new be9(ye9Var, itemAnimator, (byte) 0));
                    }
                    ld9 ld9Var5 = ye9Var.R3;
                    if (ld9Var5 != null) {
                        ld9Var5.h();
                    }
                    ye9Var.post(new ce9(ye9Var, lk0Var2, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean b0(boolean z) {
        lk0 lk0Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var != null && (lk0Var = wi9Var.y) != null) {
            return ((ie9) ti9Var).a.V3(lk0Var, z);
        }
        return false;
    }

    @Override
    public final void d(mc9 mc9Var) {
        ti9 ti9Var = this.a.E;
        if (ti9Var != null) {
            ye9 ye9Var = ((ie9) ti9Var).a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override
    public final boolean i() {
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var != null && wi9Var.y != null) {
            return ((ie9) ti9Var).a.V4();
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ld9 ld9Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var != null && wi9Var.y != null && (ld9Var = ((ie9) ti9Var).a.R3) != null) {
            ld9Var.f(i, i2);
        }
    }

    @Override
    public final void t(mc9 mc9Var, int i, int i2) {
        ti9 ti9Var;
        fib textSelectionHelper;
        wi9 wi9Var = this.a;
        if (!wi9Var.G && i != i2 && (ti9Var = wi9Var.E) != null && (textSelectionHelper = ((ie9) ti9Var).a.getTextSelectionHelper()) != null) {
            wi9Var.post(new zy0(this, mc9Var, i2, textSelectionHelper, i, (byte) 6));
        }
    }

    @Override
    public final boolean z(mc9 mc9Var) {
        lk0 lk0Var;
        ClipData primaryClip;
        int indexOf;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var != null && (lk0Var = wi9Var.y) != null) {
            ye9 ye9Var = ((ie9) ti9Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) ye9Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x4 = ye9Var.x4(ff9.z(htmlText, hashMap));
                            if (!x4.isEmpty() && ((x4.size() != 1 || !ye9.B3((lk0) x4.get(0))) && (indexOf = ye9Var.t3.indexOf(lk0Var)) >= 0)) {
                                int max = Math.max(0, Math.min(mc9Var.getSelectionStart(), mc9Var.getSelectionEnd()));
                                boolean L4 = ye9Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(mc9Var.getSelectionStart(), mc9Var.getSelectionEnd())), x4);
                                if (L4 && !hashMap.isEmpty()) {
                                    ye9Var.u3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}
