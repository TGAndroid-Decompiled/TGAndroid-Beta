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
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.k61;
public final class x5 implements h1 {
    public final d6 f11771a;

    public x5(d6 d6Var) {
        this.f11771a = d6Var;
    }

    @Override
    public final void D(i1 i1Var, int i10, int i11) {
        a6 a6Var;
        r9 textSelectionHelper;
        d6 d6Var = this.f11771a;
        if (!d6Var.F && i10 != i11 && (a6Var = d6Var.f11347y) != null && (textSelectionHelper = ((e3) a6Var).f11358a.getTextSelectionHelper()) != null) {
            d6Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        a6 a6Var = this.f11771a.f11347y;
        if (a6Var != null) {
            e3 e3Var = (e3) a6Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f11358a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void U(Editable editable) {
        a aVar;
        d6 d6Var = this.f11771a;
        if (d6Var.f11346x != null) {
            d6Var.E(editable);
            d6Var.J();
            d6.d(d6Var.f11346x.f11205b, editable);
            d6Var.C();
            d6Var.G();
            int i10 = 0;
            if (d6Var.o() && !d6Var.l()) {
                ((TL_iv.pageBlockBlockquote) d6Var.f11346x.f11205b).collapsed = false;
            }
            d6Var.H();
            a6 a6Var = d6Var.f11347y;
            if (a6Var != null) {
                w3 w3Var = ((e3) a6Var).f11358a;
                h2 h2Var = w3Var.J3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f11715h3.onContentChanged();
            }
            a6 a6Var2 = d6Var.f11347y;
            if (a6Var2 != null) {
                ((e3) a6Var2).f11358a.f11715h3.l(d6Var, d6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = d6Var.f11346x;
            if (aVar2 != null && obj != null && aVar2.f11206c == 0 && (aVar2.f11205b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && d6Var.f11347y != null) {
                d6Var.post(new ai.s1(this, d6Var.f11346x, i10, 15));
            } else {
                c6 s10 = d6.s(d6Var.f11346x, editable.toString());
                if (s10 != null && d6Var.f11347y != null) {
                    d6Var.post(new gg.t(this, d6Var.f11346x, s10, 18));
                }
            }
            if (!d6Var.T && ((aVar = d6Var.f11346x) == null || !(aVar.f11205b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            d6Var.invalidate();
        }
    }

    @Override
    public final boolean Y(boolean z10) {
        a aVar;
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var != null && (aVar = d6Var.f11346x) != null) {
            return ((e3) a6Var).f11358a.X3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        a6 a6Var = this.f11771a.f11347y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).f11358a;
            w3.N1(w3Var, i1Var);
            w3Var.f11715h3.x(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var != null && d6Var.f11346x != null) {
            return ((e3) a6Var).f11358a.T4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        h2 h2Var;
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var != null && d6Var.f11346x != null && (h2Var = ((e3) a6Var).f11358a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void n(i1 i1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        d6 d6Var = this.f11771a;
        if (d6Var.f11347y != null && d6Var.f11346x != null) {
            String obj = i1Var.getText().toString();
            ((e3) d6Var.f11347y).f11358a.f11715h3.l(d6Var, null);
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
                ((e3) d6Var.f11347y).c(d6Var.f11346x, q6);
                return;
            }
            c6 r10 = d6.r(d6Var.f11346x, i1Var.getText().toString());
            if (r10 != null) {
                ((e3) d6Var.f11347y).d(d6Var.f11346x, r10.f11291a, r10.f11292b, r10.f11293c, r10.d, r10.e);
            } else if ((d6Var.f11346x.f11205b instanceof TL_iv.pageBlockPullquote) && d6Var.f11341f.length() > 0) {
                d6Var.i();
            } else {
                a6 a6Var = d6Var.f11347y;
                a aVar = d6Var.f11346x;
                w3 w3Var = ((e3) a6Var).f11358a;
                ArrayList arrayList = w3Var.f11730p4;
                k61 k61Var = w3Var.Y2;
                ArrayList arrayList2 = w3Var.f11722l3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    View A1 = w3Var.A1(aVar);
                    boolean z11 = A1 instanceof d6;
                    if (z11) {
                        i1 editText2 = ((d6) A1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = d6.A(aVar.f11205b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f11211k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f11211k;
                            arrayList3.remove(arrayList3.size() - 1);
                            w3Var.t4();
                            k61Var.N(false);
                            h2 h2Var2 = w3Var.J3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            w3Var.post(new o2(w3Var, aVar, 27));
                            return;
                        } else if (aVar.f11206c > 0) {
                            w3Var.u2(indexOf);
                            w3Var.t4();
                            k61Var.N(false);
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
                    TL_iv.PageBlock pageBlock = aVar.f11205b;
                    ArrayList arrayList4 = aVar.f11211k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = q0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f11205b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            w3Var.f11723m3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f11205b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.d(aVar.f11205b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    d6.d(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f11206c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f11211k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    w3Var.t4();
                    if (z10) {
                        k61Var.N(false);
                        h2 h2Var4 = w3Var.J3;
                        if (h2Var4 != null) {
                            h2Var4.h();
                        }
                        w3Var.post(new o2(w3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((d6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    k61Var.S();
                    w3Var.q4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        k61Var.l();
                    } else {
                        s4.m0 itemAnimator = w3Var.getItemAnimator();
                        w3Var.setItemAnimator(null);
                        k61Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            k61Var.q(i10, (arrayList.size() - indexOf2) - 1);
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
    public final boolean p(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var != null && (aVar = d6Var.f11346x) != null) {
            w3 w3Var = ((e3) a6Var).f11358a;
            ClipboardManager clipboardManager = (ClipboardManager) w3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = w3Var.x4(d4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !w3.G3((a) x42.get(0))) && (indexOf = w3Var.f11722l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean J4 = w3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    w3Var.f11723m3.putAll(hashMap);
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
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var == null || (aVar = d6Var.f11346x) == null) {
            return false;
        }
        return w3.R1(((e3) a6Var).f11358a, aVar, false);
    }

    @Override
    public final void y() {
        a aVar;
        d6 d6Var = this.f11771a;
        a6 a6Var = d6Var.f11347y;
        if (a6Var != null && (aVar = d6Var.f11346x) != null) {
            w3.R1(((e3) a6Var).f11358a, aVar, true);
        }
    }
}
