package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ea;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.cj;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ok0;
public final class a6 extends FrameLayout implements org.telegram.ui.ActionBar.b6, i9 {
    public static final int f21963b0 = 0;
    public x5 E;
    public boolean F;
    public boolean G;
    public j2 H;
    public String I;
    public int J;
    public ok0 K;
    public Drawable L;
    public e0.g M;
    public final RectF N;
    public boolean O;
    public int P;
    public w5 Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final h6 f21964a;
    public final Paint f21965a0;
    public final LinearLayout f21966b;
    public final View f21967c;
    public final gi.j d;
    public final bi.m3 f21968e;
    public final f1 f21969f;
    public final f1 h;
    public boolean f21970n;
    public final ArrayList f21971r;
    public LinearLayout f21972s;
    public TextView f21973w;
    public ImageView f21974x;
    public a f21975y;

    public a6(Context context, h6 h6Var) {
        super(context);
        this.f21971r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.f21965a0 = new Paint(1);
        this.f21964a = h6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f21966b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f21967c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        gi.j jVar = new gi.j(this, context);
        this.d = jVar;
        jVar.setGravity(8388627);
        jVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        jVar.setSingleLine(true);
        jVar.setIncludeFontPadding(false);
        jVar.setTextSize(1, 16.0f);
        linearLayout.addView(jVar, ma.o(18, -2));
        bi.m3 m3Var = new bi.m3(context, h6Var);
        this.f21968e = m3Var;
        m3Var.setVisibility(8);
        m3Var.setOnClickListener(new r5(this, 0));
        linearLayout.addView(m3Var, ma.o(18, -2));
        f1 f1Var = new f1(context, h6Var);
        this.f21969f = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        f1Var.setListener(new u5(this));
        f1Var.setDelegate(new mt(this) {
            public final a6 f22392b;

            {
                this.f22392b = this;
            }

            @Override
            public final void g() {
                switch (r2) {
                    case 0:
                        a6 a6Var = this.f22392b;
                        if (!a6Var.T && a6Var.f21975y != null) {
                            a6Var.K();
                            a6.d(a6Var.f21975y.f21932b, a6Var.f21969f.getText());
                            x5 x5Var = a6Var.E;
                            if (x5Var != null) {
                                t3.S1(((d3) x5Var).f22053a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a6 a6Var2 = this.f22392b;
                        if (a6Var2.f21975y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.E;
                            if (x5Var2 != null) {
                                t3.S1(((d3) x5Var2).f22053a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        f1Var.setOnFocusChangeListener(new ch.c0(this, 4));
        linearLayout.addView(f1Var, ma.l(1.0f, 0, -2));
        addView(linearLayout, ma.e(-1, -2, 51));
        f1 f1Var2 = new f1(context, h6Var);
        this.h = f1Var2;
        f1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        f1Var2.setAllowNewlines(false);
        f1Var2.setInputType(147457);
        f1Var2.setListener(new v5(this));
        f1Var2.setDelegate(new mt(this) {
            public final a6 f22392b;

            {
                this.f22392b = this;
            }

            @Override
            public final void g() {
                switch (r2) {
                    case 0:
                        a6 a6Var = this.f22392b;
                        if (!a6Var.T && a6Var.f21975y != null) {
                            a6Var.K();
                            a6.d(a6Var.f21975y.f21932b, a6Var.f21969f.getText());
                            x5 x5Var = a6Var.E;
                            if (x5Var != null) {
                                t3.S1(((d3) x5Var).f22053a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a6 a6Var2 = this.f22392b;
                        if (a6Var2.f21975y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.E;
                            if (x5Var2 != null) {
                                t3.S1(((d3) x5Var2).f22053a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        f1Var2.setVisibility(8);
        addView(f1Var2, ma.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(a6 a6Var, boolean z10) {
        x5 x5Var;
        a6Var.f21969f.setHint(a6Var.getHint());
        if (!z10 && (x5Var = a6Var.E) != null) {
            ((d3) x5Var).f22053a.f22425p3.a0(a6Var, null);
        }
    }

    public static String b(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
            return null;
        }
        return null;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = c6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i7;
        a aVar = this.f21975y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f21932b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f21944p) {
                i7 = 2131754011;
            } else {
                i7 = 2131754027;
            }
            return gd.N0(i7, null);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return gd.N0(2131754026, null);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return gd.N0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return gd.N0(2131754024, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return gd.N0(2131754023, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return gd.N0(2131754022, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return gd.N0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return gd.N0(2131754013, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return gd.N0(2131754013, null);
            }
            if (!aVar.f21945q) {
                return null;
            }
            return gd.N0(2131754012, null);
        }
    }

    public static void i(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static TL_iv.RichText j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(f1 f1Var, int i7, int i10, int i11, int i12) {
        if (f1Var.length() != 0 || i11 < i7 || i11 > f1Var.getWidth() + i7 || i12 < i10 || i12 > f1Var.getHeight() + i10) {
            return false;
        }
        return true;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!lowerCase.equals("/img") && !lowerCase.equals("/pic") && !lowerCase.equals("/image") && !lowerCase.equals("/picture") && !lowerCase.equals("/photo")) {
            if (!lowerCase.equals("/vid") && !lowerCase.equals("/video")) {
                if (!lowerCase.equals("/audio") && !lowerCase.equals("/music")) {
                    if (!lowerCase.equals("/map") && !lowerCase.equals("/location") && !lowerCase.equals("/loc")) {
                        if (!lowerCase.equals("/latex") && !lowerCase.equals("/equation") && !lowerCase.equals("/math")) {
                            if (!lowerCase.equals("/toggle") && !lowerCase.equals("/details")) {
                                if (!lowerCase.equals("/button")) {
                                    return 0;
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 5;
        }
        return 4;
    }

    public static z5 r(String str, a aVar) {
        int i7;
        int i10;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i11 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new z5(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new z5(v(charAt - '0'), aVar.f21933c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new z5(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new z5(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                    try {
                                        i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    } catch (NumberFormatException unused) {
                                    }
                                } catch (NumberFormatException unused2) {
                                    i10 = 2;
                                }
                                i7 = i11;
                                i11 = i10;
                                return new z5(u(i11, i7), 0, 0);
                            }
                        }
                        i7 = 2;
                        return new z5(u(i11, i7), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new z5(pageblockblockquote, 0, 0);
            }
            return new z5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static z5 s(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i7 = length - 1;
            if (str.charAt(i7) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f21932b;
                boolean z11 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (str.charAt(0) == '#' && (z11 || z10)) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (str.charAt(i11) == '#') {
                            i10++;
                        } else {
                            return null;
                        }
                    }
                    if (i10 >= 1 && i10 <= 6) {
                        return new z5(v(i10), aVar.f21933c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f21933c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new z5(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new z5(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f21933c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f21933c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f21933c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new z5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f21933c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new z5(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new z5(new TL_iv.pageBlockPreformatted(), 0, 0);
                        }
                        return null;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static z5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new z5(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i7, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i7; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(e6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i7) {
        switch (i7) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean y(f1 f1Var, int i7, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = f1Var.getLayout();
        if (layout != null && f1Var.length() != 0) {
            int paddingLeft = i11 - (f1Var.getPaddingLeft() + i7);
            int paddingTop = i12 - (f1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (f1Var.getWidth() - f1Var.getPaddingLeft()) - f1Var.getPaddingRight());
                float f10 = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f10);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f10);
                float f11 = paddingLeft;
                if (f11 >= max2 && f11 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.l(pageBlock.text);
    }

    public final void B() {
        this.f21969f.O();
    }

    public final void C() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        a aVar = this.f21975y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21932b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                j2 j2Var = new j2(this, 1);
                this.H = j2Var;
                postDelayed(j2Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f21969f.getText();
        if (text != null) {
            for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                text.removeSpan(cVar);
            }
        }
        this.I = null;
    }

    public final void D(k0 k0Var) {
        if (this.E != null && this.f21975y != null && k0Var != null) {
            List<String> list = k0Var.f22201c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((d3) this.E).c(this.f21975y, q10);
                        return;
                    }
                    z5 r10 = r(str, this.f21975y);
                    if (r10 == null) {
                        r10 = s(p5.c.v(str, " "), this.f21975y);
                        continue;
                    }
                    if (r10 != null) {
                        ((d3) this.E).d(this.f21975y, r10.f22590a, r10.f22591b, r10.f22592c, r10.d, r10.f22593e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.y5[] y5VarArr;
        a aVar = this.f21975y;
        if (aVar != null && t3.F3(aVar.f21932b) && com.google.android.gms.internal.vision.e2.s(editable)) {
            f1 f1Var = this.f21969f;
            Paint.FontMetricsInt fontMetricsInt = f1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((f1Var.getTextSize() * 0.85f) / 1.2f));
            for (g6 g6Var : (g6[]) editable.getSpans(0, editable.length(), g6.class)) {
                g6Var.f24201b = 0.85f;
            }
            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.y5.class)) {
                y5Var.replaceFontMetrics(fontMetricsInt);
                y5Var.setSize(max);
            }
        }
    }

    public final void F() {
        x5 x5Var;
        int i7;
        int i10;
        a aVar = this.f21975y;
        if (aVar != null && aVar.f21933c > 0 && (x5Var = this.E) != null) {
            int b10 = ((d3) x5Var).b(aVar);
            int a10 = ((d3) this.E).a(this.f21975y);
            a aVar2 = this.f21975y;
            if (aVar2.f21942n) {
                if (aVar2.f21940l <= 0) {
                    b10 = 0;
                } else {
                    b10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f21975y;
            if (aVar3.f21943o) {
                if (aVar3.f21941m <= 0) {
                    a10 = 0;
                } else {
                    a10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i7, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a10 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a10);
            }
        }
    }

    public final void G() {
        a aVar = this.f21975y;
        f1 f1Var = this.f21969f;
        f1 f1Var2 = this.h;
        if (aVar != null && p(aVar.f21932b) && (f1Var.length() > 0 || f1Var2.length() > 0)) {
            if (f1Var2.getVisibility() != 0) {
                f1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (f1Var2.getVisibility() != 8) {
            if (f1Var2.isFocused()) {
                f1Var.requestFocus();
            }
            f1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i7;
        Layout layout;
        int lineStart;
        f1 f1Var = this.f21969f;
        if (f1Var.getText() != null) {
            Editable text = f1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f21975y.f21932b).collapsed || (layout = f1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i7 = text.length())) {
                i7 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.R && i7 == this.S) {
                return;
            }
            this.T = true;
            try {
                w5 w5Var = this.Q;
                if (w5Var != null) {
                    text.removeSpan(w5Var);
                }
                if (i10 >= 0) {
                    if (this.Q == null) {
                        this.Q = new w5(this, 0);
                    }
                    text.setSpan(this.Q, i10, i7, 33);
                }
                this.T = false;
                this.R = i10;
                this.S = i7;
            } catch (Throwable th2) {
                this.T = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f21969f.updateColors();
        f1 f1Var = this.h;
        if (f1Var != null) {
            f1Var.updateColors();
        }
        int i7 = m6.G6;
        h6 h6Var = this.f21964a;
        this.d.setTextColor(m6.w0(i7, h6Var));
        if (this.L != null) {
            int w02 = m6.w0(m6.Fi, h6Var);
            Drawable drawable = this.L;
            if (drawable != this.U || w02 != this.V) {
                this.U = drawable;
                this.V = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        ok0 ok0Var = this.K;
        if (ok0Var != null) {
            ea.a(ok0Var, h6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z10) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f21972s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f21972s;
        if (linearLayout2 != null && z10) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.f21972s = null;
        }
        if (this.f21972s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f21972s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f21972s;
            int i7 = m6.f29470i6;
            t6.Q(linearLayout4, m6.a0(m6.w0(i7, this.f21964a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, t6.M(i7), this.f21964a);
            this.f21972s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.f21972s, ma.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.f21973w = textView;
            textView.setTextSize(1, 12.0f);
            this.f21973w.setGravity(17);
            this.f21972s.addView(this.f21973w, ma.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f21974x = imageView;
            imageView.setImageResource(2131230873);
            this.f21972s.addView(this.f21974x, ma.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            qi.p pVar = qi.j.f56228a;
            synchronized (pVar.f56240a) {
                try {
                    if (!pVar.f56247s) {
                        pVar.d.execute(new qi.k(pVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f21972s.setOnClickListener(new r5(this, 1));
            this.f21972s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i10 = m6.G6;
        int w02 = m6.w0(i10, this.f21964a);
        float f11 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        } else {
            f10 = 0.75f;
        }
        m6.r1(f10, w02);
        if (TextUtils.isEmpty(str)) {
            f11 = 0.5f;
        }
        p6 K = t6.K(f11, i10);
        ImageView imageView2 = this.f21974x;
        h6 h6Var = this.f21964a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = K.f29892a;
        float f12 = K.d;
        int P = t6.P(i11, -1, 2, f12, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        t6.N(imageView2, 5, i11, -1, 2, f12, h6Var, P, porterDuffColorFilter).h = mode;
        t6.V(this.f21973w, K, this.f21964a);
        if (TextUtils.isEmpty(str)) {
            this.f21973w.setText(gd.N0(2131754014, null));
        } else {
            this.f21973w.setText(cj.b(str));
        }
        this.f21972s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        a aVar = this.f21975y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            f1 f1Var = this.f21969f;
            if (f1Var.length() > 0 && (f1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = org.telegram.messenger.g0.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f21975y;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
    }

    public final void c(a aVar) {
        int i7;
        int b10;
        int i10;
        a aVar2;
        int i11;
        String n10;
        int i12 = aVar.f21933c;
        bi.m3 m3Var = this.f21968e;
        View view = this.f21967c;
        gi.j jVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            jVar.setVisibility(8);
            m3Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.g0.L(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        if (i12 > 1) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (aVar.f21934e) {
            jVar.setVisibility(8);
            m3Var.setVisibility(0);
            ((CheckBoxBase) m3Var.f3873b).f(-1, aVar.f21935f, false);
            return;
        }
        m3Var.setVisibility(8);
        jVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) jVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            x5 x5Var = this.E;
            if (x5Var != null) {
                TextPaint paint = jVar.getPaint();
                ArrayList arrayList = ((d3) x5Var).f22053a.f22433t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i10 = aVar.f21933c) > 0 && aVar.d > 0) {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f21933c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        }
                        i13--;
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f21933c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f21933c == i10 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                } else {
                    b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(paint.measureText(a8.p0.n(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = jVar.getPaint();
                b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            jVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            n10 = "";
        } else {
            n10 = a8.p0.n(aVar.d, ".", new StringBuilder());
        }
        jVar.setText(n10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f1 f1Var;
        Canvas canvas2;
        float f10;
        j9 j9Var;
        int L;
        float f11;
        float f12;
        int i7;
        int L2;
        a aVar = this.f21975y;
        LinearLayout linearLayout = this.f21966b;
        Paint paint = this.f21965a0;
        h6 h6Var = this.f21964a;
        f1 f1Var2 = this.f21969f;
        if (aVar != null && (aVar.f21932b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(m6.w0(m6.ol, h6Var));
            int c10 = ea.c(this.f21975y);
            int d = ea.d(this.f21975y);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i7 = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f) + c10;
                int L4 = org.telegram.messenger.g0.L(16.0f) + d;
                if (gd.f24241a0) {
                    i7 = L4;
                } else {
                    i7 = L3;
                }
                int width2 = getWidth();
                if (!gd.f24241a0) {
                    L3 = L4;
                }
                width = width2 - L3;
            }
            if (i7 <= 0 && width >= getWidth()) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(8.0f);
            }
            float f13 = L2;
            f1Var = f1Var2;
            canvas.drawRoundRect(i7, org.telegram.messenger.g0.L(7.0f), width, getHeight() - org.telegram.messenger.g0.L(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            f1Var = f1Var2;
            if (aVar != null && (aVar.f21932b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.K == null) {
                    ok0 ok0Var = new ok0(this);
                    this.K = ok0Var;
                    ok0Var.a(null, null, null, this.f21964a, 1);
                    ea.a(this.K, h6Var);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor = (float) Math.floor(bz.Y0 / 3.0f);
                canvas2 = canvas;
                this.K.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.K.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f21932b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.K == null) {
                        ok0 ok0Var2 = new ok0(this);
                        this.K = ok0Var2;
                        ok0Var2.a(null, null, null, this.f21964a, 1);
                        ea.a(this.K, h6Var);
                    }
                    if (this.L == null) {
                        Drawable mutate = getContext().getResources().getDrawable(2131231967).mutate();
                        this.L = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(m6.w0(m6.Fi, h6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = f1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            int left = f1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i10) + f1Var.getPaddingLeft() + left);
                            int left2 = f1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i10) + f1Var.getPaddingLeft() + left2);
                        }
                    } else if (f1Var.getHint() != null) {
                        float measureText = f1Var.getPaint().measureText(f1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    f1 f1Var3 = this.h;
                    if (f1Var3.getVisibility() == 0) {
                        Layout layout2 = f1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                int left3 = f1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i11) + f1Var3.getPaddingLeft() + left3);
                                int left4 = f1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i11) + f1Var3.getPaddingLeft() + left4);
                            }
                        } else if (f1Var3.getHint() != null) {
                            float measureText2 = f1Var3.getPaint().measureText(f1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width3 < f10) {
                        float L5 = width3 - org.telegram.messenger.g0.L(30.0f);
                        float L6 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor2 = (float) Math.floor(bz.Y0 / 2.0f);
                        int L7 = org.telegram.messenger.g0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(L5, L7, L6, height);
                        this.K.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                        canvas2.save();
                        int i12 = (int) L5;
                        this.L.setBounds(org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(7.0f) + L7, this.L.getIntrinsicWidth() + org.telegram.messenger.g0.L(8.0f) + i12, this.L.getIntrinsicHeight() + org.telegram.messenger.g0.L(7.0f) + L7);
                        canvas2.scale(-1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                        this.L.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) L6;
                        this.L.setBounds((i13 - org.telegram.messenger.g0.L(8.0f)) - this.L.getIntrinsicWidth(), (height - org.telegram.messenger.g0.L(7.0f)) - this.L.getIntrinsicHeight(), i13 - org.telegram.messenger.g0.L(8.0f), height - org.telegram.messenger.g0.L(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                        this.L.draw(canvas2);
                        canvas2.restore();
                    }
                }
            }
        }
        if (this.W) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = f1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + f1Var.getPaddingTop() + getPaddingTop());
                    int left5 = f1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + f1Var.getPaddingLeft() + left5);
                    int left6 = f1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i14) + f1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + f1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L8 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(m6.r1(0.05f, m6.w0(m6.G6, h6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L8, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        x5 x5Var = this.E;
        if (x5Var != null) {
            j9Var = ((d3) x5Var).f22053a.getTextSelectionHelper();
        } else {
            j9Var = null;
        }
        if (j9Var != null) {
            ArrayList arrayList = this.f21971r;
            arrayList.clear();
            k(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                u9 u9Var = (u9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(u9Var.getX(), u9Var.getY());
                j9Var.Z(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.M == null) {
            this.M = new e0.g(this);
        }
        int w02 = m6.w0(m6.Fi, h6Var);
        float z10 = org.telegram.messenger.f3.z(8.0f, getHeight(), org.telegram.messenger.g0.L(3.333f));
        Canvas canvas4 = canvas2;
        this.M.d(canvas4, this.N, org.telegram.messenger.f3.z(16.0f, getWidth(), L), z10, w02, ((TL_iv.pageBlockBlockquote) this.f21975y.f21932b).collapsed, l());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.g(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.g(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.g(false);
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f21975y.f21932b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        x5 x5Var = this.E;
                        if (x5Var != null) {
                            t3 t3Var = ((d3) x5Var).f22053a;
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.g();
                            }
                            t3Var.f22425p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.g(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f(oi.a r27, oi.x5 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: oi.a6.f(oi.a, oi.x5, boolean):void");
    }

    public final int g(int i7, int i10) {
        Layout layout;
        e0.g gVar;
        int L;
        boolean z10;
        if (l()) {
            f1 f1Var = this.h;
            if (f1Var.getVisibility() == 0 && (layout = f1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new e0.g(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f21966b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + f1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + f1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + f1Var.getPaddingTop() + measuredHeight;
                int L2 = org.telegram.messenger.g0.L(3.333f);
                this.M.getClass();
                float z12 = org.telegram.messenger.f3.z(16.0f, i7, L2) - org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + gVar.f10231a);
                this.M.getClass();
                int i11 = i10 - L2;
                float L3 = i11 - org.telegram.messenger.g0.L(17.66f);
                float f10 = i11;
                if (lineRight > z12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (lineBottom <= L3 || lineTop >= f10) {
                    z11 = false;
                }
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.g0.L(4.0f)) + L) + L2) - i10));
                }
            }
        }
        return 0;
    }

    public f1 getAuthorEditText() {
        return this.h;
    }

    public f1 getEditText() {
        return this.f21969f;
    }

    public a getRow() {
        return this.f21975y;
    }

    public org.telegram.ui.ActionBar.k4 getStyleDelegate() {
        return this.f21969f;
    }

    public final void h() {
        a aVar = this.f21975y;
        if (aVar != null) {
            i(aVar.f21932b);
        }
        f1 f1Var = this.h;
        if (f1Var.getVisibility() != 0) {
            f1Var.setVisibility(0);
            requestLayout();
        }
        f1Var.O();
        f1Var.setSelection(f1Var.length());
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        f1 f1Var = this.f21969f;
        Layout layout2 = f1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f21966b;
            arrayList.add(new b5(layout2, f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft(), f1Var.getPaddingTop() + f1Var.getTop() + linearLayout.getTop(), 1));
        }
        f1 f1Var2 = this.h;
        if (f1Var2.getVisibility() == 0 && (layout = f1Var2.getLayout()) != null) {
            arrayList.add(new b5(layout, f1Var2.getPaddingLeft() + f1Var2.getLeft(), f1Var2.getPaddingTop() + f1Var2.getTop(), 2));
        }
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f21969f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        a aVar = this.f21975y;
        if (aVar != null && (aVar.f21932b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        H();
        f1 f1Var = this.h;
        if (f1Var.getVisibility() == 8) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f21966b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        f1Var.layout(paddingLeft, measuredHeight, f1Var.getMeasuredWidth() + paddingLeft, f1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i7);
        f1 f1Var = this.h;
        if (f1Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f21966b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        f1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + f1Var.getMeasuredHeight() + measuredHeight;
        int g10 = g(size, paddingBottom);
        this.P = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z10) {
        this.f21969f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.f29378d6, this.f21964a));
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            e0.g gVar = this.M;
            if (gVar != null) {
                if (drawable != ((n6) gVar.f10234e) && drawable != ((gh0) gVar.f10235f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f21975y;
        if (aVar != null && p(aVar.f21932b)) {
            TL_iv.PageBlock pageBlock = this.f21975y.f21932b;
            TL_iv.RichText f10 = c6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f21975y;
        if (aVar != null) {
            d(aVar.f21932b, this.f21969f.getText());
        }
    }
}
