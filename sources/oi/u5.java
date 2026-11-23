package oi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.c51;
public final class u5 implements e1 {
    public final a6 f22470a;

    public u5(a6 a6Var) {
        this.f22470a = a6Var;
    }

    @Override
    public final void A(int i7, int i10) {
        g2 g2Var;
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f21978y != null && (g2Var = ((d3) x5Var).f22056a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public final void E0() {
        a aVar;
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f21978y) != null) {
            t3.U1(((d3) x5Var).f22056a, aVar, true);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        a aVar;
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f21978y) != null) {
            return ((d3) x5Var).f22056a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean J(f1 f1Var) {
        a aVar;
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.f21978y) == null) {
            return false;
        }
        return t3.U1(((d3) x5Var).f22056a, aVar, false);
    }

    @Override
    public final void b1(CharSequence charSequence) {
        x5 x5Var = this.f22470a.E;
        if (x5Var != null) {
            d3 d3Var = (d3) x5Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f22056a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean d2(f1 f1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f21978y) != null) {
            t3 t3Var = ((d3) x5Var).f22056a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.f22436t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(f1Var.getSelectionStart(), f1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(f1Var.getSelectionStart(), f1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.f22438u3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void e(f1 f1Var) {
        x5 x5Var = this.f22470a.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).f22056a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22428p3.k(f1Var, true);
        }
    }

    @Override
    public final boolean o() {
        a6 a6Var = this.f22470a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f21978y != null) {
            return ((d3) x5Var).f22056a.V4();
        }
        return false;
    }

    @Override
    public final void r1(f1 f1Var, int i7, int i10) {
        x5 x5Var;
        j9 textSelectionHelper;
        a6 a6Var = this.f22470a;
        if (!a6Var.G && i7 != i10 && (x5Var = a6Var.E) != null && (textSelectionHelper = ((d3) x5Var).f22056a.getTextSelectionHelper()) != null) {
            a6Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 5));
        }
    }

    @Override
    public final void s1(Editable editable) {
        a aVar;
        a6 a6Var = this.f22470a;
        if (a6Var.f21978y != null) {
            a6Var.E(editable);
            a6Var.K();
            a6.d(a6Var.f21978y.f21935b, editable);
            a6Var.C();
            a6Var.G();
            int i7 = 0;
            if (a6Var.o() && !a6Var.l()) {
                ((TL_iv.pageBlockBlockquote) a6Var.f21978y.f21935b).collapsed = false;
            }
            a6Var.H();
            x5 x5Var = a6Var.E;
            if (x5Var != null) {
                t3 t3Var = ((d3) x5Var).f22056a;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.g();
                }
                t3Var.f22428p3.onContentChanged();
            }
            x5 x5Var2 = a6Var.E;
            if (x5Var2 != null) {
                ((d3) x5Var2).f22056a.f22428p3.a0(a6Var, a6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = a6Var.f21978y;
            if (aVar2 != null && obj != null && aVar2.f21936c == 0 && (aVar2.f21935b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i7 = 6;
            }
            if (i7 != 0 && a6Var.E != null) {
                a6Var.post(new ai.j1(this, a6Var.f21978y, i7, 24));
            } else {
                z5 s5 = a6.s(editable.toString(), a6Var.f21978y);
                if (s5 != null && a6Var.E != null) {
                    a6Var.post(new kg.y(this, a6Var.f21978y, s5, 18));
                }
            }
            if (!a6Var.W && ((aVar = a6Var.f21978y) == null || !(aVar.f21935b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            a6Var.invalidate();
        }
    }

    @Override
    public final void x0(f1 f1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i7;
        f1 editText;
        Editable text;
        a6 a6Var = this.f22470a;
        if (a6Var.E != null && a6Var.f21978y != null) {
            String obj = f1Var.getText().toString();
            ((d3) a6Var.E).f22056a.f22428p3.a0(a6Var, null);
            String b10 = a6.b(obj);
            if (b10 != null) {
                ArrayList a10 = k0.a(b10);
                if (!a10.isEmpty()) {
                    a6Var.D((k0) a10.get(0));
                    return;
                }
            }
            int q10 = a6.q(f1Var.getText().toString());
            if (q10 != 0) {
                ((d3) a6Var.E).c(a6Var.f21978y, q10);
                return;
            }
            z5 r10 = a6.r(f1Var.getText().toString(), a6Var.f21978y);
            if (r10 != null) {
                ((d3) a6Var.E).d(a6Var.f21978y, r10.f22593a, r10.f22594b, r10.f22595c, r10.d, r10.f22596e);
            } else if ((a6Var.f21978y.f21935b instanceof TL_iv.pageBlockPullquote) && a6Var.f21972f.length() > 0) {
                a6Var.h();
            } else {
                x5 x5Var = a6Var.E;
                a aVar = a6Var.f21978y;
                t3 t3Var = ((d3) x5Var).f22056a;
                ArrayList arrayList = t3Var.f22445x4;
                c51 c51Var = t3Var.f35789g3;
                ArrayList arrayList2 = t3Var.f22436t3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    View C1 = t3Var.C1(aVar);
                    boolean z12 = C1 instanceof a6;
                    if (z12) {
                        f1 editText2 = ((a6) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = a6.A(aVar.f21935b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f21942k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f21942k;
                            arrayList3.remove(arrayList3.size() - 1);
                            t3Var.v4();
                            c51Var.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.post(new n2(t3Var, aVar, 27));
                            return;
                        } else if (aVar.f21936c > 0) {
                            t3Var.w2(indexOf);
                            t3Var.v4();
                            c51Var.O(false);
                            g2 g2Var3 = t3Var.R3;
                            if (g2Var3 != null) {
                                g2Var3.h();
                            }
                            t3Var.post(new n2(t3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f21935b;
                    ArrayList arrayList4 = aVar.f21942k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = m0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f21935b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            t3Var.f22438u3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f21935b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    a6.d(aVar.f21935b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    a6.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f21936c, i10);
                    aVar2.f21937e = aVar.f21937e;
                    aVar2.f21942k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    t3Var.v4();
                    if (z11) {
                        c51Var.O(false);
                        g2 g2Var4 = t3Var.R3;
                        if (g2Var4 != null) {
                            g2Var4.h();
                        }
                        t3Var.post(new n2(t3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((a6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f22104i2 = z10;
                        text.delete(length, text.length());
                        editText.f22104i2 = false;
                    }
                    c51Var.T();
                    t3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        c51Var.f();
                    } else {
                        v4.n0 itemAnimator = t3Var.getItemAnimator();
                        t3Var.setItemAnimator(null);
                        c51Var.i(indexOf2);
                        if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                            c51Var.k(i7, (arrayList.size() - indexOf2) - 1);
                        }
                        t3Var.post(new x2(t3Var, itemAnimator, 0));
                    }
                    g2 g2Var5 = t3Var.R3;
                    if (g2Var5 != null) {
                        g2Var5.h();
                    }
                    t3Var.post(new y2(t3Var, aVar2, 0));
                }
            }
        }
    }
}
