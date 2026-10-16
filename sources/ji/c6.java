package ji;

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
import org.telegram.ui.Components.a71;
public final class c6 implements g1 {
    public final i6 f13192a;

    public c6(i6 i6Var) {
        this.f13192a = i6Var;
    }

    @Override
    public final void C(Editable editable) {
        a aVar;
        i6 i6Var = this.f13192a;
        if (i6Var.f13345x != null) {
            i6Var.E(editable);
            i6Var.J();
            i6.e(i6Var.f13345x.f13107b, editable);
            i6Var.C();
            i6Var.G();
            int i10 = 0;
            if (i6Var.o() && !i6Var.l()) {
                ((TL_iv.pageBlockBlockquote) i6Var.f13345x.f13107b).collapsed = false;
            }
            i6Var.H();
            f6 f6Var = i6Var.f13346y;
            if (f6Var != null) {
                x3 x3Var = ((f3) f6Var).f13271a;
                h2 h2Var = x3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                x3Var.f13630f3.onContentChanged();
            }
            f6 f6Var2 = i6Var.f13346y;
            if (f6Var2 != null) {
                ((f3) f6Var2).f13271a.f13630f3.i0(i6Var, i6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = i6Var.f13345x;
            if (aVar2 != null && obj != null && aVar2.f13108c == 0 && (aVar2.f13107b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && i6Var.f13346y != null) {
                i6Var.post(new ah.o(this, i6Var.f13345x, i10, 16));
            } else {
                h6 s10 = i6.s(editable.toString(), i6Var.f13345x);
                if (s10 != null && i6Var.f13346y != null) {
                    i6Var.post(new hg.t(this, i6Var.f13345x, s10, 19));
                }
            }
            if (!i6Var.T && ((aVar = i6Var.f13345x) == null || !(aVar.f13107b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            i6Var.invalidate();
        }
    }

    @Override
    public final boolean E(boolean z10) {
        a aVar;
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && (aVar = i6Var.f13345x) != null) {
            return ((f3) f6Var).f13271a.X3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        f6 f6Var = this.f13192a.f13346y;
        if (f6Var != null) {
            x3 x3Var = ((f3) f6Var).f13271a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public final boolean d() {
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && i6Var.f13345x != null) {
            return ((f3) f6Var).f13271a.T4();
        }
        return false;
    }

    @Override
    public final boolean e(h1 h1Var) {
        a aVar;
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var == null || (aVar = i6Var.f13345x) == null) {
            return false;
        }
        return x3.R1(((f3) f6Var).f13271a, aVar, false);
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && i6Var.f13345x != null && (h2Var = ((f3) f6Var).f13271a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean m(h1 h1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && (aVar = i6Var.f13345x) != null) {
            x3 x3Var = ((f3) f6Var).f13271a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = x3Var.x4(f4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !x3.G3((a) x42.get(0))) && (indexOf = x3Var.f13638j3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(h1Var.getSelectionStart(), h1Var.getSelectionEnd()));
                                boolean J4 = x3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(h1Var.getSelectionStart(), h1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    x3Var.f13640k3.putAll(hashMap);
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
    public final void q(h1 h1Var, int i10, int i11) {
        f6 f6Var;
        o9 textSelectionHelper;
        i6 i6Var = this.f13192a;
        if (!i6Var.F && i10 != i11 && (f6Var = i6Var.f13346y) != null && (textSelectionHelper = ((f3) f6Var).f13271a.getTextSelectionHelper()) != null) {
            i6Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void r() {
        a aVar;
        i6 i6Var = this.f13192a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && (aVar = i6Var.f13345x) != null) {
            x3.R1(((f3) f6Var).f13271a, aVar, true);
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        f6 f6Var = this.f13192a.f13346y;
        if (f6Var != null) {
            f3 f3Var = (f3) f6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f13271a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void z(h1 h1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i10;
        h1 editText;
        Editable text;
        i6 i6Var = this.f13192a;
        if (i6Var.f13346y != null && i6Var.f13345x != null) {
            String obj = h1Var.getText().toString();
            ((f3) i6Var.f13346y).f13271a.f13630f3.i0(i6Var, null);
            String b10 = i6.b(obj);
            if (b10 != null) {
                ArrayList a2 = n0.a(b10);
                if (!a2.isEmpty()) {
                    i6Var.D((n0) a2.get(0));
                    return;
                }
            }
            int q6 = i6.q(h1Var.getText().toString());
            if (q6 != 0) {
                ((f3) i6Var.f13346y).c(i6Var.f13345x, q6);
                return;
            }
            h6 r10 = i6.r(h1Var.getText().toString(), i6Var.f13345x);
            if (r10 != null) {
                ((f3) i6Var.f13346y).d(i6Var.f13345x, r10.f13316a, r10.f13317b, r10.f13318c, r10.d, r10.e);
            } else if ((i6Var.f13345x.f13107b instanceof TL_iv.pageBlockPullquote) && i6Var.f13340f.length() > 0) {
                i6Var.i();
            } else {
                f6 f6Var = i6Var.f13346y;
                a aVar = i6Var.f13345x;
                x3 x3Var = ((f3) f6Var).f13271a;
                ArrayList arrayList = x3Var.f13646n4;
                a71 a71Var = x3Var.W2;
                ArrayList arrayList2 = x3Var.f13638j3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    h2 h2Var = x3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    View A1 = x3Var.A1(aVar);
                    boolean z12 = A1 instanceof i6;
                    if (z12) {
                        h1 editText2 = ((i6) A1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = i6.A(aVar.f13107b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f13113k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f13113k;
                            arrayList3.remove(arrayList3.size() - 1);
                            x3Var.t4();
                            a71Var.N(false);
                            h2 h2Var2 = x3Var.H3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            x3Var.post(new o2(x3Var, aVar, 27));
                            return;
                        } else if (aVar.f13108c > 0) {
                            x3Var.u2(indexOf);
                            x3Var.t4();
                            a71Var.N(false);
                            h2 h2Var3 = x3Var.H3;
                            if (h2Var3 != null) {
                                h2Var3.h();
                            }
                            x3Var.post(new o2(x3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f13107b;
                    ArrayList arrayList4 = aVar.f13113k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = p0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f13107b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            x3Var.f13640k3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f13107b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    i6.e(aVar.f13107b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    i6.e(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f13108c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f13113k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    x3Var.t4();
                    if (z11) {
                        a71Var.N(false);
                        h2 h2Var4 = x3Var.H3;
                        if (h2Var4 != null) {
                            h2Var4.h();
                        }
                        x3Var.post(new o2(x3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((i6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = z10;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    a71Var.S();
                    x3Var.q4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        a71Var.l();
                    } else {
                        s4.l0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        a71Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            a71Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 0));
                    }
                    h2 h2Var5 = x3Var.H3;
                    if (h2Var5 != null) {
                        h2Var5.h();
                    }
                    x3Var.post(new a3(x3Var, aVar2, 0));
                }
            }
        }
    }
}
