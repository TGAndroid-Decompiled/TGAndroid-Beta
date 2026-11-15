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
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.p41;
public final class s5 implements d1 {
    public final y5 f21998a;

    public s5(y5 y5Var) {
        this.f21998a = y5Var;
    }

    @Override
    public final void B() {
        a aVar;
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && (aVar = y5Var.f22151y) != null) {
            q3.U1(((a3) v5Var).f21571a, aVar, true);
        }
    }

    @Override
    public final void I(CharSequence charSequence) {
        v5 v5Var = this.f21998a.E;
        if (v5Var != null) {
            a3 a3Var = (a3) v5Var;
            if (charSequence != null && charSequence.length() > 0) {
                a3Var.f21571a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void Z(e1 e1Var, int i7, int i10) {
        v5 v5Var;
        h9 textSelectionHelper;
        y5 y5Var = this.f21998a;
        if (!y5Var.G && i7 != i10 && (v5Var = y5Var.E) != null && (textSelectionHelper = ((a3) v5Var).f21571a.getTextSelectionHelper()) != null) {
            y5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 5));
        }
    }

    @Override
    public final void b0(Editable editable) {
        a aVar;
        y5 y5Var = this.f21998a;
        if (y5Var.f22151y != null) {
            y5Var.E(editable);
            y5Var.K();
            y5.d(y5Var.f22151y.f21544b, editable);
            y5Var.C();
            y5Var.G();
            int i7 = 0;
            if (y5Var.o() && !y5Var.l()) {
                ((TL_iv.pageBlockBlockquote) y5Var.f22151y.f21544b).collapsed = false;
            }
            y5Var.H();
            v5 v5Var = y5Var.E;
            if (v5Var != null) {
                q3 q3Var = ((a3) v5Var).f21571a;
                d2 d2Var = q3Var.R3;
                if (d2Var != null) {
                    d2Var.g();
                }
                q3Var.f21931p3.onContentChanged();
            }
            v5 v5Var2 = y5Var.E;
            if (v5Var2 != null) {
                ((a3) v5Var2).f21571a.f21931p3.M(y5Var, y5.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = y5Var.f22151y;
            if (aVar2 != null && obj != null && aVar2.f21545c == 0 && (aVar2.f21544b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i7 = 6;
            }
            if (i7 != 0 && y5Var.E != null) {
                y5Var.post(new ai.a1(this, y5Var.f22151y, i7, 24));
            } else {
                x5 s5 = y5.s(editable.toString(), y5Var.f22151y);
                if (s5 != null && y5Var.E != null) {
                    y5Var.post(new ki.n(this, y5Var.f22151y, s5, 13));
                }
            }
            if (!y5Var.W && ((aVar = y5Var.f22151y) == null || !(aVar.f21544b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            y5Var.invalidate();
        }
    }

    @Override
    public final void d(e1 e1Var) {
        v5 v5Var = this.f21998a.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).f21571a;
            q3.Q1(q3Var, e1Var);
            q3Var.f21931p3.b(e1Var, true);
        }
    }

    @Override
    public final boolean g() {
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && y5Var.f22151y != null) {
            return ((a3) v5Var).f21571a.V4();
        }
        return false;
    }

    @Override
    public final boolean h0(boolean z10) {
        a aVar;
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && (aVar = y5Var.f22151y) != null) {
            return ((a3) v5Var).f21571a.Z3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void m(int i7, int i10) {
        d2 d2Var;
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && y5Var.f22151y != null && (d2Var = ((a3) v5Var).f21571a.R3) != null) {
            d2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean o(e1 e1Var) {
        a aVar;
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || (aVar = y5Var.f22151y) == null) {
            return false;
        }
        return q3.U1(((a3) v5Var).f21571a, aVar, false);
    }

    @Override
    public final boolean q0(e1 e1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        y5 y5Var = this.f21998a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && (aVar = y5Var.f22151y) != null) {
            q3 q3Var = ((a3) v5Var).f21571a;
            ClipboardManager clipboardManager = (ClipboardManager) q3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = q3Var.z4(y3.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !q3.I3((a) z42.get(0))) && (indexOf = q3Var.f21939t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(e1Var.getSelectionStart(), e1Var.getSelectionEnd()));
                                boolean L4 = q3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(e1Var.getSelectionStart(), e1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    q3Var.f21941u3.putAll(hashMap);
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
    public final void z(e1 e1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i7;
        e1 editText;
        Editable text;
        y5 y5Var = this.f21998a;
        if (y5Var.E != null && y5Var.f22151y != null) {
            String obj = e1Var.getText().toString();
            ((a3) y5Var.E).f21571a.f21931p3.M(y5Var, null);
            String b10 = y5.b(obj);
            if (b10 != null) {
                ArrayList a10 = j0.a(b10);
                if (!a10.isEmpty()) {
                    y5Var.D((j0) a10.get(0));
                    return;
                }
            }
            int q10 = y5.q(e1Var.getText().toString());
            if (q10 != 0) {
                ((a3) y5Var.E).c(y5Var.f22151y, q10);
                return;
            }
            x5 r10 = y5.r(e1Var.getText().toString(), y5Var.f22151y);
            if (r10 != null) {
                ((a3) y5Var.E).d(y5Var.f22151y, r10.f22124a, r10.f22125b, r10.f22126c, r10.d, r10.f22127e);
            } else if ((y5Var.f22151y.f21544b instanceof TL_iv.pageBlockPullquote) && y5Var.f22145f.length() > 0) {
                y5Var.h();
            } else {
                v5 v5Var = y5Var.E;
                a aVar = y5Var.f22151y;
                q3 q3Var = ((a3) v5Var).f21571a;
                ArrayList arrayList = q3Var.f21948x4;
                p41 p41Var = q3Var.f39892g3;
                ArrayList arrayList2 = q3Var.f21939t3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    View C1 = q3Var.C1(aVar);
                    boolean z12 = C1 instanceof y5;
                    if (z12) {
                        e1 editText2 = ((y5) C1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = y5.A(aVar.f21544b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f21551k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f21551k;
                            arrayList3.remove(arrayList3.size() - 1);
                            q3Var.v4();
                            p41Var.O(false);
                            d2 d2Var2 = q3Var.R3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                            q3Var.post(new k2(q3Var, aVar, 27));
                            return;
                        } else if (aVar.f21545c > 0) {
                            q3Var.w2(indexOf);
                            q3Var.v4();
                            p41Var.O(false);
                            d2 d2Var3 = q3Var.R3;
                            if (d2Var3 != null) {
                                d2Var3.h();
                            }
                            q3Var.post(new k2(q3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f21544b;
                    ArrayList arrayList4 = aVar.f21551k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a11 = l0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f21544b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            q3Var.f21941u3.put(Long.valueOf(a11), richText);
                        }
                        arrayList4.add(Long.valueOf(a11));
                        aVar.f21544b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    y5.d(aVar.f21544b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    y5.d(pageblockparagraph, subSequence2);
                    int i10 = aVar.d;
                    if (i10 > 0) {
                        i10++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f21545c, i10);
                    aVar2.f21546e = aVar.f21546e;
                    aVar2.f21551k.addAll(arrayList4);
                    int i11 = indexOf + 1;
                    arrayList2.add(i11, aVar2);
                    q3Var.v4();
                    if (z11) {
                        p41Var.O(false);
                        d2 d2Var4 = q3Var.R3;
                        if (d2Var4 != null) {
                            d2Var4.h();
                        }
                        q3Var.post(new k2(q3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((y5) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.f21657i2 = z10;
                        text.delete(length, text.length());
                        editText.f21657i2 = false;
                    }
                    p41Var.T();
                    q3Var.s4(i11);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        p41Var.f();
                    } else {
                        v4.m0 itemAnimator = q3Var.getItemAnimator();
                        q3Var.setItemAnimator(null);
                        p41Var.i(indexOf2);
                        if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                            p41Var.k(i7, (arrayList.size() - indexOf2) - 1);
                        }
                        q3Var.post(new u2(q3Var, itemAnimator, 0));
                    }
                    d2 d2Var5 = q3Var.R3;
                    if (d2Var5 != null) {
                        d2Var5.h();
                    }
                    q3Var.post(new v2(q3Var, aVar2, 0));
                }
            }
        }
    }
}
