package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.f8;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.p51;
public final class k6 implements m1 {
    public final q6 f3173a;

    public k6(q6 q6Var) {
        this.f3173a = q6Var;
    }

    @Override
    public final void B(Editable editable) {
        a aVar;
        q6 q6Var = this.f3173a;
        if (q6Var.f3309y != null) {
            q6Var.E(editable);
            q6Var.K();
            q6.d(q6Var.f3309y.f2818b, editable);
            q6Var.C();
            q6Var.G();
            int i10 = 0;
            if (q6Var.o() && !q6Var.l()) {
                ((TL_iv.pageBlockBlockquote) q6Var.f3309y.f2818b).collapsed = false;
            }
            q6Var.H();
            n6 n6Var = q6Var.D;
            if (n6Var != null) {
                d4 d4Var = ((m3) n6Var).f3203a;
                o2 o2Var = d4Var.Q3;
                if (o2Var != null) {
                    o2Var.g();
                }
                d4Var.f2938o3.onContentChanged();
            }
            n6 n6Var2 = q6Var.D;
            if (n6Var2 != null) {
                ((m3) n6Var2).f3203a.f2938o3.D(q6Var, q6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = q6Var.f3309y;
            if (aVar2 != null && obj != null && aVar2.f2819c == 0 && (aVar2.f2818b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && q6Var.D != null) {
                q6Var.post(new ag.o0(this, q6Var.f3309y, i10, 2));
            } else {
                p6 s10 = q6.s(q6Var.f3309y, editable.toString());
                if (s10 != null && q6Var.D != null) {
                    q6Var.post(new a3.l0(this, q6Var.f3309y, s10, 15));
                }
            }
            if (!q6Var.V && ((aVar = q6Var.f3309y) == null || !(aVar.f2818b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            q6Var.invalidate();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        a aVar;
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && (aVar = q6Var.f3309y) != null) {
            return ((m3) n6Var).f3203a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean I(n1 n1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && (aVar = q6Var.f3309y) != null) {
            d4 d4Var = ((m3) n6Var).f3203a;
            ClipboardManager clipboardManager = (ClipboardManager) d4Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = d4Var.z4(l4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !d4.I3((a) z42.get(0))) && (indexOf = d4Var.f2946s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(n1Var.getSelectionStart(), n1Var.getSelectionEnd()));
                                boolean L4 = d4Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(n1Var.getSelectionStart(), n1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    d4Var.f2948t3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final void b(n1 n1Var) {
        n6 n6Var = this.f3173a.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).f3203a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    @Override
    public final void e(n1 n1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i10;
        n1 editText;
        Editable text;
        q6 q6Var = this.f3173a;
        if (q6Var.D != null && q6Var.f3309y != null) {
            String obj = n1Var.getText().toString();
            ((m3) q6Var.D).f3203a.f2938o3.D(q6Var, null);
            String b10 = q6.b(obj);
            if (b10 != null) {
                ArrayList a2 = p0.a(b10);
                if (!a2.isEmpty()) {
                    q6Var.D((p0) a2.get(0));
                    return;
                }
            }
            int q6 = q6.q(n1Var.getText().toString());
            if (q6 != 0) {
                ((m3) q6Var.D).c(q6Var.f3309y, q6);
                return;
            }
            p6 r10 = q6.r(q6Var.f3309y, n1Var.getText().toString());
            if (r10 != null) {
                ((m3) q6Var.D).d(q6Var.f3309y, r10.f3286a, r10.f3287b, r10.f3288c, r10.d, r10.e);
            } else if ((q6Var.f3309y.f2818b instanceof TL_iv.pageBlockPullquote) && q6Var.f3303f.length() > 0) {
                q6Var.i();
            } else {
                n6 n6Var = q6Var.D;
                a aVar = q6Var.f3309y;
                d4 d4Var = ((m3) n6Var).f3203a;
                ArrayList arrayList = d4Var.f2955w4;
                p51 p51Var = d4Var.f30819f3;
                ArrayList arrayList2 = d4Var.f2946s3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    View C1 = d4Var.C1(aVar);
                    boolean z12 = C1 instanceof q6;
                    if (z12) {
                        n1 editText2 = ((q6) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = q6.A(aVar.f2818b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f2824k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f2824k;
                            arrayList3.remove(arrayList3.size() - 1);
                            d4Var.v4();
                            p51Var.O(false);
                            o2 o2Var2 = d4Var.Q3;
                            if (o2Var2 != null) {
                                o2Var2.h();
                            }
                            d4Var.post(new v2(d4Var, aVar, 27));
                            return;
                        } else if (aVar.f2819c > 0) {
                            d4Var.w2(indexOf);
                            d4Var.v4();
                            p51Var.O(false);
                            o2 o2Var3 = d4Var.Q3;
                            if (o2Var3 != null) {
                                o2Var3.h();
                            }
                            d4Var.post(new v2(d4Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f2818b;
                    ArrayList arrayList4 = aVar.f2824k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = r0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f2818b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            d4Var.f2948t3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f2818b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    q6.d(aVar.f2818b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    q6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f2819c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f2824k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    d4Var.v4();
                    if (z11) {
                        p51Var.O(false);
                        o2 o2Var4 = d4Var.Q3;
                        if (o2Var4 != null) {
                            o2Var4.h();
                        }
                        d4Var.post(new v2(d4Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((q6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f3218c2 = z10;
                        text.delete(length, text.length());
                        editText.f3218c2 = false;
                    }
                    p51Var.T();
                    d4Var.s4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        p51Var.f();
                    } else {
                        s4.l0 itemAnimator = d4Var.getItemAnimator();
                        d4Var.setItemAnimator(null);
                        p51Var.i(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            p51Var.k(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        d4Var.post(new g3(d4Var, itemAnimator, 0));
                    }
                    o2 o2Var5 = d4Var.Q3;
                    if (o2Var5 != null) {
                        o2Var5.h();
                    }
                    d4Var.post(new h3(d4Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean f() {
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && q6Var.f3309y != null) {
            return ((m3) n6Var).f3203a.V4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        o2 o2Var;
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && q6Var.f3309y != null && (o2Var = ((m3) n6Var).f3203a.Q3) != null) {
            o2Var.f(i10, i11);
        }
    }

    @Override
    public final void i(n1 n1Var, int i10, int i11) {
        n6 n6Var;
        k9 textSelectionHelper;
        q6 q6Var = this.f3173a;
        if (!q6Var.F && i10 != i11 && (n6Var = q6Var.D) != null && (textSelectionHelper = ((m3) n6Var).f3203a.getTextSelectionHelper()) != null) {
            q6Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public final void r() {
        a aVar;
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && (aVar = q6Var.f3309y) != null) {
            d4.T1(((m3) n6Var).f3203a, aVar, true);
        }
    }

    @Override
    public final void w(CharSequence charSequence) {
        n6 n6Var = this.f3173a.D;
        if (n6Var != null) {
            m3 m3Var = (m3) n6Var;
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f3203a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean x(n1 n1Var) {
        a aVar;
        q6 q6Var = this.f3173a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || (aVar = q6Var.f3309y) == null) {
            return false;
        }
        return d4.T1(((m3) n6Var).f3203a, aVar, false);
    }
}
