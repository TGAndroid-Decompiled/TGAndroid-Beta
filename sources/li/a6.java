package li;

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
import bi.ec;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.f6;
import org.telegram.messenger.fj;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.zj0;
public final class a6 extends FrameLayout implements org.telegram.ui.ActionBar.c6, h9 {
    public static final int f18427a0 = 0;
    public x5 D;
    public boolean E;
    public boolean F;
    public i2 G;
    public String H;
    public int I;
    public zj0 J;
    public Drawable K;
    public e0.g L;
    public final RectF M;
    public boolean N;
    public int O;
    public w5 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final h6 f18428a;
    public final LinearLayout f18429b;
    public final View f18430c;
    public final ei.k d;
    public final ec f18431e;
    public final g1 f18432f;
    public final g1 h;
    public boolean f18433n;
    public final ArrayList f18434r;
    public LinearLayout f18435s;
    public TextView f18436w;
    public ImageView f18437x;
    public a f18438y;

    public a6(Context context, h6 h6Var) {
        super(context);
        this.f18434r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.f18428a = h6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18429b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f18430c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ei.k kVar = new ei.k(this, context);
        this.d = kVar;
        kVar.setGravity(8388627);
        kVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        kVar.setSingleLine(true);
        kVar.setIncludeFontPadding(false);
        kVar.setTextSize(1, 16.0f);
        linearLayout.addView(kVar, ha.o(18, -2));
        ec ecVar = new ec(context, h6Var);
        this.f18431e = ecVar;
        ecVar.setVisibility(8);
        ecVar.setOnClickListener(new r5(this, 0));
        linearLayout.addView(ecVar, ha.o(18, -2));
        g1 g1Var = new g1(context, h6Var);
        this.f18432f = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        g1Var.setListener(new u5(this));
        g1Var.setDelegate(new ws(this) {
            public final a6 f18863b;

            {
                this.f18863b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        a6 a6Var = this.f18863b;
                        if (!a6Var.S && a6Var.f18438y != null) {
                            a6Var.K();
                            a6.d(a6Var.f18438y.f18395b, a6Var.f18432f.getText());
                            x5 x5Var = a6Var.D;
                            if (x5Var != null) {
                                t3.S1(((c3) x5Var).f18507a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a6 a6Var2 = this.f18863b;
                        if (a6Var2.f18438y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.D;
                            if (x5Var2 != null) {
                                t3.S1(((c3) x5Var2).f18507a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        g1Var.setOnFocusChangeListener(new bi.n(this, 5));
        linearLayout.addView(g1Var, ha.l(1.0f, 0, -2));
        addView(linearLayout, ha.e(-1, -2, 51));
        g1 g1Var2 = new g1(context, h6Var);
        this.h = g1Var2;
        g1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        g1Var2.setAllowNewlines(false);
        g1Var2.setInputType(147457);
        g1Var2.setListener(new v5(this));
        g1Var2.setDelegate(new ws(this) {
            public final a6 f18863b;

            {
                this.f18863b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        a6 a6Var = this.f18863b;
                        if (!a6Var.S && a6Var.f18438y != null) {
                            a6Var.K();
                            a6.d(a6Var.f18438y.f18395b, a6Var.f18432f.getText());
                            x5 x5Var = a6Var.D;
                            if (x5Var != null) {
                                t3.S1(((c3) x5Var).f18507a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a6 a6Var2 = this.f18863b;
                        if (a6Var2.f18438y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.D;
                            if (x5Var2 != null) {
                                t3.S1(((c3) x5Var2).f18507a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        g1Var2.setVisibility(8);
        addView(g1Var2, ha.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(a6 a6Var, boolean z9) {
        x5 x5Var;
        a6Var.f18432f.setHint(a6Var.getHint());
        if (!z9 && (x5Var = a6Var.D) != null) {
            ((c3) x5Var).f18507a.f18893o3.o(a6Var, null);
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
        a aVar = this.f18438y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f18395b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f18407p) {
                i7 = 2131754014;
            } else {
                i7 = 2131754030;
            }
            return id.M0(i7, null);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return id.M0(2131754029, null);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return id.M0(2131754028, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return id.M0(2131754027, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return id.M0(2131754026, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return id.M0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return id.M0(2131754019, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return id.M0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return id.M0(2131754016, null);
            }
            if (!aVar.f18408q) {
                return null;
            }
            return id.M0(2131754015, null);
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

    public static boolean m(g1 g1Var, int i7, int i10, int i11, int i12) {
        if (g1Var.length() != 0 || i11 < i7 || i11 > g1Var.getWidth() + i7 || i12 < i10 || i12 > g1Var.getHeight() + i10) {
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
                return new z5(v(charAt - '0'), aVar.f18396c, aVar.d);
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
        boolean z9;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i7 = length - 1;
            if (str.charAt(i7) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f18395b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (str.charAt(0) == '#' && (z10 || z9)) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (str.charAt(i11) == '#') {
                            i10++;
                        } else {
                            return null;
                        }
                    }
                    if (i10 >= 1 && i10 <= 6) {
                        return new z5(v(i10), aVar.f18396c, aVar.d);
                    }
                    return null;
                } else if (z10) {
                    if (aVar.f18396c == 0 && length == 2) {
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
                    if (aVar.f18396c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f18396c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f18396c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new z5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f18396c == 0 && length == 4) {
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

    public static z5 t(boolean z9) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new z5(pageblockparagraph, 1, 0, true, z9);
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

    public static boolean y(g1 g1Var, int i7, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = g1Var.getLayout();
        if (layout != null && g1Var.length() != 0) {
            int paddingLeft = i11 - (g1Var.getPaddingLeft() + i7);
            int paddingTop = i12 - (g1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (g1Var.getWidth() - g1Var.getPaddingLeft()) - g1Var.getPaddingRight());
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
        this.f18432f.N();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f18438y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18395b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                i2 i2Var = new i2(this, 1);
                this.G = i2Var;
                postDelayed(i2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f18432f.getText();
        if (text != null) {
            for (ni.f fVar : (ni.f[]) text.getSpans(0, text.length(), ni.f.class)) {
                text.removeSpan(fVar);
            }
        }
        this.H = null;
    }

    public final void D(l0 l0Var) {
        if (this.D != null && this.f18438y != null && l0Var != null) {
            List<String> list = l0Var.f18684c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((c3) this.D).c(this.f18438y, q10);
                        return;
                    }
                    z5 r10 = r(str, this.f18438y);
                    if (r10 == null) {
                        r10 = s(rf.b.r(str, " "), this.f18438y);
                        continue;
                    }
                    if (r10 != null) {
                        ((c3) this.D).d(this.f18438y, r10.f19053a, r10.f19054b, r10.f19055c, r10.d, r10.f19056e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.q5[] q5VarArr;
        a aVar = this.f18438y;
        if (aVar != null && t3.F3(aVar.f18395b) && com.google.android.recaptcha.internal.a.u(editable)) {
            g1 g1Var = this.f18432f;
            Paint.FontMetricsInt fontMetricsInt = g1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((g1Var.getTextSize() * 0.85f) / 1.2f));
            for (f6 f6Var : (f6[]) editable.getSpans(0, editable.length(), f6.class)) {
                f6Var.f22374b = 0.85f;
            }
            for (org.telegram.ui.Components.q5 q5Var : (org.telegram.ui.Components.q5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.q5.class)) {
                q5Var.replaceFontMetrics(fontMetricsInt);
                q5Var.setSize(max);
            }
        }
    }

    public final void F() {
        x5 x5Var;
        int i7;
        int i10;
        a aVar = this.f18438y;
        if (aVar != null && aVar.f18396c > 0 && (x5Var = this.D) != null) {
            int b10 = ((c3) x5Var).b(aVar);
            int a10 = ((c3) this.D).a(this.f18438y);
            a aVar2 = this.f18438y;
            if (aVar2.f18405n) {
                if (aVar2.f18403l <= 0) {
                    b10 = 0;
                } else {
                    b10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f18438y;
            if (aVar3.f18406o) {
                if (aVar3.f18404m <= 0) {
                    a10 = 0;
                } else {
                    a10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i7, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a10 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a10);
            }
        }
    }

    public final void G() {
        a aVar = this.f18438y;
        g1 g1Var = this.f18432f;
        g1 g1Var2 = this.h;
        if (aVar != null && p(aVar.f18395b) && (g1Var.length() > 0 || g1Var2.length() > 0)) {
            if (g1Var2.getVisibility() != 0) {
                g1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (g1Var2.getVisibility() != 8) {
            if (g1Var2.isFocused()) {
                g1Var.requestFocus();
            }
            g1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i7;
        Layout layout;
        int lineStart;
        g1 g1Var = this.f18432f;
        if (g1Var.getText() != null) {
            Editable text = g1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f18438y.f18395b).collapsed || (layout = g1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i7 = text.length())) {
                i7 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.Q && i7 == this.R) {
                return;
            }
            this.S = true;
            try {
                w5 w5Var = this.P;
                if (w5Var != null) {
                    text.removeSpan(w5Var);
                }
                if (i10 >= 0) {
                    if (this.P == null) {
                        this.P = new w5(this, 0);
                    }
                    text.setSpan(this.P, i10, i7, 33);
                }
                this.S = false;
                this.Q = i10;
                this.R = i7;
            } catch (Throwable th2) {
                this.S = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f18432f.updateColors();
        g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.updateColors();
        }
        int i7 = m6.G6;
        h6 h6Var = this.f18428a;
        this.d.setTextColor(m6.w0(i7, h6Var));
        if (this.K != null) {
            int w02 = m6.w0(m6.Ci, h6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        zj0 zj0Var = this.J;
        if (zj0Var != null) {
            c8.l1.a(zj0Var, h6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z9) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f18435s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f18435s;
        if (linearLayout2 != null && z9) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.f18435s = null;
        }
        if (this.f18435s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f18435s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f18435s;
            int i7 = m6.f27982i6;
            t6.Q(linearLayout4, m6.a0(m6.w0(i7, this.f18428a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, t6.M(i7), this.f18428a);
            this.f18435s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.f18435s, ha.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.f18436w = textView;
            textView.setTextSize(1, 12.0f);
            this.f18436w.setGravity(17);
            this.f18435s.addView(this.f18436w, ha.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f18437x = imageView;
            imageView.setImageResource(2131230873);
            this.f18435s.addView(this.f18437x, ha.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ni.s sVar = ni.m.f20640a;
            synchronized (sVar.f20652a) {
                try {
                    if (!sVar.f20659s) {
                        sVar.d.execute(new ni.n(sVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f18435s.setOnClickListener(new r5(this, 1));
            this.f18435s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i10 = m6.G6;
        int w02 = m6.w0(i10, this.f18428a);
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
        ImageView imageView2 = this.f18437x;
        h6 h6Var = this.f18428a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = K.f28387a;
        float f12 = K.d;
        int P = t6.P(i11, -1, 2, f12, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        t6.N(imageView2, 5, i11, -1, 2, f12, h6Var, P, porterDuffColorFilter).h = mode;
        t6.V(this.f18436w, K, this.f18428a);
        if (TextUtils.isEmpty(str)) {
            this.f18436w.setText(id.M0(2131754017, null));
        } else {
            this.f18436w.setText(fj.b(str));
        }
        this.f18435s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        a aVar = this.f18438y;
        boolean z9 = false;
        if (aVar != null && aVar.d > 0) {
            g1 g1Var = this.f18432f;
            if (g1Var.length() > 0 && (g1Var.c(0, 1) & 1) != 0) {
                z9 = true;
            }
        }
        if (z9) {
            typeface = org.telegram.messenger.g0.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f18438y;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Ci));
    }

    public final void c(a aVar) {
        int i7;
        int b10;
        int i10;
        a aVar2;
        int i11;
        String n10;
        int i12 = aVar.f18396c;
        ec ecVar = this.f18431e;
        View view = this.f18430c;
        ei.k kVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            kVar.setVisibility(8);
            ecVar.setVisibility(8);
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
        if (aVar.f18397e) {
            kVar.setVisibility(8);
            ecVar.setVisibility(0);
            ((CheckBoxBase) ecVar.f3830b).f(-1, aVar.f18398f, false);
            return;
        }
        ecVar.setVisibility(8);
        kVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) kVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            x5 x5Var = this.D;
            if (x5Var != null) {
                TextPaint paint = kVar.getPaint();
                ArrayList arrayList = ((c3) x5Var).f18507a.f18900s3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i10 = aVar.f18396c) > 0 && aVar.d > 0) {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f18396c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        }
                        i13--;
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f18396c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f18396c == i10 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                } else {
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint.measureText(a8.p0.n(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = kVar.getPaint();
                b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            kVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            n10 = "";
        } else {
            n10 = a8.p0.n(aVar.d, ".", new StringBuilder());
        }
        kVar.setText(n10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g1 g1Var;
        Canvas canvas2;
        float f10;
        i9 i9Var;
        int L;
        float f11;
        float f12;
        int i7;
        int L2;
        a aVar = this.f18438y;
        LinearLayout linearLayout = this.f18429b;
        Paint paint = this.W;
        h6 h6Var = this.f18428a;
        g1 g1Var2 = this.f18432f;
        if (aVar != null && (aVar.f18395b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(m6.w0(m6.ll, h6Var));
            int c10 = c8.l1.c(this.f18438y);
            int d = c8.l1.d(this.f18438y);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i7 = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f) + c10;
                int L4 = org.telegram.messenger.g0.L(16.0f) + d;
                if (id.f23161a0) {
                    i7 = L4;
                } else {
                    i7 = L3;
                }
                int width2 = getWidth();
                if (!id.f23161a0) {
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
            g1Var = g1Var2;
            canvas.drawRoundRect(i7, org.telegram.messenger.g0.L(7.0f), width, getHeight() - org.telegram.messenger.g0.L(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            g1Var = g1Var2;
            if (aVar != null && (aVar.f18395b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    zj0 zj0Var = new zj0(this);
                    this.J = zj0Var;
                    zj0Var.a(null, null, null, this.f18428a, 1);
                    c8.l1.a(this.J, h6Var);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor = (float) Math.floor(iz.Y0 / 3.0f);
                canvas2 = canvas;
                this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.J.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f18395b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        zj0 zj0Var2 = new zj0(this);
                        this.J = zj0Var2;
                        zj0Var2.a(null, null, null, this.f18428a, 1);
                        c8.l1.a(this.J, h6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(2131231966).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(m6.w0(m6.Ci, h6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = g1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            int left = g1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i10) + g1Var.getPaddingLeft() + left);
                            int left2 = g1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i10) + g1Var.getPaddingLeft() + left2);
                        }
                    } else if (g1Var.getHint() != null) {
                        float measureText = g1Var.getPaint().measureText(g1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    g1 g1Var3 = this.h;
                    if (g1Var3.getVisibility() == 0) {
                        Layout layout2 = g1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                int left3 = g1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i11) + g1Var3.getPaddingLeft() + left3);
                                int left4 = g1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i11) + g1Var3.getPaddingLeft() + left4);
                            }
                        } else if (g1Var3.getHint() != null) {
                            float measureText2 = g1Var3.getPaint().measureText(g1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width3 < f10) {
                        float L5 = width3 - org.telegram.messenger.g0.L(30.0f);
                        float L6 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor2 = (float) Math.floor(iz.Y0 / 2.0f);
                        int L7 = org.telegram.messenger.g0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(L5, L7, L6, height);
                        this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                        canvas2.save();
                        int i12 = (int) L5;
                        this.K.setBounds(org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(7.0f) + L7, this.K.getIntrinsicWidth() + org.telegram.messenger.g0.L(8.0f) + i12, this.K.getIntrinsicHeight() + org.telegram.messenger.g0.L(7.0f) + L7);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) L6;
                        this.K.setBounds((i13 - org.telegram.messenger.g0.L(8.0f)) - this.K.getIntrinsicWidth(), (height - org.telegram.messenger.g0.L(7.0f)) - this.K.getIntrinsicHeight(), i13 - org.telegram.messenger.g0.L(8.0f), height - org.telegram.messenger.g0.L(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                    }
                }
            }
        }
        if (this.V) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = g1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + g1Var.getPaddingTop() + getPaddingTop());
                    int left5 = g1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + g1Var.getPaddingLeft() + left5);
                    int left6 = g1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i14) + g1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + g1Var.getPaddingTop() + getPaddingTop());
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
        x5 x5Var = this.D;
        if (x5Var != null) {
            i9Var = ((c3) x5Var).f18507a.getTextSelectionHelper();
        } else {
            i9Var = null;
        }
        if (i9Var != null) {
            ArrayList arrayList = this.f18434r;
            arrayList.clear();
            k(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                t9 t9Var = (t9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(t9Var.getX(), t9Var.getY());
                i9Var.Z(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.L == null) {
            this.L = new e0.g(this);
        }
        int w02 = m6.w0(m6.Ci, h6Var);
        float z9 = org.telegram.messenger.k5.z(8.0f, getHeight(), org.telegram.messenger.g0.L(3.333f));
        Canvas canvas4 = canvas2;
        this.L.d(canvas4, this.M, org.telegram.messenger.k5.z(16.0f, getWidth(), L), z9, w02, ((TL_iv.pageBlockBlockquote) this.f18438y.f18395b).collapsed, l());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.L != null) {
            boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.N) {
                            this.N = false;
                            this.L.g(false);
                            return true;
                        }
                    } else if (this.N) {
                        this.L.g(contains);
                        return true;
                    }
                } else if (this.N) {
                    this.N = false;
                    this.L.g(false);
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f18438y.f18395b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        x5 x5Var = this.D;
                        if (x5Var != null) {
                            t3 t3Var = ((c3) x5Var).f18507a;
                            f2 f2Var = t3Var.Q3;
                            if (f2Var != null) {
                                f2Var.g();
                            }
                            t3Var.f18893o3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.N = true;
                this.L.g(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f(li.a r27, li.x5 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: li.a6.f(li.a, li.x5, boolean):void");
    }

    public final int g(int i7, int i10) {
        Layout layout;
        e0.g gVar;
        int L;
        boolean z9;
        if (l()) {
            g1 g1Var = this.h;
            if (g1Var.getVisibility() == 0 && (layout = g1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new e0.g(this);
                }
                boolean z10 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f18429b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + g1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                int L2 = org.telegram.messenger.g0.L(3.333f);
                this.L.getClass();
                float z11 = org.telegram.messenger.k5.z(16.0f, i7, L2) - org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + gVar.f10056a);
                this.L.getClass();
                int i11 = i10 - L2;
                float L3 = i11 - org.telegram.messenger.g0.L(17.66f);
                float f10 = i11;
                if (lineRight > z11) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (lineBottom <= L3 || lineTop >= f10) {
                    z10 = false;
                }
                if (z9 && z10) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.g0.L(4.0f)) + L) + L2) - i10));
                }
            }
        }
        return 0;
    }

    public g1 getAuthorEditText() {
        return this.h;
    }

    public g1 getEditText() {
        return this.f18432f;
    }

    public a getRow() {
        return this.f18438y;
    }

    public org.telegram.ui.ActionBar.k4 getStyleDelegate() {
        return this.f18432f;
    }

    public final void h() {
        a aVar = this.f18438y;
        if (aVar != null) {
            i(aVar.f18395b);
        }
        g1 g1Var = this.h;
        if (g1Var.getVisibility() != 0) {
            g1Var.setVisibility(0);
            requestLayout();
        }
        g1Var.N();
        g1Var.setSelection(g1Var.length());
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        g1 g1Var = this.f18432f;
        Layout layout2 = g1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f18429b;
            arrayList.add(new b5(layout2, g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft(), g1Var.getPaddingTop() + g1Var.getTop() + linearLayout.getTop(), 1));
        }
        g1 g1Var2 = this.h;
        if (g1Var2.getVisibility() == 0 && (layout = g1Var2.getLayout()) != null) {
            arrayList.add(new b5(layout, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop(), 2));
        }
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f18432f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f18438y;
        if (aVar != null && (aVar.f18395b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        H();
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f18429b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        g1Var.layout(paddingLeft, measuredHeight, g1Var.getMeasuredWidth() + paddingLeft, g1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i7);
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f18429b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        g1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + g1Var.getMeasuredHeight() + measuredHeight;
        int g10 = g(size, paddingBottom);
        this.O = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z9) {
        this.f18432f.setLocked(z9);
        this.h.setLocked(z9);
    }

    public void setShowCommandBackground(boolean z9) {
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.f27890d6, this.f18428a));
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            e0.g gVar = this.L;
            if (gVar != null) {
                if (drawable != ((org.telegram.ui.Components.h6) gVar.f10059e) && drawable != ((rg0) gVar.f10060f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f18438y;
        if (aVar != null && p(aVar.f18395b)) {
            TL_iv.PageBlock pageBlock = this.f18438y.f18395b;
            TL_iv.RichText f10 = c6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f18438y;
        if (aVar != null) {
            d(aVar.f18395b, this.f18432f.getText());
        }
    }
}
