package li;

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
import org.telegram.ui.Components.f41;
public final class u5 implements f1 {
    public final a6 f18922a;

    public u5(a6 a6Var) {
        this.f18922a = a6Var;
    }

    @Override
    public final boolean E(g1 g1Var) {
        a aVar;
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || (aVar = a6Var.f18432y) == null) {
            return false;
        }
        return t3.U1(((c3) x5Var).f18501a, aVar, false);
    }

    @Override
    public final void F(g1 g1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z9;
        boolean z10;
        int i7;
        g1 editText;
        Editable text;
        a6 a6Var = this.f18922a;
        if (a6Var.D != null && a6Var.f18432y != null) {
            String obj = g1Var.getText().toString();
            ((c3) a6Var.D).f18501a.f18887o3.o(a6Var, null);
            String b10 = a6.b(obj);
            if (b10 != null) {
                ArrayList a10 = l0.a(b10);
                if (!a10.isEmpty()) {
                    a6Var.D((l0) a10.get(0));
                    return;
                }
            }
            int q10 = a6.q(g1Var.getText().toString());
            if (q10 != 0) {
                ((c3) a6Var.D).c(a6Var.f18432y, q10);
                return;
            }
            z5 r10 = a6.r(g1Var.getText().toString(), a6Var.f18432y);
            if (r10 != null) {
                ((c3) a6Var.D).d(a6Var.f18432y, r10.f19045a, r10.f19046b, r10.f19047c, r10.d, r10.f19048e);
            } else if ((a6Var.f18432y.f18389b instanceof TL_iv.pageBlockPullquote) && a6Var.f18426f.length() > 0) {
                a6Var.h();
            } else {
                x5 x5Var = a6Var.D;
                a aVar = a6Var.f18432y;
                t3 t3Var = ((c3) x5Var).f18501a;
                ArrayList arrayList = t3Var.f18903w4;
                f41 f41Var = t3Var.f35167f3;
                ArrayList arrayList2 = t3Var.f18894s3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    View C1 = t3Var.C1(aVar);
                    boolean z11 = C1 instanceof a6;
                    if (z11) {
                        g1 editText2 = ((a6) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = a6.A(aVar.f18389b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f18396k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f18396k;
                            arrayList3.remove(arrayList3.size() - 1);
                            t3Var.v4();
                            f41Var.O(false);
                            f2 f2Var2 = t3Var.Q3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                            t3Var.post(new m2(t3Var, aVar, 27));
                            return;
                        } else if (aVar.f18390c > 0) {
                            t3Var.w2(indexOf);
                            t3Var.v4();
                            f41Var.O(false);
                            f2 f2Var3 = t3Var.Q3;
                            if (f2Var3 != null) {
                                f2Var3.h();
                            }
                            t3Var.post(new m2(t3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f18389b;
                    ArrayList arrayList4 = aVar.f18396k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = n0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f18389b).caption;
                        z9 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            t3Var.f18896t3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f18389b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z9 = true;
                        z10 = false;
                    }
                    a6.d(aVar.f18389b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    a6.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f18390c, i10);
                    aVar2.f18391e = aVar.f18391e;
                    aVar2.f18396k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    t3Var.v4();
                    if (z10) {
                        f41Var.O(false);
                        f2 f2Var4 = t3Var.Q3;
                        if (f2Var4 != null) {
                            f2Var4.h();
                        }
                        t3Var.post(new m2(t3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((a6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f18583c2 = z9;
                        text.delete(length, text.length());
                        editText.f18583c2 = false;
                    }
                    f41Var.T();
                    t3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        f41Var.f();
                    } else {
                        v4.l0 itemAnimator = t3Var.getItemAnimator();
                        t3Var.setItemAnimator(null);
                        f41Var.i(indexOf2);
                        if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                            f41Var.k(i7, (arrayList.size() - indexOf2) - 1);
                        }
                        t3Var.post(new w2(t3Var, itemAnimator, 0));
                    }
                    f2 f2Var5 = t3Var.Q3;
                    if (f2Var5 != null) {
                        f2Var5.h();
                    }
                    t3Var.post(new x2(t3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final void T0(CharSequence charSequence) {
        x5 x5Var = this.f18922a.D;
        if (x5Var != null) {
            c3 c3Var = (c3) x5Var;
            if (charSequence != null && charSequence.length() > 0) {
                c3Var.f18501a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void b(g1 g1Var) {
        x5 x5Var = this.f18922a.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).f18501a;
            t3.Q1(t3Var, g1Var);
            t3Var.f18887o3.r(g1Var, true);
        }
    }

    @Override
    public final void f1(Editable editable) {
        a aVar;
        a6 a6Var = this.f18922a;
        if (a6Var.f18432y != null) {
            a6Var.E(editable);
            a6Var.K();
            a6.d(a6Var.f18432y.f18389b, editable);
            a6Var.C();
            a6Var.G();
            int i7 = 0;
            if (a6Var.o() && !a6Var.l()) {
                ((TL_iv.pageBlockBlockquote) a6Var.f18432y.f18389b).collapsed = false;
            }
            a6Var.H();
            x5 x5Var = a6Var.D;
            if (x5Var != null) {
                t3 t3Var = ((c3) x5Var).f18501a;
                f2 f2Var = t3Var.Q3;
                if (f2Var != null) {
                    f2Var.g();
                }
                t3Var.f18887o3.onContentChanged();
            }
            x5 x5Var2 = a6Var.D;
            if (x5Var2 != null) {
                ((c3) x5Var2).f18501a.f18887o3.o(a6Var, a6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = a6Var.f18432y;
            if (aVar2 != null && obj != null && aVar2.f18390c == 0 && (aVar2.f18389b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i7 = 6;
            }
            if (i7 != 0 && a6Var.D != null) {
                a6Var.post(new ai.e0(this, a6Var.f18432y, i7, 21));
            } else {
                z5 s5 = a6.s(editable.toString(), a6Var.f18432y);
                if (s5 != null && a6Var.D != null) {
                    a6Var.post(new l2.z0(this, a6Var.f18432y, s5, 6));
                }
            }
            if (!a6Var.V && ((aVar = a6Var.f18432y) == null || !(aVar.f18389b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            a6Var.invalidate();
        }
    }

    @Override
    public final void l0(g1 g1Var, int i7, int i10) {
        x5 x5Var;
        i9 textSelectionHelper;
        a6 a6Var = this.f18922a;
        if (!a6Var.F && i7 != i10 && (x5Var = a6Var.D) != null && (textSelectionHelper = ((c3) x5Var).f18501a.getTextSelectionHelper()) != null) {
            a6Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 5));
        }
    }

    @Override
    public final boolean l1(boolean z9) {
        a aVar;
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && (aVar = a6Var.f18432y) != null) {
            return ((c3) x5Var).f18501a.Z3(aVar, z9);
        }
        return false;
    }

    @Override
    public final boolean m() {
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && a6Var.f18432y != null) {
            return ((c3) x5Var).f18501a.V4();
        }
        return false;
    }

    @Override
    public final void r0() {
        a aVar;
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && (aVar = a6Var.f18432y) != null) {
            t3.U1(((c3) x5Var).f18501a, aVar, true);
        }
    }

    @Override
    public final boolean s(g1 g1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && (aVar = a6Var.f18432y) != null) {
            t3 t3Var = ((c3) x5Var).f18501a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.f18894s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(g1Var.getSelectionStart(), g1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(g1Var.getSelectionStart(), g1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.f18896t3.putAll(hashMap);
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
    public final void w(int i7, int i10) {
        f2 f2Var;
        a6 a6Var = this.f18922a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && a6Var.f18432y != null && (f2Var = ((c3) x5Var).f18501a.Q3) != null) {
            f2Var.f(i7, i10);
        }
    }
}
