package hi;

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
import org.telegram.ui.Components.j61;
public final class a6 implements j1 {
    public final g6 f9461a;

    public a6(g6 g6Var) {
        this.f9461a = g6Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        d6 d6Var = this.f9461a.f9627y;
        if (d6Var != null) {
            h3 h3Var = (h3) d6Var;
            if (charSequence != null && charSequence.length() > 0) {
                h3Var.f9636a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean F(k1 k1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && (aVar = g6Var.f9626x) != null) {
            z3 z3Var = ((h3) d6Var).f9636a;
            ClipboardManager clipboardManager = (ClipboardManager) z3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList v42 = z3Var.v4(g4.z(htmlText, hashMap));
                            if (!v42.isEmpty() && ((v42.size() != 1 || !z3.E3((a) v42.get(0))) && (indexOf = z3Var.f10008l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(k1Var.getSelectionStart(), k1Var.getSelectionEnd()));
                                boolean H4 = z3Var.H4(indexOf, indexOf, max, Math.max(max, Math.max(k1Var.getSelectionStart(), k1Var.getSelectionEnd())), v42);
                                if (H4 && !hashMap.isEmpty()) {
                                    z3Var.f10009m3.putAll(hashMap);
                                }
                                return H4;
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
    public final void G(Editable editable) {
        a aVar;
        g6 g6Var = this.f9461a;
        if (g6Var.f9626x != null) {
            g6Var.E(editable);
            g6Var.J();
            g6.d(g6Var.f9626x.f9421b, editable);
            g6Var.C();
            g6Var.G();
            int i10 = 0;
            if (g6Var.o() && !g6Var.l()) {
                ((TL_iv.pageBlockBlockquote) g6Var.f9626x.f9421b).collapsed = false;
            }
            g6Var.H();
            d6 d6Var = g6Var.f9627y;
            if (d6Var != null) {
                z3 z3Var = ((h3) d6Var).f9636a;
                k2 k2Var = z3Var.J3;
                if (k2Var != null) {
                    k2Var.g();
                }
                z3Var.f10001h3.onContentChanged();
            }
            d6 d6Var2 = g6Var.f9627y;
            if (d6Var2 != null) {
                ((h3) d6Var2).f9636a.f10001h3.h(g6Var, g6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = g6Var.f9626x;
            if (aVar2 != null && obj != null && aVar2.f9422c == 0 && (aVar2.f9421b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && g6Var.f9627y != null) {
                g6Var.post(new bi.g3(this, g6Var.f9626x, i10, 11));
            } else {
                f6 s10 = g6.s(g6Var.f9626x, editable.toString());
                if (s10 != null && g6Var.f9627y != null) {
                    g6Var.post(new gg.a0(this, g6Var.f9626x, s10, 8));
                }
            }
            if (!g6Var.T && ((aVar = g6Var.f9626x) == null || !(aVar.f9421b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            g6Var.invalidate();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        a aVar;
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && (aVar = g6Var.f9626x) != null) {
            return ((h3) d6Var).f9636a.V3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean P(k1 k1Var) {
        a aVar;
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var == null || (aVar = g6Var.f9626x) == null) {
            return false;
        }
        return z3.P1(((h3) d6Var).f9636a, aVar, false);
    }

    @Override
    public final void b(k1 k1Var) {
        d6 d6Var = this.f9461a.f9627y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).f9636a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public final boolean f() {
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && g6Var.f9626x != null) {
            return ((h3) d6Var).f9636a.R4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        k2 k2Var;
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && g6Var.f9626x != null && (k2Var = ((h3) d6Var).f9636a.J3) != null) {
            k2Var.f(i10, i11);
        }
    }

    @Override
    public final void r(k1 k1Var, int i10, int i11) {
        d6 d6Var;
        s9 textSelectionHelper;
        g6 g6Var = this.f9461a;
        if (!g6Var.F && i10 != i11 && (d6Var = g6Var.f9627y) != null && (textSelectionHelper = ((h3) d6Var).f9636a.getTextSelectionHelper()) != null) {
            g6Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void t() {
        a aVar;
        g6 g6Var = this.f9461a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && (aVar = g6Var.f9626x) != null) {
            z3.P1(((h3) d6Var).f9636a, aVar, true);
        }
    }

    @Override
    public final void x(k1 k1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        k1 editText;
        Editable text;
        g6 g6Var = this.f9461a;
        if (g6Var.f9627y != null && g6Var.f9626x != null) {
            String obj = k1Var.getText().toString();
            ((h3) g6Var.f9627y).f9636a.f10001h3.h(g6Var, null);
            String b10 = g6.b(obj);
            if (b10 != null) {
                ArrayList a2 = p0.a(b10);
                if (!a2.isEmpty()) {
                    g6Var.D((p0) a2.get(0));
                    return;
                }
            }
            int q6 = g6.q(k1Var.getText().toString());
            if (q6 != 0) {
                ((h3) g6Var.f9627y).c(g6Var.f9626x, q6);
                return;
            }
            f6 r10 = g6.r(g6Var.f9626x, k1Var.getText().toString());
            if (r10 != null) {
                ((h3) g6Var.f9627y).d(g6Var.f9626x, r10.f9572a, r10.f9573b, r10.f9574c, r10.d, r10.e);
            } else if ((g6Var.f9626x.f9421b instanceof TL_iv.pageBlockPullquote) && g6Var.f9621f.length() > 0) {
                g6Var.i();
            } else {
                d6 d6Var = g6Var.f9627y;
                a aVar = g6Var.f9626x;
                z3 z3Var = ((h3) d6Var).f9636a;
                ArrayList arrayList = z3Var.f10016p4;
                j61 j61Var = z3Var.Y2;
                ArrayList arrayList2 = z3Var.f10008l3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.d();
                    }
                    View y12 = z3Var.y1(aVar);
                    boolean z11 = y12 instanceof g6;
                    if (z11) {
                        k1 editText2 = ((g6) y12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = g6.A(aVar.f9421b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f9427k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f9427k;
                            arrayList3.remove(arrayList3.size() - 1);
                            z3Var.r4();
                            j61Var.N(false);
                            k2 k2Var2 = z3Var.J3;
                            if (k2Var2 != null) {
                                k2Var2.h();
                            }
                            z3Var.post(new r2(z3Var, aVar, 27));
                            return;
                        } else if (aVar.f9422c > 0) {
                            z3Var.s2(indexOf);
                            z3Var.r4();
                            j61Var.N(false);
                            k2 k2Var3 = z3Var.J3;
                            if (k2Var3 != null) {
                                k2Var3.h();
                            }
                            z3Var.post(new r2(z3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f9421b;
                    ArrayList arrayList4 = aVar.f9427k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = r0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f9421b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            z3Var.f10009m3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f9421b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g6.d(aVar.f9421b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    g6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f9422c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f9427k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    z3Var.r4();
                    if (z10) {
                        j61Var.N(false);
                        k2 k2Var4 = z3Var.J3;
                        if (k2Var4 != null) {
                            k2Var4.h();
                        }
                        z3Var.post(new r2(z3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((g6) y12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    j61Var.S();
                    z3Var.o4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        j61Var.l();
                    } else {
                        s4.m0 itemAnimator = z3Var.getItemAnimator();
                        z3Var.setItemAnimator(null);
                        j61Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            j61Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        z3Var.post(new b3(z3Var, itemAnimator, 0));
                    }
                    k2 k2Var5 = z3Var.J3;
                    if (k2Var5 != null) {
                        k2Var5.h();
                    }
                    z3Var.post(new c3(z3Var, aVar2, 0));
                }
            }
        }
    }
}
