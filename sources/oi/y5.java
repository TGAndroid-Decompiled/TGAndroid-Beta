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
import c8.ca;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.dj;
import org.telegram.messenger.g6;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ug0;
public final class y5 extends FrameLayout implements org.telegram.ui.ActionBar.z5, g9 {
    public static final int f22139b0 = 0;
    public v5 E;
    public boolean F;
    public boolean G;
    public g2 H;
    public String I;
    public int J;
    public ek0 K;
    public Drawable L;
    public e0.g M;
    public final RectF N;
    public boolean O;
    public int P;
    public u5 Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final e6 f22140a;
    public final Paint f22141a0;
    public final LinearLayout f22142b;
    public final View f22143c;
    public final gi.j d;
    public final bi.o2 f22144e;
    public final e1 f22145f;
    public final e1 h;
    public boolean f22146n;
    public final ArrayList f22147r;
    public LinearLayout f22148s;
    public TextView f22149w;
    public ImageView f22150x;
    public a f22151y;

    public y5(Context context, e6 e6Var) {
        super(context);
        this.f22147r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.f22141a0 = new Paint(1);
        this.f22140a = e6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22142b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f22143c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        gi.j jVar = new gi.j(this, context);
        this.d = jVar;
        jVar.setGravity(8388627);
        jVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        jVar.setSingleLine(true);
        jVar.setIncludeFontPadding(false);
        jVar.setTextSize(1, 16.0f);
        linearLayout.addView(jVar, ja.o(18, -2));
        bi.o2 o2Var = new bi.o2(context, e6Var);
        this.f22144e = o2Var;
        o2Var.setVisibility(8);
        o2Var.setOnClickListener(new p5(this, 0));
        linearLayout.addView(o2Var, ja.o(18, -2));
        e1 e1Var = new e1(context, e6Var);
        this.f22145f = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        e1Var.setListener(new s5(this));
        e1Var.setDelegate(new dt(this) {
            public final y5 f21956b;

            {
                this.f21956b = this;
            }

            @Override
            public final void E() {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f21956b;
                        if (!y5Var.T && y5Var.f22151y != null) {
                            y5Var.K();
                            y5.d(y5Var.f22151y.f21544b, y5Var.f22145f.getText());
                            v5 v5Var = y5Var.E;
                            if (v5Var != null) {
                                q3.S1(((a3) v5Var).f21571a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        y5 y5Var2 = this.f21956b;
                        if (y5Var2.f22151y != null) {
                            y5Var2.w();
                            v5 v5Var2 = y5Var2.E;
                            if (v5Var2 != null) {
                                q3.S1(((a3) v5Var2).f21571a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        e1Var.setOnFocusChangeListener(new ch.c0(this, 5));
        linearLayout.addView(e1Var, ja.l(1.0f, 0, -2));
        addView(linearLayout, ja.e(-1, -2, 51));
        e1 e1Var2 = new e1(context, e6Var);
        this.h = e1Var2;
        e1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        e1Var2.setAllowNewlines(false);
        e1Var2.setInputType(147457);
        e1Var2.setListener(new t5(this));
        e1Var2.setDelegate(new dt(this) {
            public final y5 f21956b;

            {
                this.f21956b = this;
            }

            @Override
            public final void E() {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f21956b;
                        if (!y5Var.T && y5Var.f22151y != null) {
                            y5Var.K();
                            y5.d(y5Var.f22151y.f21544b, y5Var.f22145f.getText());
                            v5 v5Var = y5Var.E;
                            if (v5Var != null) {
                                q3.S1(((a3) v5Var).f21571a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        y5 y5Var2 = this.f21956b;
                        if (y5Var2.f22151y != null) {
                            y5Var2.w();
                            v5 v5Var2 = y5Var2.E;
                            if (v5Var2 != null) {
                                q3.S1(((a3) v5Var2).f21571a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        e1Var2.setVisibility(8);
        addView(e1Var2, ja.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return a6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(y5 y5Var, boolean z10) {
        v5 v5Var;
        y5Var.f22145f.setHint(y5Var.getHint());
        if (!z10 && (v5Var = y5Var.E) != null) {
            ((a3) v5Var).f21571a.f21931p3.M(y5Var, null);
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
        pageBlock.text = a6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i7;
        a aVar = this.f22151y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f21544b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f21556p) {
                i7 = 2131754014;
            } else {
                i7 = 2131754030;
            }
            return hd.M0(i7, null);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return hd.M0(2131754029, null);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return hd.M0(2131754028, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return hd.M0(2131754027, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return hd.M0(2131754026, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return hd.M0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return hd.M0(2131754019, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return hd.M0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return hd.M0(2131754016, null);
            }
            if (!aVar.f21557q) {
                return null;
            }
            return hd.M0(2131754015, null);
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

    public static boolean m(e1 e1Var, int i7, int i10, int i11, int i12) {
        if (e1Var.length() != 0 || i11 < i7 || i11 > e1Var.getWidth() + i7 || i12 < i10 || i12 > e1Var.getHeight() + i10) {
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

    public static x5 r(String str, a aVar) {
        int i7;
        int i10;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i11 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new x5(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new x5(v(charAt - '0'), aVar.f21545c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new x5(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new x5(pageblockpullquote, 0, 0);
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
                                return new x5(u(i11, i7), 0, 0);
                            }
                        }
                        i7 = 2;
                        return new x5(u(i11, i7), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new x5(pageblockblockquote, 0, 0);
            }
            return new x5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static x5 s(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i7 = length - 1;
            if (str.charAt(i7) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f21544b;
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
                        return new x5(v(i10), aVar.f21545c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f21545c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new x5(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new x5(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f21545c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f21545c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f21545c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new x5(pageblockparagraph2, 1, 1);
                    } else if (aVar.f21545c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new x5(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new x5(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static x5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new x5(pageblockparagraph, 1, 0, true, z10);
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
                pagetablerow.cells.add(c6.f());
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

    public static boolean y(e1 e1Var, int i7, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = e1Var.getLayout();
        if (layout != null && e1Var.length() != 0) {
            int paddingLeft = i11 - (e1Var.getPaddingLeft() + i7);
            int paddingTop = i12 - (e1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (e1Var.getWidth() - e1Var.getPaddingLeft()) - e1Var.getPaddingRight());
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
        return a6.l(pageBlock.text);
    }

    public final void B() {
        this.f22145f.O();
    }

    public final void C() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        a aVar = this.f22151y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                g2 g2Var = new g2(this, 1);
                this.H = g2Var;
                postDelayed(g2Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f22145f.getText();
        if (text != null) {
            for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                text.removeSpan(cVar);
            }
        }
        this.I = null;
    }

    public final void D(j0 j0Var) {
        if (this.E != null && this.f22151y != null && j0Var != null) {
            List<String> list = j0Var.f21749c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q10 = q(str);
                    if (q10 != 0) {
                        ((a3) this.E).c(this.f22151y, q10);
                        return;
                    }
                    x5 r10 = r(str, this.f22151y);
                    if (r10 == null) {
                        r10 = s(r.b.v(str, " "), this.f22151y);
                        continue;
                    }
                    if (r10 != null) {
                        ((a3) this.E).d(this.f22151y, r10.f22124a, r10.f22125b, r10.f22126c, r10.d, r10.f22127e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.p5[] p5VarArr;
        a aVar = this.f22151y;
        if (aVar != null && q3.F3(aVar.f21544b) && com.google.android.gms.internal.vision.e2.s(editable)) {
            e1 e1Var = this.f22145f;
            Paint.FontMetricsInt fontMetricsInt = e1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((e1Var.getTextSize() * 0.85f) / 1.2f));
            for (g6 g6Var : (g6[]) editable.getSpans(0, editable.length(), g6.class)) {
                g6Var.f23696b = 0.85f;
            }
            for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.p5.class)) {
                p5Var.replaceFontMetrics(fontMetricsInt);
                p5Var.setSize(max);
            }
        }
    }

    public final void F() {
        v5 v5Var;
        int i7;
        int i10;
        a aVar = this.f22151y;
        if (aVar != null && aVar.f21545c > 0 && (v5Var = this.E) != null) {
            int b10 = ((a3) v5Var).b(aVar);
            int a10 = ((a3) this.E).a(this.f22151y);
            a aVar2 = this.f22151y;
            if (aVar2.f21554n) {
                if (aVar2.f21552l <= 0) {
                    b10 = 0;
                } else {
                    b10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f22151y;
            if (aVar3.f21555o) {
                if (aVar3.f21553m <= 0) {
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
        a aVar = this.f22151y;
        e1 e1Var = this.f22145f;
        e1 e1Var2 = this.h;
        if (aVar != null && p(aVar.f21544b) && (e1Var.length() > 0 || e1Var2.length() > 0)) {
            if (e1Var2.getVisibility() != 0) {
                e1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (e1Var2.getVisibility() != 8) {
            if (e1Var2.isFocused()) {
                e1Var.requestFocus();
            }
            e1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i7;
        Layout layout;
        int lineStart;
        e1 e1Var = this.f22145f;
        if (e1Var.getText() != null) {
            Editable text = e1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f22151y.f21544b).collapsed || (layout = e1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i7 = text.length())) {
                i7 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.R && i7 == this.S) {
                return;
            }
            this.T = true;
            try {
                u5 u5Var = this.Q;
                if (u5Var != null) {
                    text.removeSpan(u5Var);
                }
                if (i10 >= 0) {
                    if (this.Q == null) {
                        this.Q = new u5(this, 0);
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
        this.f22145f.updateColors();
        e1 e1Var = this.h;
        if (e1Var != null) {
            e1Var.updateColors();
        }
        int i7 = j6.G6;
        e6 e6Var = this.f22140a;
        this.d.setTextColor(j6.w0(i7, e6Var));
        if (this.L != null) {
            int w02 = j6.w0(j6.Fi, e6Var);
            Drawable drawable = this.L;
            if (drawable != this.U || w02 != this.V) {
                this.U = drawable;
                this.V = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        ek0 ek0Var = this.K;
        if (ek0Var != null) {
            ca.a(ek0Var, e6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z10) {
        float f10;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f22148s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f22148s;
        if (linearLayout2 != null && z10) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.f22148s = null;
        }
        if (this.f22148s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f22148s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f22148s;
            int i7 = j6.f28941i6;
            q6.Q(linearLayout4, j6.a0(j6.w0(i7, this.f22140a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, q6.M(i7), this.f22140a);
            this.f22148s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.f22148s, ja.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.f22149w = textView;
            textView.setTextSize(1, 12.0f);
            this.f22149w.setGravity(17);
            this.f22148s.addView(this.f22149w, ja.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f22150x = imageView;
            imageView.setImageResource(2131230873);
            this.f22148s.addView(this.f22150x, ja.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            qi.p pVar = qi.j.f55613a;
            synchronized (pVar.f55625a) {
                try {
                    if (!pVar.f55632s) {
                        pVar.d.execute(new qi.k(pVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f22148s.setOnClickListener(new p5(this, 1));
            this.f22148s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i10 = j6.G6;
        int w02 = j6.w0(i10, this.f22140a);
        float f11 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        } else {
            f10 = 0.75f;
        }
        j6.r1(f10, w02);
        if (TextUtils.isEmpty(str)) {
            f11 = 0.5f;
        }
        m6 K = q6.K(f11, i10);
        ImageView imageView2 = this.f22150x;
        e6 e6Var = this.f22140a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = K.f29392a;
        float f12 = K.d;
        int P = q6.P(i11, -1, 2, f12, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        q6.N(imageView2, 5, i11, -1, 2, f12, e6Var, P, porterDuffColorFilter).h = mode;
        q6.V(this.f22149w, K, this.f22140a);
        if (TextUtils.isEmpty(str)) {
            this.f22149w.setText(hd.M0(2131754017, null));
        } else {
            this.f22149w.setText(dj.b(str));
        }
        this.f22148s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        a aVar = this.f22151y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            e1 e1Var = this.f22145f;
            if (e1Var.length() > 0 && (e1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = org.telegram.messenger.g0.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f22151y;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Fi));
    }

    public final void c(a aVar) {
        int i7;
        int b10;
        int i10;
        a aVar2;
        int i11;
        String n10;
        int i12 = aVar.f21545c;
        bi.o2 o2Var = this.f22144e;
        View view = this.f22143c;
        gi.j jVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            jVar.setVisibility(8);
            o2Var.setVisibility(8);
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
        if (aVar.f21546e) {
            jVar.setVisibility(8);
            o2Var.setVisibility(0);
            ((CheckBoxBase) o2Var.f3751b).f(-1, aVar.f21547f, false);
            return;
        }
        o2Var.setVisibility(8);
        jVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) jVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            v5 v5Var = this.E;
            if (v5Var != null) {
                TextPaint paint = jVar.getPaint();
                ArrayList arrayList = ((a3) v5Var).f21571a.f21939t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i10 = aVar.f21545c) > 0 && aVar.d > 0) {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.f21545c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        }
                        i13--;
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).f21545c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.f21545c == i10 && aVar4.d > 0) {
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
                TextPaint paint3 = jVar.getPaint();
                b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
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
        e1 e1Var;
        Canvas canvas2;
        float f10;
        h9 h9Var;
        int L;
        float f11;
        float f12;
        int i7;
        int L2;
        a aVar = this.f22151y;
        LinearLayout linearLayout = this.f22142b;
        Paint paint = this.f22141a0;
        e6 e6Var = this.f22140a;
        e1 e1Var2 = this.f22145f;
        if (aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(j6.w0(j6.ol, e6Var));
            int c10 = ca.c(this.f22151y);
            int d = ca.d(this.f22151y);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i7 = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f) + c10;
                int L4 = org.telegram.messenger.g0.L(16.0f) + d;
                if (hd.f24104a0) {
                    i7 = L4;
                } else {
                    i7 = L3;
                }
                int width2 = getWidth();
                if (!hd.f24104a0) {
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
            e1Var = e1Var2;
            canvas.drawRoundRect(i7, org.telegram.messenger.g0.L(7.0f), width, getHeight() - org.telegram.messenger.g0.L(7.0f), f13, f13, paint);
            canvas2 = canvas;
        } else {
            e1Var = e1Var2;
            if (aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.K == null) {
                    ek0 ek0Var = new ek0(this);
                    this.K = ek0Var;
                    ek0Var.a(null, null, null, this.f22140a, 1);
                    ca.a(this.K, e6Var);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor = (float) Math.floor(gz.Y0 / 3.0f);
                canvas2 = canvas;
                this.K.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.K.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.K == null) {
                        ek0 ek0Var2 = new ek0(this);
                        this.K = ek0Var2;
                        ek0Var2.a(null, null, null, this.f22140a, 1);
                        ca.a(this.K, e6Var);
                    }
                    if (this.L == null) {
                        Drawable mutate = getContext().getResources().getDrawable(2131231966).mutate();
                        this.L = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(j6.Fi, e6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = e1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            int left = e1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i10) + e1Var.getPaddingLeft() + left);
                            int left2 = e1Var.getLeft() + linearLayout.getLeft();
                            f10 = Math.max(f10, layout.getLineRight(i10) + e1Var.getPaddingLeft() + left2);
                        }
                    } else if (e1Var.getHint() != null) {
                        float measureText = e1Var.getPaint().measureText(e1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    e1 e1Var3 = this.h;
                    if (e1Var3.getVisibility() == 0) {
                        Layout layout2 = e1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                int left3 = e1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i11) + e1Var3.getPaddingLeft() + left3);
                                int left4 = e1Var3.getLeft();
                                f10 = Math.max(f10, layout2.getLineRight(i11) + e1Var3.getPaddingLeft() + left4);
                            }
                        } else if (e1Var3.getHint() != null) {
                            float measureText2 = e1Var3.getPaint().measureText(e1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width3 < f10) {
                        float L5 = width3 - org.telegram.messenger.g0.L(30.0f);
                        float L6 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor2 = (float) Math.floor(gz.Y0 / 2.0f);
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
            Layout layout3 = e1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + e1Var.getPaddingTop() + getPaddingTop());
                    int left5 = e1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + e1Var.getPaddingLeft() + left5);
                    int left6 = e1Var.getLeft() + linearLayout.getLeft();
                    f11 = Math.max(f11, layout3.getLineRight(i14) + e1Var.getPaddingLeft() + left6);
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + e1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L8 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(j6.r1(0.05f, j6.w0(j6.G6, e6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L8, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        v5 v5Var = this.E;
        if (v5Var != null) {
            h9Var = ((a3) v5Var).f21571a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            ArrayList arrayList = this.f22147r;
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
        int w02 = j6.w0(j6.Fi, e6Var);
        float z10 = org.telegram.messenger.k5.z(8.0f, getHeight(), org.telegram.messenger.g0.L(3.333f));
        Canvas canvas4 = canvas2;
        this.M.d(canvas4, this.N, org.telegram.messenger.k5.z(16.0f, getWidth(), L), z10, w02, ((TL_iv.pageBlockBlockquote) this.f22151y.f21544b).collapsed, l());
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
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f22151y.f21544b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        v5 v5Var = this.E;
                        if (v5Var != null) {
                            q3 q3Var = ((a3) v5Var).f21571a;
                            d2 d2Var = q3Var.R3;
                            if (d2Var != null) {
                                d2Var.g();
                            }
                            q3Var.f21931p3.onContentChanged();
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

    public final void f(oi.a r27, oi.v5 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: oi.y5.f(oi.a, oi.v5, boolean):void");
    }

    public final int g(int i7, int i10) {
        Layout layout;
        e0.g gVar;
        int L;
        boolean z10;
        if (l()) {
            e1 e1Var = this.h;
            if (e1Var.getVisibility() == 0 && (layout = e1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new e0.g(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f22142b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + e1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                int L2 = org.telegram.messenger.g0.L(3.333f);
                this.M.getClass();
                float z12 = org.telegram.messenger.k5.z(16.0f, i7, L2) - org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + gVar.f9887a);
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

    public e1 getAuthorEditText() {
        return this.h;
    }

    public e1 getEditText() {
        return this.f22145f;
    }

    public a getRow() {
        return this.f22151y;
    }

    public org.telegram.ui.ActionBar.h4 getStyleDelegate() {
        return this.f22145f;
    }

    public final void h() {
        a aVar = this.f22151y;
        if (aVar != null) {
            i(aVar.f21544b);
        }
        e1 e1Var = this.h;
        if (e1Var.getVisibility() != 0) {
            e1Var.setVisibility(0);
            requestLayout();
        }
        e1Var.O();
        e1Var.setSelection(e1Var.length());
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        e1 e1Var = this.f22145f;
        Layout layout2 = e1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f22142b;
            arrayList.add(new z4(layout2, e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft(), e1Var.getPaddingTop() + e1Var.getTop() + linearLayout.getTop(), 1));
        }
        e1 e1Var2 = this.h;
        if (e1Var2.getVisibility() == 0 && (layout = e1Var2.getLayout()) != null) {
            arrayList.add(new z4(layout, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop(), 2));
        }
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f22145f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f22151y;
        if (aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        H();
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f22142b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        e1Var.layout(paddingLeft, measuredHeight, e1Var.getMeasuredWidth() + paddingLeft, e1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i7);
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f22142b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        e1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + e1Var.getMeasuredHeight() + measuredHeight;
        int g10 = g(size, paddingBottom);
        this.P = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z10) {
        this.f22145f.setLocked(z10);
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
            if (getBackground() instanceof w1) {
                ((w1) getBackground()).a(j6.w0(j6.f28849d6, this.f22140a));
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
                if (drawable != ((org.telegram.ui.Components.g6) gVar.f9890e) && drawable != ((ug0) gVar.f9891f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f22151y;
        if (aVar != null && p(aVar.f21544b)) {
            TL_iv.PageBlock pageBlock = this.f22151y.f21544b;
            TL_iv.RichText f10 = a6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
            }
        }
    }

    public final void x() {
        a aVar = this.f22151y;
        if (aVar != null) {
            d(aVar.f21544b, this.f22145f.getText());
        }
    }
}
