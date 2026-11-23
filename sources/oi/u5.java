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
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.b51;
public final class u5 implements e1 {
    public final a6 f22537a;

    public u5(a6 a6Var) {
        this.f22537a = a6Var;
    }

    @Override
    public final void A(f1 f1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i7;
        f1 editText;
        Editable text;
        a6 a6Var = this.f22537a;
        if (a6Var.E != null && a6Var.f22044y != null) {
            String obj = f1Var.getText().toString();
            ((d3) a6Var.E).f22122a.f22495p3.Q(a6Var, null);
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
                ((d3) a6Var.E).c(a6Var.f22044y, q10);
                return;
            }
            z5 r10 = a6.r(f1Var.getText().toString(), a6Var.f22044y);
            if (r10 != null) {
                ((d3) a6Var.E).d(a6Var.f22044y, r10.f22660a, r10.f22661b, r10.f22662c, r10.d, r10.f22663e);
            } else if ((a6Var.f22044y.f22001b instanceof TL_iv.pageBlockPullquote) && a6Var.f22038f.length() > 0) {
                a6Var.h();
            } else {
                x5 x5Var = a6Var.E;
                a aVar = a6Var.f22044y;
                t3 t3Var = ((d3) x5Var).f22122a;
                ArrayList arrayList = t3Var.f22512x4;
                b51 b51Var = t3Var.f35323g3;
                ArrayList arrayList2 = t3Var.f22503t3;
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
                        SpannableStringBuilder A = a6.A(aVar.f22001b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f22008k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f22008k;
                            arrayList3.remove(arrayList3.size() - 1);
                            t3Var.v4();
                            b51Var.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.post(new n2(t3Var, aVar, 27));
                            return;
                        } else if (aVar.f22002c > 0) {
                            t3Var.w2(indexOf);
                            t3Var.v4();
                            b51Var.O(false);
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
                    TL_iv.PageBlock pageBlock = aVar.f22001b;
                    ArrayList arrayList4 = aVar.f22008k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = m0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f22001b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            t3Var.f22505u3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f22001b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    a6.d(aVar.f22001b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    a6.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f22002c, i10);
                    aVar2.f22003e = aVar.f22003e;
                    aVar2.f22008k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    t3Var.v4();
                    if (z11) {
                        b51Var.O(false);
                        g2 g2Var4 = t3Var.R3;
                        if (g2Var4 != null) {
                            g2Var4.h();
                        }
                        t3Var.post(new n2(t3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((a6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f22170i2 = z10;
                        text.delete(length, text.length());
                        editText.f22170i2 = false;
                    }
                    b51Var.T();
                    t3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        b51Var.f();
                    } else {
                        v4.n0 itemAnimator = t3Var.getItemAnimator();
                        t3Var.setItemAnimator(null);
                        b51Var.i(indexOf2);
                        if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                            b51Var.k(i7, (arrayList.size() - indexOf2) - 1);
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

    @Override
    public final void F() {
        a aVar;
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f22044y) != null) {
            t3.U1(((d3) x5Var).f22122a, aVar, true);
        }
    }

    @Override
    public final void T(CharSequence charSequence) {
        x5 x5Var = this.f22537a.E;
        if (x5Var != null) {
            d3 d3Var = (d3) x5Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f22122a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void d(f1 f1Var) {
        x5 x5Var = this.f22537a.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).f22122a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22495p3.b(f1Var, true);
        }
    }

    @Override
    public final void e0(f1 f1Var, int i7, int i10) {
        x5 x5Var;
        i9 textSelectionHelper;
        a6 a6Var = this.f22537a;
        if (!a6Var.G && i7 != i10 && (x5Var = a6Var.E) != null && (textSelectionHelper = ((d3) x5Var).f22122a.getTextSelectionHelper()) != null) {
            a6Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 5));
        }
    }

    @Override
    public final void g0(Editable editable) {
        a aVar;
        a6 a6Var = this.f22537a;
        if (a6Var.f22044y != null) {
            a6Var.E(editable);
            a6Var.K();
            a6.d(a6Var.f22044y.f22001b, editable);
            a6Var.C();
            a6Var.G();
            int i7 = 0;
            if (a6Var.o() && !a6Var.l()) {
                ((TL_iv.pageBlockBlockquote) a6Var.f22044y.f22001b).collapsed = false;
            }
            a6Var.H();
            x5 x5Var = a6Var.E;
            if (x5Var != null) {
                t3 t3Var = ((d3) x5Var).f22122a;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.g();
                }
                t3Var.f22495p3.onContentChanged();
            }
            x5 x5Var2 = a6Var.E;
            if (x5Var2 != null) {
                ((d3) x5Var2).f22122a.f22495p3.Q(a6Var, a6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = a6Var.f22044y;
            if (aVar2 != null && obj != null && aVar2.f22002c == 0 && (aVar2.f22001b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i7 = 6;
            }
            if (i7 != 0 && a6Var.E != null) {
                a6Var.post(new ai.e1(this, a6Var.f22044y, i7, 24));
            } else {
                z5 s5 = a6.s(editable.toString(), a6Var.f22044y);
                if (s5 != null && a6Var.E != null) {
                    a6Var.post(new kg.x(this, a6Var.f22044y, s5, 19));
                }
            }
            if (!a6Var.W && ((aVar = a6Var.f22044y) == null || !(aVar.f22001b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            a6Var.invalidate();
        }
    }

    @Override
    public final boolean i() {
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f22044y != null) {
            return ((d3) x5Var).f22122a.V4();
        }
        return false;
    }

    @Override
    public final void m(int i7, int i10) {
        g2 g2Var;
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f22044y != null && (g2Var = ((d3) x5Var).f22122a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean m0(boolean z10) {
        a aVar;
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f22044y) != null) {
            return ((d3) x5Var).f22122a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean o(f1 f1Var) {
        a aVar;
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.f22044y) == null) {
            return false;
        }
        return t3.U1(((d3) x5Var).f22122a, aVar, false);
    }

    @Override
    public final boolean t0(f1 f1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        a6 a6Var = this.f22537a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f22044y) != null) {
            t3 t3Var = ((d3) x5Var).f22122a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.f22503t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(f1Var.getSelectionStart(), f1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(f1Var.getSelectionStart(), f1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.f22505u3.putAll(hashMap);
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
}
