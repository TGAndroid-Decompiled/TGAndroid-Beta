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
public final class sk9 implements me9 {
    public final xk9 a;

    public sk9(xk9 xk9Var) {
        this.a = xk9Var;
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        ll0 ll0Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var == null || (ll0Var = xk9Var.y) == null) {
            return false;
        }
        return ((mg9) uk9Var).a.U3(ll0Var, false);
    }

    @Override
    public final void H() {
        ll0 ll0Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && (ll0Var = xk9Var.y) != null) {
            ((mg9) uk9Var).a.U3(ll0Var, true);
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        uk9 uk9Var = this.a.E;
        if (uk9Var != null) {
            mg9 mg9Var = (mg9) uk9Var;
            if (charSequence != null && charSequence.length() > 0) {
                mg9Var.a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void S(Editable editable) {
        ll0 ll0Var;
        xk9 xk9Var = this.a;
        if (xk9Var.y != null) {
            xk9Var.D(editable);
            xk9Var.K();
            xk9.b(xk9Var.y.b, editable);
            xk9Var.B();
            xk9Var.G();
            int i = 0;
            if (xk9Var.m() && !xk9Var.i()) {
                ((TL_iv.pageBlockBlockquote) xk9Var.y.b).collapsed = false;
            }
            xk9Var.H();
            uk9 uk9Var = xk9Var.E;
            if (uk9Var != null) {
                ch9 ch9Var = ((mg9) uk9Var).a;
                of9 of9Var = ch9Var.R3;
                if (of9Var != null) {
                    of9Var.g();
                }
                ch9Var.p3.onContentChanged();
            }
            uk9 uk9Var2 = xk9Var.E;
            if (uk9Var2 != null) {
                ((mg9) uk9Var2).a.p3.b(xk9Var, xk9.E(editable.toString()));
            }
            String obj = editable.toString();
            ll0 ll0Var2 = xk9Var.y;
            if (ll0Var2 != null && obj != null && ll0Var2.c == 0 && (ll0Var2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i = 6;
            }
            if (i != 0 && xk9Var.E != null) {
                xk9Var.post(new ob4(this, xk9Var.y, i, (byte) 14));
            } else {
                wk9 r = xk9.r(xk9Var.y, editable.toString());
                if (r != null && xk9Var.E != null) {
                    xk9Var.post(new ak8(this, xk9Var.y, r, (byte) 17));
                }
            }
            if (!xk9Var.W && ((ll0Var = xk9Var.y) == null || !(ll0Var.b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            xk9Var.invalidate();
        }
    }

    @Override
    public final void W(ne9 ne9Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        boolean z2;
        int i;
        ne9 editText;
        Editable text;
        xk9 xk9Var = this.a;
        if (xk9Var.E != null && xk9Var.y != null) {
            String obj = ne9Var.getText().toString();
            ((mg9) xk9Var.E).a.p3.b(xk9Var, null);
            String E = xk9.E(obj);
            if (E != null) {
                ArrayList a = ud9.a(E);
                if (!a.isEmpty()) {
                    xk9Var.C((ud9) a.get(0));
                    return;
                }
            }
            int p = xk9.p(ne9Var.getText().toString());
            if (p != 0) {
                ((mg9) xk9Var.E).c(xk9Var.y, p);
                return;
            }
            wk9 q = xk9.q(xk9Var.y, ne9Var.getText().toString());
            if (q != null) {
                ((mg9) xk9Var.E).d(xk9Var.y, q.a, q.b, q.c, q.d, q.e);
            } else if ((xk9Var.y.b instanceof TL_iv.pageBlockPullquote) && xk9Var.f.length() > 0) {
                xk9Var.f();
            } else {
                uk9 uk9Var = xk9Var.E;
                ll0 ll0Var = xk9Var.y;
                ch9 ch9Var = ((mg9) uk9Var).a;
                ArrayList arrayList = ch9Var.x4;
                l7c l7cVar = ch9Var.g3;
                ArrayList arrayList2 = ch9Var.t3;
                int indexOf = arrayList2.indexOf(ll0Var);
                if (indexOf >= 0) {
                    of9 of9Var = ch9Var.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    View C1 = ch9Var.C1(ll0Var);
                    boolean z3 = C1 instanceof xk9;
                    if (z3) {
                        ne9 editText2 = ((xk9) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder z4 = xk9.z(ll0Var.b);
                        length = z4.length();
                        spannableStringBuilder = z4;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!ll0Var.k.isEmpty()) {
                            ArrayList arrayList3 = ll0Var.k;
                            arrayList3.remove(arrayList3.size() - 1);
                            ch9Var.t4();
                            l7cVar.O(false);
                            of9 of9Var2 = ch9Var.R3;
                            if (of9Var2 != null) {
                                of9Var2.h();
                            }
                            ch9Var.post(new vf9(ch9Var, ll0Var, (byte) 27));
                            return;
                        } else if (ll0Var.c > 0) {
                            ch9Var.p2(indexOf);
                            ch9Var.t4();
                            l7cVar.O(false);
                            of9 of9Var3 = ch9Var.R3;
                            if (of9Var3 != null) {
                                of9Var3.h();
                            }
                            ch9Var.post(new vf9(ch9Var, ll0Var, (byte) 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = ll0Var.b;
                    ArrayList arrayList4 = ll0Var.k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a2 = wd9.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) ll0Var.b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            z = true;
                            ch9Var.u3.put(Long.valueOf(a2), richText);
                        } else {
                            z = true;
                        }
                        arrayList4.add(Long.valueOf(a2));
                        pageBlock = new TL_iv.pageBlockParagraph();
                        ll0Var.b = pageBlock;
                        z2 = z;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    xk9.b(pageBlock, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    xk9.b(pageblockparagraph, subSequence2);
                    int i2 = ll0Var.d;
                    if (i2 > 0) {
                        i2++;
                    }
                    ll0 ll0Var2 = new ll0(pageblockparagraph, ll0Var.c, i2);
                    ll0Var2.e = ll0Var.e;
                    ll0Var2.k.addAll(arrayList4);
                    int i3 = indexOf + 1;
                    arrayList2.add(i3, ll0Var2);
                    ch9Var.t4();
                    if (z2) {
                        l7cVar.O(false);
                        of9 of9Var4 = ch9Var.R3;
                        if (of9Var4 != null) {
                            of9Var4.h();
                        }
                        ch9Var.post(new vf9(ch9Var, ll0Var2, (byte) 29));
                        return;
                    }
                    if (z3 && (text = (editText = ((xk9) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.i2 = z;
                        text.delete(length, text.length());
                        editText.i2 = false;
                    }
                    l7cVar.T();
                    ch9Var.q4(i3);
                    int indexOf2 = arrayList.indexOf(ll0Var2);
                    if (indexOf2 < 0) {
                        l7cVar.f();
                    } else {
                        d69 itemAnimator = ch9Var.getItemAnimator();
                        ch9Var.setItemAnimator(null);
                        l7cVar.i(indexOf2);
                        if (ll0Var.d > 0 && (i = indexOf2 + 1) < arrayList.size()) {
                            l7cVar.l(i, (arrayList.size() - indexOf2) - 1);
                        }
                        ch9Var.post(new fg9(ch9Var, itemAnimator, (byte) 0));
                    }
                    of9 of9Var5 = ch9Var.R3;
                    if (of9Var5 != null) {
                        of9Var5.h();
                    }
                    ch9Var.post(new gg9(ch9Var, ll0Var2, (byte) 0));
                }
            }
        }
    }

    @Override
    public final boolean Z(boolean z) {
        ll0 ll0Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && (ll0Var = xk9Var.y) != null) {
            return ((mg9) uk9Var).a.V3(ll0Var, z);
        }
        return false;
    }

    @Override
    public final void d(ne9 ne9Var) {
        uk9 uk9Var = this.a.E;
        if (uk9Var != null) {
            ch9 ch9Var = ((mg9) uk9Var).a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override
    public final boolean i() {
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && xk9Var.y != null) {
            return ((mg9) uk9Var).a.V4();
        }
        return false;
    }

    @Override
    public final void k(int i, int i2) {
        of9 of9Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && xk9Var.y != null && (of9Var = ((mg9) uk9Var).a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void r(ne9 ne9Var, int i, int i2) {
        uk9 uk9Var;
        gkb textSelectionHelper;
        xk9 xk9Var = this.a;
        if (!xk9Var.G && i != i2 && (uk9Var = xk9Var.E) != null && (textSelectionHelper = ((mg9) uk9Var).a.getTextSelectionHelper()) != null) {
            xk9Var.post(new g01(this, ne9Var, i2, textSelectionHelper, i, (byte) 6));
        }
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        ll0 ll0Var;
        ClipData primaryClip;
        int indexOf;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && (ll0Var = xk9Var.y) != null) {
            ch9 ch9Var = ((mg9) uk9Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) ch9Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x4 = ch9Var.x4(jh9.z(htmlText, hashMap));
                            if (!x4.isEmpty() && ((x4.size() != 1 || !ch9.B3((ll0) x4.get(0))) && (indexOf = ch9Var.t3.indexOf(ll0Var)) >= 0)) {
                                int max = Math.max(0, Math.min(ne9Var.getSelectionStart(), ne9Var.getSelectionEnd()));
                                boolean L4 = ch9Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(ne9Var.getSelectionStart(), ne9Var.getSelectionEnd())), x4);
                                if (L4 && !hashMap.isEmpty()) {
                                    ch9Var.u3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}
