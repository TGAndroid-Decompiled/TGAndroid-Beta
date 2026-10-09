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
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.c71;
public final class z5 implements h1 {
    public final f6 f12882a;

    public z5(f6 f6Var) {
        this.f12882a = f6Var;
    }

    @Override
    public final void E(CharSequence charSequence) {
        c6 c6Var = this.f12882a.f12425y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f12411a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void L(Editable editable) {
        a aVar;
        f6 f6Var = this.f12882a;
        if (f6Var.f12424x != null) {
            f6Var.E(editable);
            f6Var.J();
            f6.d(f6Var.f12424x.f12234b, editable);
            f6Var.C();
            f6Var.G();
            int i10 = 0;
            if (f6Var.o() && !f6Var.l()) {
                ((TL_iv.pageBlockBlockquote) f6Var.f12424x.f12234b).collapsed = false;
            }
            f6Var.H();
            c6 c6Var = f6Var.f12425y;
            if (c6Var != null) {
                x3 x3Var = ((f3) c6Var).f12411a;
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f12809f3.onContentChanged();
            }
            c6 c6Var2 = f6Var.f12425y;
            if (c6Var2 != null) {
                ((f3) c6Var2).f12411a.f12809f3.i(f6Var, f6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = f6Var.f12424x;
            if (aVar2 != null && obj != null && aVar2.f12235c == 0 && (aVar2.f12234b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && f6Var.f12425y != null) {
                f6Var.post(new ai.s1(this, f6Var.f12424x, i10, 15));
            } else {
                e6 s10 = f6.s(f6Var.f12424x, editable.toString());
                if (s10 != null && f6Var.f12425y != null) {
                    f6Var.post(new gg.t(this, f6Var.f12424x, s10, 18));
                }
            }
            if (!f6Var.T && ((aVar = f6Var.f12424x) == null || !(aVar.f12234b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            f6Var.invalidate();
        }
    }

    @Override
    public final boolean N(boolean z10) {
        a aVar;
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var != null && (aVar = f6Var.f12424x) != null) {
            return ((f3) c6Var).f12411a.X3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        c6 c6Var = this.f12882a.f12425y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).f12411a;
            x3.N1(x3Var, i1Var);
            x3Var.f12809f3.r(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var != null && f6Var.f12424x != null) {
            return ((f3) c6Var).f12411a.T4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var != null && f6Var.f12424x != null && (i2Var = ((f3) c6Var).f12411a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void k(i1 i1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i10;
        i1 editText;
        Editable text;
        f6 f6Var = this.f12882a;
        if (f6Var.f12425y != null && f6Var.f12424x != null) {
            String obj = i1Var.getText().toString();
            ((f3) f6Var.f12425y).f12411a.f12809f3.i(f6Var, null);
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
                ((f3) f6Var.f12425y).c(f6Var.f12424x, q6);
                return;
            }
            e6 r10 = f6.r(f6Var.f12424x, i1Var.getText().toString());
            if (r10 != null) {
                ((f3) f6Var.f12425y).d(f6Var.f12424x, r10.f12399a, r10.f12400b, r10.f12401c, r10.d, r10.f12402e);
            } else if ((f6Var.f12424x.f12234b instanceof TL_iv.pageBlockPullquote) && f6Var.f12419f.length() > 0) {
                f6Var.i();
            } else {
                c6 c6Var = f6Var.f12425y;
                a aVar = f6Var.f12424x;
                x3 x3Var = ((f3) c6Var).f12411a;
                ArrayList arrayList = x3Var.f12824n4;
                c71 c71Var = x3Var.W2;
                ArrayList arrayList2 = x3Var.j3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    View A1 = x3Var.A1(aVar);
                    boolean z12 = A1 instanceof f6;
                    if (z12) {
                        i1 editText2 = ((f6) A1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = f6.A(aVar.f12234b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f12241k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f12241k;
                            arrayList3.remove(arrayList3.size() - 1);
                            x3Var.t4();
                            c71Var.N(false);
                            i2 i2Var2 = x3Var.H3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 27));
                            return;
                        } else if (aVar.f12235c > 0) {
                            x3Var.u2(indexOf);
                            x3Var.t4();
                            c71Var.N(false);
                            i2 i2Var3 = x3Var.H3;
                            if (i2Var3 != null) {
                                i2Var3.h();
                            }
                            x3Var.post(new p2(x3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f12234b;
                    ArrayList arrayList4 = aVar.f12241k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = q0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f12234b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            x3Var.f12818k3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f12234b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    f6.d(aVar.f12234b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    f6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f12235c, i11);
                    aVar2.f12236e = aVar.f12236e;
                    aVar2.f12241k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    x3Var.t4();
                    if (z11) {
                        c71Var.N(false);
                        i2 i2Var4 = x3Var.H3;
                        if (i2Var4 != null) {
                            i2Var4.h();
                        }
                        x3Var.post(new p2(x3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((f6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = z10;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    c71Var.S();
                    x3Var.q4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        c71Var.l();
                    } else {
                        s4.n0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        c71Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            c71Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 0));
                    }
                    i2 i2Var5 = x3Var.H3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    x3Var.post(new a3(x3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean m(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var != null && (aVar = f6Var.f12424x) != null) {
            x3 x3Var = ((f3) c6Var).f12411a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = x3Var.x4(f4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !x3.G3((a) x42.get(0))) && (indexOf = x3Var.j3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean J4 = x3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    x3Var.f12818k3.putAll(hashMap);
                                }
                                return J4;
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
    public final boolean r(i1 i1Var) {
        a aVar;
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var == null || (aVar = f6Var.f12424x) == null) {
            return false;
        }
        return x3.R1(((f3) c6Var).f12411a, aVar, false);
    }

    @Override
    public final void t() {
        a aVar;
        f6 f6Var = this.f12882a;
        c6 c6Var = f6Var.f12425y;
        if (c6Var != null && (aVar = f6Var.f12424x) != null) {
            x3.R1(((f3) c6Var).f12411a, aVar, true);
        }
    }

    @Override
    public final void x(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        o9 textSelectionHelper;
        f6 f6Var = this.f12882a;
        if (!f6Var.F && i10 != i11 && (c6Var = f6Var.f12425y) != null && (textSelectionHelper = ((f3) c6Var).f12411a.getTextSelectionHelper()) != null) {
            f6Var.post(new ei.w4(this, i1Var, i11, textSelectionHelper, i10, 5));
        }
    }
}
