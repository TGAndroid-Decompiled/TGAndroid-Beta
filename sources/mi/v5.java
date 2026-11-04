package mi;

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
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.f41;
public final class v5 implements g1 {
    public final b6 f19986a;

    public v5(b6 b6Var) {
        this.f19986a = b6Var;
    }

    @Override
    public final void A(int i3, int i10) {
        g2 g2Var;
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && b6Var.f19491y != null && (g2Var = ((d3) y5Var).f19561a.R3) != null) {
            g2Var.f(i3, i10);
        }
    }

    @Override
    public final void B1(Editable editable) {
        a aVar;
        b6 b6Var = this.f19986a;
        if (b6Var.f19491y != null) {
            b6Var.E(editable);
            b6Var.K();
            b6.d(b6Var.f19491y.f19431b, editable);
            b6Var.C();
            b6Var.G();
            int i3 = 0;
            if (b6Var.o() && !b6Var.l()) {
                ((TL_iv.pageBlockBlockquote) b6Var.f19491y.f19431b).collapsed = false;
            }
            b6Var.H();
            y5 y5Var = b6Var.E;
            if (y5Var != null) {
                t3 t3Var = ((d3) y5Var).f19561a;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.g();
                }
                t3Var.f19916p3.onContentChanged();
            }
            y5 y5Var2 = b6Var.E;
            if (y5Var2 != null) {
                ((d3) y5Var2).f19561a.f19916p3.Z0(b6Var, b6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = b6Var.f19491y;
            if (aVar2 != null && obj != null && aVar2.f19432c == 0 && (aVar2.f19431b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i3 = 6;
            }
            if (i3 != 0 && b6Var.E != null) {
                b6Var.post(new ai.e3(this, b6Var.f19491y, i3, 22));
            } else {
                a6 s6 = b6.s(editable.toString(), b6Var.f19491y);
                if (s6 != null && b6Var.E != null) {
                    b6Var.post(new lg.y(this, b6Var.f19491y, s6, 10));
                }
            }
            if (!b6Var.W && ((aVar = b6Var.f19491y) == null || !(aVar.f19431b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            b6Var.invalidate();
        }
    }

    @Override
    public final boolean M0(h1 h1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && (aVar = b6Var.f19491y) != null) {
            t3 t3Var = ((d3) y5Var).f19561a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.f19924t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(h1Var.getSelectionStart(), h1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(h1Var.getSelectionStart(), h1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.f19926u3.putAll(hashMap);
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
    public final void V0(h1 h1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i3;
        h1 editText;
        Editable text;
        b6 b6Var = this.f19986a;
        if (b6Var.E != null && b6Var.f19491y != null) {
            String obj = h1Var.getText().toString();
            ((d3) b6Var.E).f19561a.f19916p3.Z0(b6Var, null);
            String b10 = b6.b(obj);
            if (b10 != null) {
                ArrayList a10 = m0.a(b10);
                if (!a10.isEmpty()) {
                    b6Var.D((m0) a10.get(0));
                    return;
                }
            }
            int q10 = b6.q(h1Var.getText().toString());
            if (q10 != 0) {
                ((d3) b6Var.E).c(b6Var.f19491y, q10);
                return;
            }
            a6 r5 = b6.r(h1Var.getText().toString(), b6Var.f19491y);
            if (r5 != null) {
                ((d3) b6Var.E).d(b6Var.f19491y, r5.f19463a, r5.f19464b, r5.f19465c, r5.d, r5.f19466e);
            } else if ((b6Var.f19491y.f19431b instanceof TL_iv.pageBlockPullquote) && b6Var.f19485f.length() > 0) {
                b6Var.h();
            } else {
                y5 y5Var = b6Var.E;
                a aVar = b6Var.f19491y;
                t3 t3Var = ((d3) y5Var).f19561a;
                ArrayList arrayList = t3Var.f19933x4;
                f41 f41Var = t3Var.f35594g3;
                ArrayList arrayList2 = t3Var.f19924t3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    View C1 = t3Var.C1(aVar);
                    boolean z12 = C1 instanceof b6;
                    if (z12) {
                        h1 editText2 = ((b6) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = b6.A(aVar.f19431b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f19438k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f19438k;
                            arrayList3.remove(arrayList3.size() - 1);
                            t3Var.v4();
                            f41Var.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.post(new n2(t3Var, aVar, 27));
                            return;
                        } else if (aVar.f19432c > 0) {
                            t3Var.w2(indexOf);
                            t3Var.v4();
                            f41Var.O(false);
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
                    TL_iv.PageBlock pageBlock = aVar.f19431b;
                    ArrayList arrayList4 = aVar.f19438k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = o0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f19431b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            t3Var.f19926u3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f19431b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    b6.d(aVar.f19431b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    b6.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f19432c, i10);
                    aVar2.f19433e = aVar.f19433e;
                    aVar2.f19438k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    t3Var.v4();
                    if (z11) {
                        f41Var.O(false);
                        g2 g2Var4 = t3Var.R3;
                        if (g2Var4 != null) {
                            g2Var4.h();
                        }
                        t3Var.post(new n2(t3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((b6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f19648d2 = z10;
                        text.delete(length, text.length());
                        editText.f19648d2 = false;
                    }
                    f41Var.T();
                    t3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        f41Var.f();
                    } else {
                        u4.m0 itemAnimator = t3Var.getItemAnimator();
                        t3Var.setItemAnimator(null);
                        f41Var.i(indexOf2);
                        if (aVar.d > 0 && (i3 = indexOf2 + 1) < arrayList.size()) {
                            f41Var.k(i3, (arrayList.size() - indexOf2) - 1);
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
    public final boolean X1(boolean z10) {
        a aVar;
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && (aVar = b6Var.f19491y) != null) {
            return ((d3) y5Var).f19561a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean c0(h1 h1Var) {
        a aVar;
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var == null || (aVar = b6Var.f19491y) == null) {
            return false;
        }
        return t3.U1(((d3) y5Var).f19561a, aVar, false);
    }

    @Override
    public final void f(h1 h1Var) {
        y5 y5Var = this.f19986a.E;
        if (y5Var != null) {
            t3 t3Var = ((d3) y5Var).f19561a;
            t3.Q1(t3Var, h1Var);
            t3Var.f19916p3.E(h1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        y5 y5Var = this.f19986a.E;
        if (y5Var != null) {
            d3 d3Var = (d3) y5Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f19561a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void l(h1 h1Var, int i3, int i10) {
        y5 y5Var;
        h9 textSelectionHelper;
        b6 b6Var = this.f19986a;
        if (!b6Var.G && i3 != i10 && (y5Var = b6Var.E) != null && (textSelectionHelper = ((d3) y5Var).f19561a.getTextSelectionHelper()) != null) {
            b6Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 5));
        }
    }

    @Override
    public final boolean m() {
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && b6Var.f19491y != null) {
            return ((d3) y5Var).f19561a.V4();
        }
        return false;
    }

    @Override
    public final void w0() {
        a aVar;
        b6 b6Var = this.f19986a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && (aVar = b6Var.f19491y) != null) {
            t3.U1(((d3) y5Var).f19561a, aVar, true);
        }
    }
}
