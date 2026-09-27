package ii;

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
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.l61;
public final class y5 implements h1 {
    public final e6 f11782a;

    public y5(e6 e6Var) {
        this.f11782a = e6Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        b6 b6Var;
        q9 textSelectionHelper;
        e6 e6Var = this.f11782a;
        if (!e6Var.F && i10 != i11 && (b6Var = e6Var.f11358y) != null && (textSelectionHelper = ((f3) b6Var).f11366a.getTextSelectionHelper()) != null) {
            e6Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void L(CharSequence charSequence) {
        b6 b6Var = this.f11782a.f11358y;
        if (b6Var != null) {
            f3 f3Var = (f3) b6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f11366a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void U(Editable editable) {
        a aVar;
        e6 e6Var = this.f11782a;
        if (e6Var.f11357x != null) {
            e6Var.E(editable);
            e6Var.J();
            e6.d(e6Var.f11357x.f11194b, editable);
            e6Var.C();
            e6Var.G();
            int i10 = 0;
            if (e6Var.o() && !e6Var.l()) {
                ((TL_iv.pageBlockBlockquote) e6Var.f11357x.f11194b).collapsed = false;
            }
            e6Var.H();
            b6 b6Var = e6Var.f11358y;
            if (b6Var != null) {
                x3 x3Var = ((f3) b6Var).f11366a;
                i2 i2Var = x3Var.J3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f11731h3.onContentChanged();
            }
            b6 b6Var2 = e6Var.f11358y;
            if (b6Var2 != null) {
                ((f3) b6Var2).f11366a.f11731h3.g(e6Var, e6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = e6Var.f11357x;
            if (aVar2 != null && obj != null && aVar2.f11195c == 0 && (aVar2.f11194b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && e6Var.f11358y != null) {
                e6Var.post(new ai.s1(this, e6Var.f11357x, i10, 15));
            } else {
                d6 s10 = e6.s(e6Var.f11357x, editable.toString());
                if (s10 != null && e6Var.f11358y != null) {
                    e6Var.post(new gg.t(this, e6Var.f11357x, s10, 18));
                }
            }
            if (!e6Var.T && ((aVar = e6Var.f11357x) == null || !(aVar.f11194b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            e6Var.invalidate();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        a aVar;
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var != null && (aVar = e6Var.f11357x) != null) {
            return ((f3) b6Var).f11366a.X3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        b6 b6Var = this.f11782a.f11358y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).f11366a;
            x3.N1(x3Var, i1Var);
            x3Var.f11731h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var != null && e6Var.f11357x != null) {
            return ((f3) b6Var).f11366a.T4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        i2 i2Var;
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var != null && e6Var.f11357x != null && (i2Var = ((f3) b6Var).f11366a.J3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void m(i1 i1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        e6 e6Var = this.f11782a;
        if (e6Var.f11358y != null && e6Var.f11357x != null) {
            String obj = i1Var.getText().toString();
            ((f3) e6Var.f11358y).f11366a.f11731h3.g(e6Var, null);
            String b10 = e6.b(obj);
            if (b10 != null) {
                ArrayList a2 = o0.a(b10);
                if (!a2.isEmpty()) {
                    e6Var.D((o0) a2.get(0));
                    return;
                }
            }
            int q6 = e6.q(i1Var.getText().toString());
            if (q6 != 0) {
                ((f3) e6Var.f11358y).c(e6Var.f11357x, q6);
                return;
            }
            d6 r10 = e6.r(e6Var.f11357x, i1Var.getText().toString());
            if (r10 != null) {
                ((f3) e6Var.f11358y).d(e6Var.f11357x, r10.f11300a, r10.f11301b, r10.f11302c, r10.d, r10.e);
            } else if ((e6Var.f11357x.f11194b instanceof TL_iv.pageBlockPullquote) && e6Var.f11352f.length() > 0) {
                e6Var.i();
            } else {
                b6 b6Var = e6Var.f11358y;
                a aVar = e6Var.f11357x;
                x3 x3Var = ((f3) b6Var).f11366a;
                ArrayList arrayList = x3Var.f11746p4;
                l61 l61Var = x3Var.Y2;
                ArrayList arrayList2 = x3Var.f11738l3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    View A1 = x3Var.A1(aVar);
                    boolean z11 = A1 instanceof e6;
                    if (z11) {
                        i1 editText2 = ((e6) A1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = e6.A(aVar.f11194b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f11200k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f11200k;
                            arrayList3.remove(arrayList3.size() - 1);
                            x3Var.t4();
                            l61Var.N(false);
                            i2 i2Var2 = x3Var.J3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 27));
                            return;
                        } else if (aVar.f11195c > 0) {
                            x3Var.u2(indexOf);
                            x3Var.t4();
                            l61Var.N(false);
                            i2 i2Var3 = x3Var.J3;
                            if (i2Var3 != null) {
                                i2Var3.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f11194b;
                    ArrayList arrayList4 = aVar.f11200k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = q0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f11194b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            x3Var.f11739m3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f11194b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e6.d(aVar.f11194b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    e6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f11195c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f11200k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    x3Var.t4();
                    if (z10) {
                        l61Var.N(false);
                        i2 i2Var4 = x3Var.J3;
                        if (i2Var4 != null) {
                            i2Var4.h();
                        }
                        x3Var.post(new p2(x3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((e6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    l61Var.S();
                    x3Var.q4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        l61Var.l();
                    } else {
                        s4.m0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        l61Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            l61Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 0));
                    }
                    i2 i2Var5 = x3Var.J3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    x3Var.post(new a3(x3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var != null && (aVar = e6Var.f11357x) != null) {
            x3 x3Var = ((f3) b6Var).f11366a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = x3Var.x4(e4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !x3.G3((a) x42.get(0))) && (indexOf = x3Var.f11738l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean J4 = x3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    x3Var.f11739m3.putAll(hashMap);
                                }
                                return J4;
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
    public final boolean t(i1 i1Var) {
        a aVar;
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var == null || (aVar = e6Var.f11357x) == null) {
            return false;
        }
        return x3.R1(((f3) b6Var).f11366a, aVar, false);
    }

    @Override
    public final void x() {
        a aVar;
        e6 e6Var = this.f11782a;
        b6 b6Var = e6Var.f11358y;
        if (b6Var != null && (aVar = e6Var.f11357x) != null) {
            x3.R1(((f3) b6Var).f11366a, aVar, true);
        }
    }
}
