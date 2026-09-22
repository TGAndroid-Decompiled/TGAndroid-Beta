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
import org.telegram.ui.Components.w51;
public final class x5 implements h1 {
    public final d6 f11769a;

    public x5(d6 d6Var) {
        this.f11769a = d6Var;
    }

    @Override
    public final void D(i1 i1Var, int i10, int i11) {
        a6 a6Var;
        q9 textSelectionHelper;
        d6 d6Var = this.f11769a;
        if (!d6Var.F && i10 != i11 && (a6Var = d6Var.f11345y) != null && (textSelectionHelper = ((e3) a6Var).f11356a.getTextSelectionHelper()) != null) {
            d6Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        a6 a6Var = this.f11769a.f11345y;
        if (a6Var != null) {
            e3 e3Var = (e3) a6Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f11356a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void W(Editable editable) {
        a aVar;
        d6 d6Var = this.f11769a;
        if (d6Var.f11344x != null) {
            d6Var.E(editable);
            d6Var.J();
            d6.d(d6Var.f11344x.f11203b, editable);
            d6Var.C();
            d6Var.G();
            int i10 = 0;
            if (d6Var.o() && !d6Var.l()) {
                ((TL_iv.pageBlockBlockquote) d6Var.f11344x.f11203b).collapsed = false;
            }
            d6Var.H();
            a6 a6Var = d6Var.f11345y;
            if (a6Var != null) {
                w3 w3Var = ((e3) a6Var).f11356a;
                h2 h2Var = w3Var.J3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f11713h3.onContentChanged();
            }
            a6 a6Var2 = d6Var.f11345y;
            if (a6Var2 != null) {
                ((e3) a6Var2).f11356a.f11713h3.g(d6Var, d6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = d6Var.f11344x;
            if (aVar2 != null && obj != null && aVar2.f11204c == 0 && (aVar2.f11203b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && d6Var.f11345y != null) {
                d6Var.post(new ai.s1(this, d6Var.f11344x, i10, 15));
            } else {
                c6 s10 = d6.s(d6Var.f11344x, editable.toString());
                if (s10 != null && d6Var.f11345y != null) {
                    d6Var.post(new gg.t(this, d6Var.f11344x, s10, 18));
                }
            }
            if (!d6Var.T && ((aVar = d6Var.f11344x) == null || !(aVar.f11203b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            d6Var.invalidate();
        }
    }

    @Override
    public final boolean b0(boolean z10) {
        a aVar;
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var != null && (aVar = d6Var.f11344x) != null) {
            return ((e3) a6Var).f11356a.W3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        a6 a6Var = this.f11769a.f11345y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).f11356a;
            w3.M1(w3Var, i1Var);
            w3Var.f11713h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var != null && d6Var.f11344x != null) {
            return ((e3) a6Var).f11356a.S4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        h2 h2Var;
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var != null && d6Var.f11344x != null && (h2Var = ((e3) a6Var).f11356a.J3) != null) {
            h2Var.f(i10, i11);
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
        d6 d6Var = this.f11769a;
        if (d6Var.f11345y != null && d6Var.f11344x != null) {
            String obj = i1Var.getText().toString();
            ((e3) d6Var.f11345y).f11356a.f11713h3.g(d6Var, null);
            String b10 = d6.b(obj);
            if (b10 != null) {
                ArrayList a2 = o0.a(b10);
                if (!a2.isEmpty()) {
                    d6Var.D((o0) a2.get(0));
                    return;
                }
            }
            int q6 = d6.q(i1Var.getText().toString());
            if (q6 != 0) {
                ((e3) d6Var.f11345y).c(d6Var.f11344x, q6);
                return;
            }
            c6 r10 = d6.r(d6Var.f11344x, i1Var.getText().toString());
            if (r10 != null) {
                ((e3) d6Var.f11345y).d(d6Var.f11344x, r10.f11289a, r10.f11290b, r10.f11291c, r10.d, r10.e);
            } else if ((d6Var.f11344x.f11203b instanceof TL_iv.pageBlockPullquote) && d6Var.f11339f.length() > 0) {
                d6Var.i();
            } else {
                a6 a6Var = d6Var.f11345y;
                a aVar = d6Var.f11344x;
                w3 w3Var = ((e3) a6Var).f11356a;
                ArrayList arrayList = w3Var.f11728p4;
                w51 w51Var = w3Var.Y2;
                ArrayList arrayList2 = w3Var.f11720l3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    View z12 = w3Var.z1(aVar);
                    boolean z11 = z12 instanceof d6;
                    if (z11) {
                        i1 editText2 = ((d6) z12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = d6.A(aVar.f11203b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f11209k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f11209k;
                            arrayList3.remove(arrayList3.size() - 1);
                            w3Var.s4();
                            w51Var.N(false);
                            h2 h2Var2 = w3Var.J3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            w3Var.post(new o2(w3Var, aVar, 27));
                            return;
                        } else if (aVar.f11204c > 0) {
                            w3Var.t2(indexOf);
                            w3Var.s4();
                            w51Var.N(false);
                            h2 h2Var3 = w3Var.J3;
                            if (h2Var3 != null) {
                                h2Var3.h();
                            }
                            w3Var.post(new o2(w3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f11203b;
                    ArrayList arrayList4 = aVar.f11209k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = q0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f11203b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            w3Var.f11721m3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f11203b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.d(aVar.f11203b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    d6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f11204c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f11209k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    w3Var.s4();
                    if (z10) {
                        w51Var.N(false);
                        h2 h2Var4 = w3Var.J3;
                        if (h2Var4 != null) {
                            h2Var4.h();
                        }
                        w3Var.post(new o2(w3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((d6) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    w51Var.S();
                    w3Var.p4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        w51Var.l();
                    } else {
                        s4.m0 itemAnimator = w3Var.getItemAnimator();
                        w3Var.setItemAnimator(null);
                        w51Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            w51Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        w3Var.post(new y2(w3Var, itemAnimator, 0));
                    }
                    h2 h2Var5 = w3Var.J3;
                    if (h2Var5 != null) {
                        h2Var5.h();
                    }
                    w3Var.post(new z2(w3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final boolean q(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var != null && (aVar = d6Var.f11344x) != null) {
            w3 w3Var = ((e3) a6Var).f11356a;
            ClipboardManager clipboardManager = (ClipboardManager) w3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = w3Var.w4(d4.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !w3.F3((a) w42.get(0))) && (indexOf = w3Var.f11720l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean I4 = w3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    w3Var.f11721m3.putAll(hashMap);
                                }
                                return I4;
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
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var == null || (aVar = d6Var.f11344x) == null) {
            return false;
        }
        return w3.Q1(((e3) a6Var).f11356a, aVar, false);
    }

    @Override
    public final void x() {
        a aVar;
        d6 d6Var = this.f11769a;
        a6 a6Var = d6Var.f11345y;
        if (a6Var != null && (aVar = d6Var.f11344x) != null) {
            w3.Q1(((e3) a6Var).f11356a, aVar, true);
        }
    }
}
