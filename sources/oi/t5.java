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
import org.telegram.ui.Components.z41;
public final class t5 implements d1 {
    public final z5 f22378a;

    public t5(z5 z5Var) {
        this.f22378a = z5Var;
    }

    @Override
    public final void A(int i7, int i10) {
        e2 e2Var;
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && z5Var.f22565y != null && (e2Var = ((c3) w5Var).f21970a.R3) != null) {
            e2Var.f(i7, i10);
        }
    }

    @Override
    public final void E0() {
        a aVar;
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && (aVar = z5Var.f22565y) != null) {
            s3.U1(((c3) w5Var).f21970a, aVar, true);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        a aVar;
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && (aVar = z5Var.f22565y) != null) {
            return ((c3) w5Var).f21970a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean J(e1 e1Var) {
        a aVar;
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || (aVar = z5Var.f22565y) == null) {
            return false;
        }
        return s3.U1(((c3) w5Var).f21970a, aVar, false);
    }

    @Override
    public final void b1(CharSequence charSequence) {
        w5 w5Var = this.f22378a.E;
        if (w5Var != null) {
            c3 c3Var = (c3) w5Var;
            if (charSequence != null && charSequence.length() > 0) {
                c3Var.f21970a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean d2(e1 e1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && (aVar = z5Var.f22565y) != null) {
            s3 s3Var = ((c3) w5Var).f21970a;
            ClipboardManager clipboardManager = (ClipboardManager) s3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = s3Var.z4(a4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !s3.I3((a) z42.get(0))) && (indexOf = s3Var.f22342t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(e1Var.getSelectionStart(), e1Var.getSelectionEnd()));
                                boolean L4 = s3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(e1Var.getSelectionStart(), e1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    s3Var.f22344u3.putAll(hashMap);
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
    public final void e(e1 e1Var) {
        w5 w5Var = this.f22378a.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).f21970a;
            s3.Q1(s3Var, e1Var);
            s3Var.f22334p3.k(e1Var, true);
        }
    }

    @Override
    public final boolean o() {
        z5 z5Var = this.f22378a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && z5Var.f22565y != null) {
            return ((c3) w5Var).f21970a.V4();
        }
        return false;
    }

    @Override
    public final void r1(e1 e1Var, int i7, int i10) {
        w5 w5Var;
        j9 textSelectionHelper;
        z5 z5Var = this.f22378a;
        if (!z5Var.G && i7 != i10 && (w5Var = z5Var.E) != null && (textSelectionHelper = ((c3) w5Var).f21970a.getTextSelectionHelper()) != null) {
            z5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 5));
        }
    }

    @Override
    public final void s1(Editable editable) {
        a aVar;
        z5 z5Var = this.f22378a;
        if (z5Var.f22565y != null) {
            z5Var.E(editable);
            z5Var.K();
            z5.d(z5Var.f22565y.f21907b, editable);
            z5Var.C();
            z5Var.G();
            int i7 = 0;
            if (z5Var.o() && !z5Var.l()) {
                ((TL_iv.pageBlockBlockquote) z5Var.f22565y.f21907b).collapsed = false;
            }
            z5Var.H();
            w5 w5Var = z5Var.E;
            if (w5Var != null) {
                s3 s3Var = ((c3) w5Var).f21970a;
                e2 e2Var = s3Var.R3;
                if (e2Var != null) {
                    e2Var.g();
                }
                s3Var.f22334p3.onContentChanged();
            }
            w5 w5Var2 = z5Var.E;
            if (w5Var2 != null) {
                ((c3) w5Var2).f21970a.f22334p3.a0(z5Var, z5.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = z5Var.f22565y;
            if (aVar2 != null && obj != null && aVar2.f21908c == 0 && (aVar2.f21907b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i7 = 6;
            }
            if (i7 != 0 && z5Var.E != null) {
                z5Var.post(new ai.a1(this, z5Var.f22565y, i7, 25));
            } else {
                y5 s5 = z5.s(editable.toString(), z5Var.f22565y);
                if (s5 != null && z5Var.E != null) {
                    z5Var.post(new kg.i0(this, z5Var.f22565y, s5, 17));
                }
            }
            if (!z5Var.W && ((aVar = z5Var.f22565y) == null || !(aVar.f21907b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            z5Var.invalidate();
        }
    }

    @Override
    public final void x0(e1 e1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i7;
        e1 editText;
        Editable text;
        z5 z5Var = this.f22378a;
        if (z5Var.E != null && z5Var.f22565y != null) {
            String obj = e1Var.getText().toString();
            ((c3) z5Var.E).f21970a.f22334p3.a0(z5Var, null);
            String b10 = z5.b(obj);
            if (b10 != null) {
                ArrayList a10 = j0.a(b10);
                if (!a10.isEmpty()) {
                    z5Var.D((j0) a10.get(0));
                    return;
                }
            }
            int q10 = z5.q(e1Var.getText().toString());
            if (q10 != 0) {
                ((c3) z5Var.E).c(z5Var.f22565y, q10);
                return;
            }
            y5 r10 = z5.r(e1Var.getText().toString(), z5Var.f22565y);
            if (r10 != null) {
                ((c3) z5Var.E).d(z5Var.f22565y, r10.f22504a, r10.f22505b, r10.f22506c, r10.d, r10.f22507e);
            } else if ((z5Var.f22565y.f21907b instanceof TL_iv.pageBlockPullquote) && z5Var.f22559f.length() > 0) {
                z5Var.h();
            } else {
                w5 w5Var = z5Var.E;
                a aVar = z5Var.f22565y;
                s3 s3Var = ((c3) w5Var).f21970a;
                ArrayList arrayList = s3Var.f22351x4;
                z41 z41Var = s3Var.f34607g3;
                ArrayList arrayList2 = s3Var.f22342t3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    View C1 = s3Var.C1(aVar);
                    boolean z12 = C1 instanceof z5;
                    if (z12) {
                        e1 editText2 = ((z5) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = z5.A(aVar.f21907b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f21914k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f21914k;
                            arrayList3.remove(arrayList3.size() - 1);
                            s3Var.v4();
                            z41Var.O(false);
                            e2 e2Var2 = s3Var.R3;
                            if (e2Var2 != null) {
                                e2Var2.h();
                            }
                            s3Var.post(new l2(s3Var, aVar, 27));
                            return;
                        } else if (aVar.f21908c > 0) {
                            s3Var.w2(indexOf);
                            s3Var.v4();
                            z41Var.O(false);
                            e2 e2Var3 = s3Var.R3;
                            if (e2Var3 != null) {
                                e2Var3.h();
                            }
                            s3Var.post(new l2(s3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f21907b;
                    ArrayList arrayList4 = aVar.f21914k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = l0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f21907b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            s3Var.f22344u3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f21907b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    z5.d(aVar.f21907b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    z5.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f21908c, i10);
                    aVar2.f21909e = aVar.f21909e;
                    aVar2.f21914k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    s3Var.v4();
                    if (z11) {
                        z41Var.O(false);
                        e2 e2Var4 = s3Var.R3;
                        if (e2Var4 != null) {
                            e2Var4.h();
                        }
                        s3Var.post(new l2(s3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((z5) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f22011i2 = z10;
                        text.delete(length, text.length());
                        editText.f22011i2 = false;
                    }
                    z41Var.T();
                    s3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        z41Var.f();
                    } else {
                        v4.n0 itemAnimator = s3Var.getItemAnimator();
                        s3Var.setItemAnimator(null);
                        z41Var.i(indexOf2);
                        if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                            z41Var.k(i7, (arrayList.size() - indexOf2) - 1);
                        }
                        s3Var.post(new w2(s3Var, itemAnimator, 0));
                    }
                    e2 e2Var5 = s3Var.R3;
                    if (e2Var5 != null) {
                        e2Var5.h();
                    }
                    s3Var.post(new x2(s3Var, aVar2, 0));
                }
            }
        }
    }
}
