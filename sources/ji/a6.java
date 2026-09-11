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
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.v51;
public final class a6 implements g1 {
    public final g6 f13778a;

    public a6(g6 g6Var) {
        this.f13778a = g6Var;
    }

    @Override
    public final void C(h1 h1Var) {
        int length;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        h1 editText;
        Editable text;
        g6 g6Var = this.f13778a;
        if (g6Var.f13939y != null && g6Var.f13938x != null) {
            String obj = h1Var.getText().toString();
            ((d3) g6Var.f13939y).f13861a.f14249h3.x(g6Var, null);
            String b10 = g6.b(obj);
            if (b10 != null) {
                ArrayList a2 = n0.a(b10);
                if (!a2.isEmpty()) {
                    g6Var.D((n0) a2.get(0));
                    return;
                }
            }
            int q6 = g6.q(h1Var.getText().toString());
            if (q6 != 0) {
                ((d3) g6Var.f13939y).c(g6Var.f13938x, q6);
                return;
            }
            f6 r10 = g6.r(h1Var.getText().toString(), g6Var.f13938x);
            if (r10 != null) {
                ((d3) g6Var.f13939y).d(g6Var.f13938x, r10.f13902a, r10.f13903b, r10.f13904c, r10.d, r10.f13905e);
            } else if ((g6Var.f13938x.f13732b instanceof TL_iv.pageBlockPullquote) && g6Var.f13933f.length() > 0) {
                g6Var.i();
            } else {
                d6 d6Var = g6Var.f13939y;
                a aVar = g6Var.f13938x;
                v3 v3Var = ((d3) d6Var).f13861a;
                ArrayList arrayList = v3Var.f14264p4;
                v51 v51Var = v3Var.Y2;
                ArrayList arrayList2 = v3Var.f14256l3;
                int indexOf = arrayList2.indexOf(aVar);
                if (indexOf >= 0) {
                    g2 g2Var = v3Var.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    View y12 = v3Var.y1(aVar);
                    boolean z11 = y12 instanceof g6;
                    if (z11) {
                        h1 editText2 = ((g6) y12).getEditText();
                        Editable text2 = editText2.getText();
                        length = editText2.getSelectionEnd();
                        spannableStringBuilder = text2;
                    } else {
                        SpannableStringBuilder A = g6.A(aVar.f13732b);
                        length = A.length();
                        spannableStringBuilder = A;
                    }
                    if (length < 0 || length > spannableStringBuilder.length()) {
                        length = spannableStringBuilder.length();
                    }
                    if (spannableStringBuilder.length() == 0) {
                        if (!aVar.f13739k.isEmpty()) {
                            ArrayList arrayList3 = aVar.f13739k;
                            arrayList3.remove(arrayList3.size() - 1);
                            v3Var.r4();
                            v51Var.N(false);
                            g2 g2Var2 = v3Var.J3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            v3Var.post(new n2(v3Var, aVar, 27));
                            return;
                        } else if (aVar.f13733c > 0) {
                            v3Var.s2(indexOf);
                            v3Var.r4();
                            v51Var.N(false);
                            g2 g2Var3 = v3Var.J3;
                            if (g2Var3 != null) {
                                g2Var3.h();
                            }
                            v3Var.post(new n2(v3Var, aVar, 28));
                            return;
                        }
                    }
                    CharSequence subSequence = spannableStringBuilder.subSequence(0, length);
                    CharSequence subSequence2 = spannableStringBuilder.subSequence(length, spannableStringBuilder.length());
                    TL_iv.PageBlock pageBlock = aVar.f13732b;
                    ArrayList arrayList4 = aVar.f13739k;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        long a10 = p0.a();
                        TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.f13732b).caption;
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            v3Var.f14257m3.put(Long.valueOf(a10), richText);
                        }
                        arrayList4.add(Long.valueOf(a10));
                        aVar.f13732b = new TL_iv.pageBlockParagraph();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g6.e(aVar.f13732b, subSequence);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    g6.e(pageblockparagraph, subSequence2);
                    int i11 = aVar.d;
                    if (i11 > 0) {
                        i11++;
                    }
                    a aVar2 = new a(pageblockparagraph, aVar.f13733c, i11);
                    aVar2.f13734e = aVar.f13734e;
                    aVar2.f13739k.addAll(arrayList4);
                    int i12 = indexOf + 1;
                    arrayList2.add(i12, aVar2);
                    v3Var.r4();
                    if (z10) {
                        v51Var.N(false);
                        g2 g2Var4 = v3Var.J3;
                        if (g2Var4 != null) {
                            g2Var4.h();
                        }
                        v3Var.post(new n2(v3Var, aVar2, 29));
                        return;
                    }
                    if (z11 && (text = (editText = ((g6) y12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
                        editText.h = true;
                        text.delete(length, text.length());
                        editText.h = false;
                    }
                    v51Var.S();
                    v3Var.o4(i12);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf2 < 0) {
                        v51Var.l();
                    } else {
                        s4.m0 itemAnimator = v3Var.getItemAnimator();
                        v3Var.setItemAnimator(null);
                        v51Var.o(indexOf2);
                        if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                            v51Var.q(i10, (arrayList.size() - indexOf2) - 1);
                        }
                        v3Var.post(new x2(v3Var, itemAnimator, 0));
                    }
                    g2 g2Var5 = v3Var.J3;
                    if (g2Var5 != null) {
                        g2Var5.h();
                    }
                    v3Var.post(new y2(v3Var, aVar2, 0));
                }
            }
        }
    }

    @Override
    public final void N(Editable editable) {
        a aVar;
        g6 g6Var = this.f13778a;
        if (g6Var.f13938x != null) {
            g6Var.E(editable);
            g6Var.J();
            g6.e(g6Var.f13938x.f13732b, editable);
            g6Var.C();
            g6Var.G();
            int i10 = 0;
            if (g6Var.o() && !g6Var.l()) {
                ((TL_iv.pageBlockBlockquote) g6Var.f13938x.f13732b).collapsed = false;
            }
            g6Var.H();
            d6 d6Var = g6Var.f13939y;
            if (d6Var != null) {
                v3 v3Var = ((d3) d6Var).f13861a;
                g2 g2Var = v3Var.J3;
                if (g2Var != null) {
                    g2Var.g();
                }
                v3Var.f14249h3.onContentChanged();
            }
            d6 d6Var2 = g6Var.f13939y;
            if (d6Var2 != null) {
                ((d3) d6Var2).f13861a.f14249h3.x(g6Var, g6.b(editable.toString()));
            }
            String obj = editable.toString();
            a aVar2 = g6Var.f13938x;
            if (aVar2 != null && obj != null && aVar2.f13733c == 0 && (aVar2.f13732b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
                i10 = 6;
            }
            if (i10 != 0 && g6Var.f13939y != null) {
                g6Var.post(new ah.p(this, g6Var.f13938x, i10, 16));
            } else {
                f6 s10 = g6.s(editable.toString(), g6Var.f13938x);
                if (s10 != null && g6Var.f13939y != null) {
                    g6Var.post(new hg.t(this, g6Var.f13938x, s10, 18));
                }
            }
            if (!g6Var.T && ((aVar = g6Var.f13938x) == null || !(aVar.f13732b instanceof TL_iv.pageBlockPullquote))) {
                return;
            }
            g6Var.invalidate();
        }
    }

    @Override
    public final boolean R(boolean z10) {
        a aVar;
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var != null && (aVar = g6Var.f13938x) != null) {
            return ((d3) d6Var).f13861a.V3(aVar, z10);
        }
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        d6 d6Var = this.f13778a.f13939y;
        if (d6Var != null) {
            v3 v3Var = ((d3) d6Var).f13861a;
            v3.L1(v3Var, h1Var);
            v3Var.f14249h3.v(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var != null && g6Var.f13938x != null) {
            return ((d3) d6Var).f13861a.R4();
        }
        return false;
    }

    @Override
    public final boolean h(h1 h1Var) {
        a aVar;
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var == null || (aVar = g6Var.f13938x) == null) {
            return false;
        }
        return v3.P1(((d3) d6Var).f13861a, aVar, false);
    }

    @Override
    public final void i(int i10, int i11) {
        g2 g2Var;
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var != null && g6Var.f13938x != null && (g2Var = ((d3) d6Var).f13861a.J3) != null) {
            g2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean k(h1 h1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var != null && (aVar = g6Var.f13938x) != null) {
            v3 v3Var = ((d3) d6Var).f13861a;
            ClipboardManager clipboardManager = (ClipboardManager) v3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList v42 = v3Var.v4(d4.z(htmlText, hashMap));
                            if (!v42.isEmpty() && ((v42.size() != 1 || !v3.E3((a) v42.get(0))) && (indexOf = v3Var.f14256l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(h1Var.getSelectionStart(), h1Var.getSelectionEnd()));
                                boolean H4 = v3Var.H4(indexOf, indexOf, max, Math.max(max, Math.max(h1Var.getSelectionStart(), h1Var.getSelectionEnd())), v42);
                                if (H4 && !hashMap.isEmpty()) {
                                    v3Var.f14257m3.putAll(hashMap);
                                }
                                return H4;
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
    public final void o(h1 h1Var, int i10, int i11) {
        d6 d6Var;
        q9 textSelectionHelper;
        g6 g6Var = this.f13778a;
        if (!g6Var.F && i10 != i11 && (d6Var = g6Var.f13939y) != null && (textSelectionHelper = ((d3) d6Var).f13861a.getTextSelectionHelper()) != null) {
            g6Var.post(new fi.y4(this, h1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public final void r() {
        a aVar;
        g6 g6Var = this.f13778a;
        d6 d6Var = g6Var.f13939y;
        if (d6Var != null && (aVar = g6Var.f13938x) != null) {
            v3.P1(((d3) d6Var).f13861a, aVar, true);
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        d6 d6Var = this.f13778a.f13939y;
        if (d6Var != null) {
            d3 d3Var = (d3) d6Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f13861a.s4(charSequence.toString());
            }
        }
    }
}
