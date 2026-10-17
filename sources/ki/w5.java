package ki;

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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.s61;
public final class w5 implements g1 {
    public final c6 f15621a;

    public w5(c6 c6Var) {
        this.f15621a = c6Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        z5 z5Var = this.f15621a.f15182y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f15239a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void M(Editable editable) {
        a aVar;
        c6 c6Var = this.f15621a;
        if (c6Var.f15181x != null) {
            c6Var.E(editable);
            c6Var.J();
            c6.e(c6Var.f15181x.f15089b, editable);
            c6Var.C();
            c6Var.G();
            int i10 = 0;
            if (c6Var.o() && !c6Var.l()) {
                ((TL_iv.pageBlockBlockquote) c6Var.f15181x.f15089b).collapsed = false;
            }
            c6Var.H();
            z5 z5Var = c6Var.f15182y;
            if (z5Var != null) {
                w3 w3Var = ((e3) z5Var).f15239a;
                h2 h2Var = w3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f15586f3.onContentChanged();
            }
            z5 z5Var2 = c6Var.f15182y;
            if (z5Var2 != null) {
                ((e3) z5Var2).f15239a.f15586f3.x(c6Var, c6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = c6Var.f15181x;
            if (aVar2 != null && obj != null && aVar2.f15090c == 0 && (aVar2.f15089b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && c6Var.f15182y != null) {
                c6Var.post(new ah.o(this, c6Var.f15181x, i10, 20));
            } else {
                b6 s10 = c6.s(editable.toString(), c6Var.f15181x);
                if (s10 != null && c6Var.f15182y != null) {
                    c6Var.post(new ig.c2(this, c6Var.f15181x, s10, 6));
                }
            }
            if (!c6Var.T && ((aVar = c6Var.f15181x) == null || !(aVar.f15089b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            c6Var.invalidate();
        }
    }

    @Override
    public final boolean Q(boolean z10) {
        a aVar;
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && (aVar = c6Var.f15181x) != null) {
            return ((e3) z5Var).f15239a.X3(aVar, z10);
        }
        return false;
    }

    @Override
    public final boolean R(h1 h1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && (aVar = c6Var.f15181x) != null) {
            w3 w3Var = ((e3) z5Var).f15239a;
            ClipboardManager clipboardManager = (ClipboardManager) w3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = w3Var.x4(d4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !w3.G3((a) x42.get(0))) && (indexOf = w3Var.f15594j3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(h1Var.getSelectionStart(), h1Var.getSelectionEnd()));
                                boolean J4 = w3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(h1Var.getSelectionStart(), h1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    w3Var.f15596k3.putAll(hashMap);
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
    public final void V(h1 h1Var, int i10, int i11) {
        z5 z5Var;
        n9 textSelectionHelper;
        c6 c6Var = this.f15621a;
        if (!c6Var.F && i10 != i11 && (z5Var = c6Var.f15182y) != null && (textSelectionHelper = ((e3) z5Var).f15239a.getTextSelectionHelper()) != null) {
            c6Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void c(h1 h1Var) {
        z5 z5Var = this.f15621a.f15182y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).f15239a;
            w3.N1(w3Var, h1Var);
            w3Var.f15586f3.n(h1Var, true);
        }
    }

    @Override
    public final boolean f() {
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && c6Var.f15181x != null) {
            return ((e3) z5Var).f15239a.T4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && c6Var.f15181x != null && (h2Var = ((e3) z5Var).f15239a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void l(h1 h1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        int i10;
        h1 editText;
        Editable text;
        c6 c6Var = this.f15621a;
        if (c6Var.f15182y != null && c6Var.f15181x != null) {
            String obj = h1Var.getText().toString();
            ((e3) c6Var.f15182y).f15239a.f15586f3.x(c6Var, null);
            String b10 = c6.b(obj);
            if (b10 != null) {
                ArrayList a2 = n0.a(b10);
                if (!a2.isEmpty()) {
                    c6Var.D((n0) a2.get(0));
                    return;
                }
            }
            int q6 = c6.q(h1Var.getText().toString());
            if (q6 != 0) {
                ((e3) c6Var.f15182y).c(c6Var.f15181x, q6);
                return;
            }
            b6 r10 = c6.r(h1Var.getText().toString(), c6Var.f15181x);
            if (r10 != null) {
                ((e3) c6Var.f15182y).d(c6Var.f15181x, r10.f15152a, r10.f15153b, r10.f15154c, r10.d, r10.e);
            } else if ((c6Var.f15181x.f15089b instanceof TL_iv.pageBlockPullquote) && c6Var.f15176f.length() > 0) {
                c6Var.i();
            } else {
                z5 z5Var = c6Var.f15182y;
                a aVar = c6Var.f15181x;
                w3 w3Var = ((e3) z5Var).f15239a;
                ArrayList arrayList = w3Var.f15602n4;
                s61 s61Var = w3Var.W2;
                ArrayList arrayList2 = w3Var.f15594j3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    h2 h2Var = w3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    View A1 = w3Var.A1(aVar);
                    boolean z12 = A1 instanceof c6;
                    if (z12) {
                        h1 editText2 = ((c6) A1).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = c6.A(aVar.f15089b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f15095k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f15095k;
                            arrayList3.remove(arrayList3.size() - 1);
                            w3Var.t4();
                            s61Var.N(false);
                            h2 h2Var2 = w3Var.H3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            w3Var.post(new o2(w3Var, aVar, 27));
                            return;
                        } else if (aVar.f15090c > 0) {
                            w3Var.u2(indexOf);
                            w3Var.t4();
                            s61Var.N(false);
                            h2 h2Var3 = w3Var.H3;
                            if (h2Var3 != null) {
                                h2Var3.h();
                            }
                            w3Var.post(new o2(w3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f15089b;
                    ArrayList arrayList4 = aVar.f15095k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = p0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f15089b).caption;
                        z10 = true;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            w3Var.f15596k3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f15089b = new TL_iv.pageBlockParagraph();
                        z11 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    c6.e(aVar.f15089b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    c6.e(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f15090c, i11);
                    aVar2.e = aVar.e;
                    aVar2.f15095k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    w3Var.t4();
                    if (z11) {
                        s61Var.N(false);
                        h2 h2Var4 = w3Var.H3;
                        if (h2Var4 != null) {
                            h2Var4.h();
                        }
                        w3Var.post(new o2(w3Var, aVar2, 29));
                        return;
                    }
                    if (z12 && (text = (editText = ((c6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = z10;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    s61Var.S();
                    w3Var.q4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        s61Var.l();
                    } else {
                        s4.l0 itemAnimator = w3Var.getItemAnimator();
                        w3Var.setItemAnimator(null);
                        s61Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            s61Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        w3Var.post(new y2(w3Var, itemAnimator, 0));
                    }
                    h2 h2Var5 = w3Var.H3;
                    if (h2Var5 != null) {
                        h2Var5.h();
                    }
                    w3Var.post(new z2(w3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final void m() {
        a aVar;
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && (aVar = c6Var.f15181x) != null) {
            w3.R1(((e3) z5Var).f15239a, aVar, true);
        }
    }

    @Override
    public final boolean q(h1 h1Var) {
        a aVar;
        c6 c6Var = this.f15621a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var == null || (aVar = c6Var.f15181x) == null) {
            return false;
        }
        return w3.R1(((e3) z5Var).f15239a, aVar, false);
    }
}
