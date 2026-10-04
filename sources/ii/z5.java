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
import org.telegram.ui.Components.u61;
public final class z5 implements h1 {
    public final f6 f12835a;

    public z5(f6 f6Var) {
        this.f12835a = f6Var;
    }

    @Override
    public final void B(Editable editable) {
        a aVar;
        f6 f6Var = this.f12835a;
        if (f6Var.f12376x != null) {
            f6Var.E(editable);
            f6Var.J();
            f6.d(f6Var.f12376x.f12186b, editable);
            f6Var.C();
            f6Var.G();
            int i10 = 0;
            if (f6Var.o() && !f6Var.l()) {
                ((TL_iv.pageBlockBlockquote) f6Var.f12376x.f12186b).collapsed = false;
            }
            f6Var.H();
            c6 c6Var = f6Var.f12377y;
            if (c6Var != null) {
                x3 x3Var = ((f3) c6Var).f12361a;
                i2 i2Var = x3Var.Q3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f12769o3.onContentChanged();
            }
            c6 c6Var2 = f6Var.f12377y;
            if (c6Var2 != null) {
                ((f3) c6Var2).f12361a.f12769o3.o(f6Var, f6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = f6Var.f12376x;
            if (aVar2 != null && obj != null && aVar2.f12187c == 0 && (aVar2.f12186b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && f6Var.f12377y != null) {
                f6Var.post(new ai.s1(this, f6Var.f12376x, i10, 15));
            } else {
                e6 s10 = f6.s(f6Var.f12376x, editable.toString());
                if (s10 != null && f6Var.f12377y != null) {
                    f6Var.post(new gg.t(this, f6Var.f12376x, s10, 18));
                }
            }
            if (!f6Var.T && ((aVar = f6Var.f12376x) == null || !(aVar.f12186b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            f6Var.invalidate();
        }
    }

    @Override
    public final boolean G(boolean z10) {
        a aVar;
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && (aVar = f6Var.f12376x) != null) {
            return ((f3) c6Var).f12361a.Y3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void b(i1 i1Var) {
        c6 c6Var = this.f12835a.f12377y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).f12361a;
            x3.O1(x3Var, i1Var);
            x3Var.f12769o3.P(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && f6Var.f12376x != null) {
            return ((f3) c6Var).f12361a.U4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && f6Var.f12376x != null && (i2Var = ((f3) c6Var).f12361a.Q3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void l(i1 i1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        f6 f6Var = this.f12835a;
        if (f6Var.f12377y != null && f6Var.f12376x != null) {
            String obj = i1Var.getText().toString();
            ((f3) f6Var.f12377y).f12361a.f12769o3.o(f6Var, null);
            String b10 = f6.b(obj);
            if (b10 != null) {
                ArrayList a2 = o0.a(b10);
                if (!a2.isEmpty()) {
                    f6Var.D((o0) a2.get(0));
                    return;
                }
            }
            int q6 = f6.q(i1Var.getText().toString());
            if (q6 != 0) {
                ((f3) f6Var.f12377y).c(f6Var.f12376x, q6);
                return;
            }
            e6 r10 = f6.r(f6Var.f12376x, i1Var.getText().toString());
            if (r10 != null) {
                ((f3) f6Var.f12377y).d(f6Var.f12376x, r10.f12349a, r10.f12350b, r10.f12351c, r10.d, r10.f12352e);
            } else if ((f6Var.f12376x.f12186b instanceof TL_iv.pageBlockPullquote) && f6Var.f12371f.length() > 0) {
                f6Var.i();
            } else {
                c6 c6Var = f6Var.f12377y;
                a aVar = f6Var.f12376x;
                x3 x3Var = ((f3) c6Var).f12361a;
                ArrayList arrayList = x3Var.f12786w4;
                u61 u61Var = x3Var.f25244f3;
                ArrayList arrayList2 = x3Var.f12777s3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    i2 i2Var = x3Var.Q3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    View B1 = x3Var.B1(aVar);
                    boolean z11 = B1 instanceof f6;
                    if (z11) {
                        i1 editText2 = ((f6) B1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = f6.A(aVar.f12186b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f12193k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f12193k;
                            arrayList3.remove(arrayList3.size() - 1);
                            x3Var.u4();
                            u61Var.N(false);
                            i2 i2Var2 = x3Var.Q3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 27));
                            return;
                        } else if (aVar.f12187c > 0) {
                            x3Var.v2(indexOf);
                            x3Var.u4();
                            u61Var.N(false);
                            i2 i2Var3 = x3Var.Q3;
                            if (i2Var3 != null) {
                                i2Var3.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f12186b;
                    ArrayList arrayList4 = aVar.f12193k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = q0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f12186b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            x3Var.f12779t3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f12186b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f6.d(aVar.f12186b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    f6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f12187c, i11);
                    aVar2.f12188e = aVar.f12188e;
                    aVar2.f12193k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    x3Var.u4();
                    if (z10) {
                        u61Var.N(false);
                        i2 i2Var4 = x3Var.Q3;
                        if (i2Var4 != null) {
                            i2Var4.h();
                        }
                        x3Var.post(new p2(x3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((f6) B1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    u61Var.S();
                    x3Var.r4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        u61Var.l();
                    } else {
                        s4.m0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        u61Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            u61Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 0));
                    }
                    i2 i2Var5 = x3Var.Q3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    x3Var.post(new a3(x3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean n(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && (aVar = f6Var.f12376x) != null) {
            x3 x3Var = ((f3) c6Var).f12361a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList y42 = x3Var.y4(e4.z(htmlText, hashMap));
                            if (!y42.isEmpty() && ((y42.size() != 1 || !x3.H3((a) y42.get(0))) && (indexOf = x3Var.f12777s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean K4 = x3Var.K4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), y42);
                                if (K4 && !hashMap.isEmpty()) {
                                    x3Var.f12779t3.putAll(hashMap);
                                }
                                return K4;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final boolean p(i1 i1Var) {
        a aVar;
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var == null || (aVar = f6Var.f12376x) == null) {
            return false;
        }
        return x3.S1(((f3) c6Var).f12361a, aVar, false);
    }

    @Override
    public final void r() {
        a aVar;
        f6 f6Var = this.f12835a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && (aVar = f6Var.f12376x) != null) {
            x3.S1(((f3) c6Var).f12361a, aVar, true);
        }
    }

    @Override
    public final void t(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        q9 textSelectionHelper;
        f6 f6Var = this.f12835a;
        if (!f6Var.F && i10 != i11 && (c6Var = f6Var.f12377y) != null && (textSelectionHelper = ((f3) c6Var).f12361a.getTextSelectionHelper()) != null) {
            f6Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void x(CharSequence charSequence) {
        c6 c6Var = this.f12835a.f12377y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f12361a.v4(charSequence.toString());
            }
        }
    }
}
