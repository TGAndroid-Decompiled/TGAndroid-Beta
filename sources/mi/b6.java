package mi;

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
import b8.mf;
import b8.ne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.wi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vs;
public final class b6 extends FrameLayout implements org.telegram.ui.ActionBar.z5, g9 {
    public static final int f19479b0 = 0;
    public y5 E;
    public boolean F;
    public boolean G;
    public j2 H;
    public String I;
    public int J;
    public dk0 K;
    public Drawable L;
    public e0.g M;
    public final RectF N;
    public boolean O;
    public int P;
    public x5 Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final org.telegram.ui.ActionBar.e6 f19480a;
    public final Paint f19481a0;
    public final LinearLayout f19482b;
    public final View f19483c;
    public final fi.j d;
    public final ai.x2 f19484e;
    public final h1 f19485f;
    public final h1 h;
    public boolean f19486n;
    public final ArrayList f19487r;
    public LinearLayout f19488s;
    public TextView f19489w;
    public ImageView f19490x;
    public a f19491y;

    public b6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19487r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.f19481a0 = new Paint(1);
        this.f19480a = e6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f19482b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f19483c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        fi.j jVar = new fi.j(this, context);
        this.d = jVar;
        jVar.setGravity(8388627);
        jVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        jVar.setSingleLine(true);
        jVar.setIncludeFontPadding(false);
        jVar.setTextSize(1, 16.0f);
        linearLayout.addView(jVar, mf.o(18, -2));
        ai.x2 x2Var = new ai.x2(context, e6Var);
        this.f19484e = x2Var;
        x2Var.setVisibility(8);
        x2Var.setOnClickListener(new s5(this, 0));
        linearLayout.addView(x2Var, mf.o(18, -2));
        h1 h1Var = new h1(context, e6Var);
        this.f19485f = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        h1Var.setListener(new v5(this));
        h1Var.setDelegate(new vs(this) {
            public final b6 f19958b;

            {
                this.f19958b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f19958b;
                        if (!b6Var.T && b6Var.f19491y != null) {
                            b6Var.K();
                            b6.d(b6Var.f19491y.f19431b, b6Var.f19485f.getText());
                            y5 y5Var = b6Var.E;
                            if (y5Var != null) {
                                t3.S1(((d3) y5Var).f19561a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b6 b6Var2 = this.f19958b;
                        if (b6Var2.f19491y != null) {
                            b6Var2.w();
                            y5 y5Var2 = b6Var2.E;
                            if (y5Var2 != null) {
                                t3.S1(((d3) y5Var2).f19561a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        h1Var.setOnFocusChangeListener(new ci.m(this, 5));
        linearLayout.addView(h1Var, mf.l(1.0f, 0, -2));
        addView(linearLayout, mf.e(-1, -2, 51));
        h1 h1Var2 = new h1(context, e6Var);
        this.h = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        h1Var2.setAllowNewlines(false);
        h1Var2.setInputType(147457);
        h1Var2.setListener(new w5(this));
        h1Var2.setDelegate(new vs(this) {
            public final b6 f19958b;

            {
                this.f19958b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f19958b;
                        if (!b6Var.T && b6Var.f19491y != null) {
                            b6Var.K();
                            b6.d(b6Var.f19491y.f19431b, b6Var.f19485f.getText());
                            y5 y5Var = b6Var.E;
                            if (y5Var != null) {
                                t3.S1(((d3) y5Var).f19561a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b6 b6Var2 = this.f19958b;
                        if (b6Var2.f19491y != null) {
                            b6Var2.w();
                            y5 y5Var2 = b6Var2.E;
                            if (y5Var2 != null) {
                                t3.S1(((d3) y5Var2).f19561a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        h1Var2.setVisibility(8);
        addView(h1Var2, mf.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return d6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(b6 b6Var, boolean z10) {
        y5 y5Var;
        b6Var.f19485f.setHint(b6Var.getHint());
        if (!z10 && (y5Var = b6Var.E) != null) {
            ((d3) y5Var).f19561a.f19916p3.Z0(b6Var, null);
        }
    }

    public static String b(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
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
        pageBlock.text = d6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i3;
        a aVar = this.f19491y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f19431b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f19443p) {
                i3 = 2131754014;
            } else {
                i3 = 2131754030;
            }
            return bd.M0(i3, null);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return bd.M0(2131754029, null);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return bd.M0(2131754028, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return bd.M0(2131754027, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return bd.M0(2131754026, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return bd.M0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return bd.M0(2131754019, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return bd.M0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return bd.M0(2131754016, null);
            }
            if (!aVar.f19444q) {
                return null;
            }
            return bd.M0(2131754015, null);
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

    public static boolean m(h1 h1Var, int i3, int i10, int i11, int i12) {
        if (h1Var.length() != 0 || i11 < i3 || i11 > h1Var.getWidth() + i3 || i12 < i10 || i12 > h1Var.getHeight() + i10) {
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

    public static a6 r(String str, a aVar) {
        int i3;
        int i10;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i11 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new a6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new a6(v(charAt - '0'), aVar.f19432c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new a6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new a6(pageblockpullquote, 0, 0);
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
                                i3 = i11;
                                i11 = i10;
                                return new a6(u(i11, i3), 0, 0);
                            }
                        }
                        i3 = 2;
                        return new a6(u(i11, i3), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new a6(pageblockblockquote, 0, 0);
            }
            return new a6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static a6 s(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i3 = length - 1;
            if (str.charAt(i3) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f19431b;
                boolean z11 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (str.charAt(0) == '#' && (z11 || z10)) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i3; i11++) {
                        if (str.charAt(i11) == '#') {
                            i10++;
                        } else {
                            return null;
                        }
                    }
                    if (i10 >= 1 && i10 <= 6) {
                        return new a6(v(i10), aVar.f19432c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f19432c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new a6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new a6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f19432c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f19432c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f19432c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new a6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f19432c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new a6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new a6(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static a6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new a6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i3, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i3; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(f6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i3) {
        switch (i3) {
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

    public static boolean y(h1 h1Var, int i3, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = h1Var.getLayout();
        if (layout != null && h1Var.length() != 0) {
            int paddingLeft = i11 - (h1Var.getPaddingLeft() + i3);
            int paddingTop = i12 - (h1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (h1Var.getWidth() - h1Var.getPaddingLeft()) - h1Var.getPaddingRight());
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
        return d6.l(pageBlock.text);
    }

    public final void B() {
        this.f19485f.N();
    }

    public final void C() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        a aVar = this.f19491y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                j2 j2Var = new j2(this, 1);
                this.H = j2Var;
                postDelayed(j2Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f19485f.getText();
        if (text != null) {
            for (oi.d dVar : (oi.d[]) text.getSpans(0, text.length(), oi.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.I = null;
    }

    public final void D(m0 m0Var) {
        if (this.E != null && this.f19491y != null && m0Var != null) {
            List<String> list = m0Var.f19741c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((d3) this.E).c(this.f19491y, q10);
                        return;
                    }
                    a6 r5 = r(str, this.f19491y);
                    if (r5 == null) {
                        r5 = s(t4.c.q(str, " "), this.f19491y);
                        continue;
                    }
                    if (r5 != null) {
                        ((d3) this.E).d(this.f19491y, r5.f19463a, r5.f19464b, r5.f19465c, r5.d, r5.f19466e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.p5[] p5VarArr;
        a aVar = this.f19491y;
        if (aVar != null && t3.F3(aVar.f19431b) && com.google.android.recaptcha.internal.a.u(editable)) {
            h1 h1Var = this.f19485f;
            Paint.FontMetricsInt fontMetricsInt = h1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((h1Var.getTextSize() * 0.85f) / 1.2f));
            for (org.telegram.messenger.f6 f6Var : (org.telegram.messenger.f6[]) editable.getSpans(0, editable.length(), org.telegram.messenger.f6.class)) {
                f6Var.f22453b = 0.85f;
            }
            for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.p5.class)) {
                p5Var.replaceFontMetrics(fontMetricsInt);
                p5Var.setSize(max);
            }
        }
    }

    public final void F() {
        y5 y5Var;
        int i3;
        int i10;
        a aVar = this.f19491y;
        if (aVar != null && aVar.f19432c > 0 && (y5Var = this.E) != null) {
            int b10 = ((d3) y5Var).b(aVar);
            int a10 = ((d3) this.E).a(this.f19491y);
            a aVar2 = this.f19491y;
            if (aVar2.f19441n) {
                if (aVar2.f19439l <= 0) {
                    b10 = 0;
                } else {
                    b10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f19491y;
            if (aVar3.f19442o) {
                if (aVar3.f19440m <= 0) {
                    a10 = 0;
                } else {
                    a10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i3, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a10 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a10);
            }
        }
    }

    public final void G() {
        a aVar = this.f19491y;
        h1 h1Var = this.f19485f;
        h1 h1Var2 = this.h;
        if (aVar != null && p(aVar.f19431b) && (h1Var.length() > 0 || h1Var2.length() > 0)) {
            if (h1Var2.getVisibility() != 0) {
                h1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (h1Var2.getVisibility() != 8) {
            if (h1Var2.isFocused()) {
                h1Var.requestFocus();
            }
            h1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i3;
        Layout layout;
        int lineStart;
        h1 h1Var = this.f19485f;
        if (h1Var.getText() != null) {
            Editable text = h1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f19491y.f19431b).collapsed || (layout = h1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i3 = text.length())) {
                i3 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.R && i3 == this.S) {
                return;
            }
            this.T = true;
            try {
                x5 x5Var = this.Q;
                if (x5Var != null) {
                    text.removeSpan(x5Var);
                }
                if (i10 >= 0) {
                    if (this.Q == null) {
                        this.Q = new x5(this, 0);
                    }
                    text.setSpan(this.Q, i10, i3, 33);
                }
                this.T = false;
                this.R = i10;
                this.S = i3;
            } catch (Throwable th2) {
                this.T = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f19485f.updateColors();
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.updateColors();
        }
        int i3 = k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19480a;
        this.d.setTextColor(k6.w0(i3, e6Var));
        if (this.L != null) {
            int w02 = k6.w0(k6.Ci, e6Var);
            Drawable drawable = this.L;
            if (drawable != this.U || w02 != this.V) {
                this.U = drawable;
                this.V = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        dk0 dk0Var = this.K;
        if (dk0Var != null) {
            ne.a(dk0Var, e6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z10) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f19488s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f19488s;
        if (linearLayout2 != null && z10) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.f19488s = null;
        }
        if (this.f19488s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f19488s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f19488s;
            int i3 = k6.f27972i6;
            r6.R(linearLayout4, k6.a0(k6.w0(i3, this.f19480a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, r6.N(i3), this.f19480a);
            this.f19488s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.f19488s, mf.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.f19489w = textView;
            textView.setTextSize(1, 12.0f);
            this.f19489w.setGravity(17);
            this.f19488s.addView(this.f19489w, mf.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f19490x = imageView;
            imageView.setImageResource(2131230873);
            this.f19488s.addView(this.f19490x, mf.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            oi.q qVar = oi.k.f21149a;
            synchronized (qVar.f21161a) {
                try {
                    if (!qVar.f21168s) {
                        qVar.d.execute(new oi.l(qVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f19488s.setOnClickListener(new s5(this, 1));
            this.f19488s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i10 = k6.G6;
        int w02 = k6.w0(i10, this.f19480a);
        float f11 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        } else {
            f10 = 0.75f;
        }
        k6.r1(f10, w02);
        if (TextUtils.isEmpty(str)) {
            f11 = 0.5f;
        }
        n6 L = r6.L(f11, i10);
        ImageView imageView2 = this.f19490x;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19480a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = L.f28359a;
        float f12 = L.d;
        int Q = r6.Q(i11, -1, 2, f12, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        r6.O(imageView2, 5, i11, -1, 2, f12, e6Var, Q, porterDuffColorFilter).h = mode;
        r6.W(this.f19489w, L, this.f19480a);
        if (TextUtils.isEmpty(str)) {
            this.f19489w.setText(bd.M0(2131754017, null));
        } else {
            this.f19489w.setText(wi.b(str));
        }
        this.f19488s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        a aVar = this.f19491y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            h1 h1Var = this.f19485f;
            if (h1Var.length() > 0 && (h1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = org.telegram.messenger.g0.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f19491y;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    public final void c(a aVar) {
        int i3;
        int b10;
        int i10;
        a aVar2;
        int i11;
        String o10;
        int i12 = aVar.f19432c;
        ai.x2 x2Var = this.f19484e;
        View view = this.f19483c;
        fi.j jVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            jVar.setVisibility(8);
            x2Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.g0.L(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        if (i12 > 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (aVar.f19433e) {
            jVar.setVisibility(8);
            x2Var.setVisibility(0);
            ((CheckBoxBase) x2Var.f1094b).f(-1, aVar.f19434f, false);
            return;
        }
        x2Var.setVisibility(8);
        jVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) jVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            y5 y5Var = this.E;
            if (y5Var != null) {
                TextPaint paint = jVar.getPaint();
                ArrayList arrayList = ((d3) y5Var).f19561a.f19924t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i10 = aVar.f19432c) > 0 && aVar.d > 0) {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f19432c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        }
                        i13--;
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f19432c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f19432c == i10 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                } else {
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint.measureText(a1.g.o(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = jVar.getPaint();
                b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            jVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            o10 = "";
        } else {
            o10 = a1.g.o(aVar.d, ".", new StringBuilder());
        }
        jVar.setText(o10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h1 h1Var;
        Canvas canvas2;
        float f10;
        h9 h9Var;
        int L;
        float f11;
        float f12;
        int i3;
        int L2;
        a aVar = this.f19491y;
        LinearLayout linearLayout = this.f19482b;
        Paint paint = this.f19481a0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19480a;
        h1 h1Var2 = this.f19485f;
        if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(k6.w0(k6.ll, e6Var));
            int c2 = ne.c(this.f19491y);
            int d = ne.d(this.f19491y);
            int width = getWidth();
            if (c2 <= 0 && d <= 0) {
                i3 = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f) + c2;
                int L4 = org.telegram.messenger.g0.L(16.0f) + d;
                if (bd.f21784a0) {
                    i3 = L4;
                } else {
                    i3 = L3;
                }
                int width2 = getWidth();
                if (!bd.f21784a0) {
                    L3 = L4;
                }
                width = width2 - L3;
            }
            if (i3 <= 0 && width >= getWidth()) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(8.0f);
            }
            float f13 = L2;
            h1Var = h1Var2;
            canvas.drawRoundRect(i3, org.telegram.messenger.g0.L(7.0f), width, getHeight() - org.telegram.messenger.g0.L(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            h1Var = h1Var2;
            if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.K == null) {
                    dk0 dk0Var = new dk0(this);
                    this.K = dk0Var;
                    dk0Var.a(null, null, null, this.f19480a, 1);
                    ne.a(this.K, e6Var);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor = (float) Math.floor(az.Y0 / 3.0f);
                canvas2 = canvas;
                this.K.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.K.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.K == null) {
                        dk0 dk0Var2 = new dk0(this);
                        this.K = dk0Var2;
                        dk0Var2.a(null, null, null, this.f19480a, 1);
                        ne.a(this.K, e6Var);
                    }
                    if (this.L == null) {
                        Drawable mutate = getContext().getResources().getDrawable(2131231966).mutate();
                        this.L = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.Ci, e6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = h1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            int left = h1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i10) + h1Var.getPaddingLeft() + left);
                            int left2 = h1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i10) + h1Var.getPaddingLeft() + left2);
                        }
                    } else if (h1Var.getHint() != null) {
                        float measureText = h1Var.getPaint().measureText(h1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    h1 h1Var3 = this.h;
                    if (h1Var3.getVisibility() == 0) {
                        Layout layout2 = h1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                int left3 = h1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i11) + h1Var3.getPaddingLeft() + left3);
                                int left4 = h1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i11) + h1Var3.getPaddingLeft() + left4);
                            }
                        } else if (h1Var3.getHint() != null) {
                            float measureText2 = h1Var3.getPaint().measureText(h1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width3 < f10) {
                        float L5 = width3 - org.telegram.messenger.g0.L(30.0f);
                        float L6 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor2 = (float) Math.floor(az.Y0 / 2.0f);
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
            Layout layout3 = h1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + h1Var.getPaddingTop() + getPaddingTop());
                    int left5 = h1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + h1Var.getPaddingLeft() + left5);
                    int left6 = h1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i14) + h1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + h1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L8 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(k6.r1(0.05f, k6.w0(k6.G6, e6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L8, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        y5 y5Var = this.E;
        if (y5Var != null) {
            h9Var = ((d3) y5Var).f19561a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            ArrayList arrayList = this.f19487r;
            arrayList.clear();
            k(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                s9 s9Var = (s9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(s9Var.getX(), s9Var.getY());
                h9Var.Z(canvas2, this, i15);
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
        int w02 = k6.w0(k6.Ci, e6Var);
        float z10 = org.telegram.messenger.k5.z(8.0f, getHeight(), org.telegram.messenger.g0.L(3.333f));
        Canvas canvas4 = canvas2;
        this.M.d(canvas4, this.N, org.telegram.messenger.k5.z(16.0f, getWidth(), L), z10, w02, ((TL_iv.pageBlockBlockquote) this.f19491y.f19431b).collapsed, l());
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
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f19491y.f19431b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        y5 y5Var = this.E;
                        if (y5Var != null) {
                            t3 t3Var = ((d3) y5Var).f19561a;
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.g();
                            }
                            t3Var.f19916p3.onContentChanged();
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

    public final void f(mi.a r27, mi.y5 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b6.f(mi.a, mi.y5, boolean):void");
    }

    public final int g(int i3, int i10) {
        Layout layout;
        e0.g gVar;
        int L;
        boolean z10;
        if (l()) {
            h1 h1Var = this.h;
            if (h1Var.getVisibility() == 0 && (layout = h1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new e0.g(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f19482b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + h1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                int L2 = org.telegram.messenger.g0.L(3.333f);
                this.M.getClass();
                float z12 = org.telegram.messenger.k5.z(16.0f, i3, L2) - org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + gVar.f9233a);
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

    public h1 getAuthorEditText() {
        return this.h;
    }

    public h1 getEditText() {
        return this.f19485f;
    }

    public a getRow() {
        return this.f19491y;
    }

    public org.telegram.ui.ActionBar.j4 getStyleDelegate() {
        return this.f19485f;
    }

    public final void h() {
        a aVar = this.f19491y;
        if (aVar != null) {
            i(aVar.f19431b);
        }
        h1 h1Var = this.h;
        if (h1Var.getVisibility() != 0) {
            h1Var.setVisibility(0);
            requestLayout();
        }
        h1Var.N();
        h1Var.setSelection(h1Var.length());
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        h1 h1Var = this.f19485f;
        Layout layout2 = h1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f19482b;
            arrayList.add(new c5(layout2, h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft(), h1Var.getPaddingTop() + h1Var.getTop() + linearLayout.getTop(), 1));
        }
        h1 h1Var2 = this.h;
        if (h1Var2.getVisibility() == 0 && (layout = h1Var2.getLayout()) != null) {
            arrayList.add(new c5(layout, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop(), 2));
        }
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f19485f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f19491y;
        if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        H();
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f19482b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        h1Var.layout(paddingLeft, measuredHeight, h1Var.getMeasuredWidth() + paddingLeft, h1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i3);
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f19482b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + h1Var.getMeasuredHeight() + measuredHeight;
        int g7 = g(size, paddingBottom);
        this.P = g7;
        setMeasuredDimension(size, paddingBottom + g7);
    }

    public void setLocked(boolean z10) {
        this.f19485f.setLocked(z10);
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
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.f27878d6, this.f19480a));
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
                if (drawable != ((g6) gVar.f9236e) && drawable != ((ug0) gVar.f9237f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f19491y;
        if (aVar != null && p(aVar.f19431b)) {
            TL_iv.PageBlock pageBlock = this.f19491y.f19431b;
            TL_iv.RichText f10 = d6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f19491y;
        if (aVar != null) {
            d(aVar.f19431b, this.f19485f.getText());
        }
    }
}
