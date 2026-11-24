package defpackage;

import android.content.Context;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class xk9 extends FrameLayout implements vlb, fkb {
    public uk9 E;
    public boolean F;
    public boolean G;
    public rf9 H;
    public String I;
    public int J;
    public p99 K;
    public Drawable L;
    public u30 M;
    public final RectF N;
    public boolean O;
    public int P;
    public yl Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final ylb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final t8 d;
    public final xd9 e;
    public final ne9 f;
    public final ne9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public ll0 y;

    public xk9(Context context, ylb ylbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.a0 = new Paint(1);
        this.a = ylbVar;
        setPadding(gm.L(16.0f), gm.L(5.0f), gm.L(16.0f), gm.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        t8 t8Var = new t8(this, context);
        this.d = t8Var;
        t8Var.setGravity(8388627);
        t8Var.setPaddingRelative(gm.L(6.0f), 0, 0, 0);
        t8Var.setSingleLine(true);
        t8Var.setIncludeFontPadding(false);
        t8Var.setTextSize(1, 16.0f);
        linearLayout.addView(t8Var, qoe.o(18, -2));
        xd9 xd9Var = new xd9(context, ylbVar);
        this.e = xd9Var;
        xd9Var.setVisibility(8);
        xd9Var.setOnClickListener(new pk9(this, (byte) 0));
        linearLayout.addView(xd9Var, qoe.o(18, -2));
        ne9 ne9Var = new ne9(context, ylbVar);
        this.f = ne9Var;
        ne9Var.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        ne9Var.setListener(new sk9(this));
        ne9Var.setDelegate(new ou3(this) {
            public final xk9 b;

            {
                this.b = this;
            }

            @Override
            public final void m() {
                byte b = r2;
                xk9 xk9Var = this.b;
                switch (b) {
                    case 0:
                        if (!xk9Var.T && xk9Var.y != null) {
                            xk9Var.K();
                            xk9.b(xk9Var.y.b, xk9Var.f.getText());
                            uk9 uk9Var = xk9Var.E;
                            if (uk9Var != null) {
                                ((mg9) uk9Var).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (xk9Var.y != null) {
                            xk9Var.v();
                            uk9 uk9Var2 = xk9Var.E;
                            if (uk9Var2 != null) {
                                ((mg9) uk9Var2).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ne9Var.setOnFocusChangeListener(new tt0(this, (byte) 16));
        linearLayout.addView(ne9Var, qoe.l(1.0f, 0, -2));
        addView(linearLayout, qoe.e(-1, -2, 51));
        ne9 ne9Var2 = new ne9(context, ylbVar);
        this.h = ne9Var2;
        ne9Var2.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(1.0f));
        ne9Var2.setAllowNewlines(false);
        ne9Var2.setInputType(147457);
        ne9Var2.setListener(new tk9(this));
        ne9Var2.setDelegate(new ou3(this) {
            public final xk9 b;

            {
                this.b = this;
            }

            @Override
            public final void m() {
                byte b = r2;
                xk9 xk9Var = this.b;
                switch (b) {
                    case 0:
                        if (!xk9Var.T && xk9Var.y != null) {
                            xk9Var.K();
                            xk9.b(xk9Var.y.b, xk9Var.f.getText());
                            uk9 uk9Var = xk9Var.E;
                            if (uk9Var != null) {
                                ((mg9) uk9Var).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (xk9Var.y != null) {
                            xk9Var.v();
                            uk9 uk9Var2 = xk9Var.E;
                            if (uk9Var2 != null) {
                                ((mg9) uk9Var2).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ne9Var2.setVisibility(8);
        addView(ne9Var2, qoe.e(-1, -2, 51));
        I();
    }

    public static String E(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static void b(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = zk9.f(charSequence);
    }

    public static void c(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    public static void g(TL_iv.PageBlock pageBlock) {
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

    private String getHint() {
        int i;
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                if (ll0Var.p) {
                    i = 2131753979;
                } else {
                    i = 2131753995;
                }
                return jb6.M0(i, null);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return jb6.M0(2131753994, null);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                    return jb6.M0(2131753993, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                    return jb6.M0(2131753992, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                    return jb6.M0(2131753991, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                    return jb6.M0(2131753990, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    return jb6.M0(2131753984, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    return jb6.M0(2131753981, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return jb6.M0(2131753981, null);
                }
                if (ll0Var.q) {
                    return jb6.M0(2131753980, null);
                }
            }
        }
        return null;
    }

    public static TL_iv.RichText h(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean j(ne9 ne9Var, int i, int i2, int i3, int i4) {
        if (ne9Var.length() != 0 || i3 < i || i3 > ne9Var.getWidth() + i || i4 < i2 || i4 > ne9Var.getHeight() + i2) {
            return false;
        }
        return true;
    }

    public static boolean n(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int p(String str) {
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

    public static wk9 q(ll0 ll0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str != null && ll0Var != null) {
            String trim = str.trim();
            int i3 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new wk9(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new wk9(u(charAt - '0'), ll0Var.c, ll0Var.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new wk9(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new wk9(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i2 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                    try {
                                        i3 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    } catch (NumberFormatException unused) {
                                    }
                                } catch (NumberFormatException unused2) {
                                    i2 = 2;
                                }
                                i = i3;
                                i3 = i2;
                                return new wk9(t(i3, i), 0, 0);
                            }
                        }
                        i = 2;
                        return new wk9(t(i3, i), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new wk9(pageblockblockquote, 0, 0);
            }
            return new wk9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static wk9 r(ll0 ll0Var, String str) {
        int length;
        boolean z;
        char charAt;
        if (ll0Var != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = ll0Var.b;
                boolean z2 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z = false;
                } else {
                    z = true;
                }
                if (str.charAt(0) == '#' && (z2 || z)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        if (str.charAt(i3) == '#') {
                            i2++;
                        } else {
                            return null;
                        }
                    }
                    if (i2 >= 1 && i2 <= 6) {
                        return new wk9(u(i2), ll0Var.c, ll0Var.d);
                    }
                    return null;
                } else if (z2) {
                    if (ll0Var.c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new wk9(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c(pageblockparagraph, "");
                            return new wk9(pageblockparagraph, 1, 0);
                        }
                    }
                    if (ll0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return s(false);
                    }
                    if (ll0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return s(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return s(true);
                        }
                    }
                    if (ll0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        c(pageblockparagraph2, "");
                        return new wk9(pageblockparagraph2, 1, 1);
                    } else if (ll0Var.c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new wk9(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new wk9(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static wk9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new wk9(pageblockparagraph, 1, 0, true, z);
    }

    public static TL_iv.pageBlockTable t(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(fhb.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i) {
        switch (i) {
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

    public static boolean x(ne9 ne9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = ne9Var.getLayout();
        if (layout != null && ne9Var.length() != 0) {
            int paddingLeft = i3 - (ne9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (ne9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = gm.L(24.0f);
                int max = Math.max(0, (ne9Var.getWidth() - ne9Var.getPaddingLeft()) - ne9Var.getPaddingRight());
                float f = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= max2 && f2 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String y(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return zk9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return zk9.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f.O();
    }

    public final void B() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                rf9 rf9Var = new rf9(this, (byte) 1);
                this.H = rf9Var;
                postDelayed(rf9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (xk2 xk2Var : (xk2[]) text.getSpans(0, text.length(), xk2.class)) {
                text.removeSpan(xk2Var);
            }
        }
        this.I = null;
    }

    public final void C(ud9 ud9Var) {
        if (this.E != null && this.y != null && ud9Var != null) {
            List<String> list = ud9Var.c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int p = p(str);
                    if (p != 0) {
                        ((mg9) this.E).c(this.y, p);
                        return;
                    }
                    wk9 q = q(this.y, str);
                    if (q == null) {
                        q = r(this.y, td4.p(str, " "));
                        continue;
                    }
                    if (q != null) {
                        ((mg9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                        return;
                    }
                }
            }
        }
    }

    public final void D(Editable editable) {
        gn[] gnVarArr;
        ll0 ll0Var = this.y;
        if (ll0Var != null && ch9.y3(ll0Var.b) && wi8.A(editable)) {
            ne9 ne9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = ne9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((ne9Var.getTextSize() * 0.85f) / 1.2f));
            for (dw3 dw3Var : (dw3[]) editable.getSpans(0, editable.length(), dw3.class)) {
                dw3Var.b = 0.85f;
            }
            for (gn gnVar : (gn[]) editable.getSpans(0, editable.length(), gn.class)) {
                gnVar.replaceFontMetrics(fontMetricsInt);
                gnVar.setSize(max);
            }
        }
    }

    public final void F() {
        uk9 uk9Var;
        int i;
        int i2;
        ll0 ll0Var = this.y;
        if (ll0Var != null && ll0Var.c > 0 && (uk9Var = this.E) != null) {
            int b = ((mg9) uk9Var).b(ll0Var);
            int a = ((mg9) this.E).a(this.y);
            ll0 ll0Var2 = this.y;
            if (ll0Var2.n) {
                if (ll0Var2.l <= 0) {
                    b = 0;
                } else {
                    b = gm.L(((i2 - 1) << 4) + 10);
                }
            }
            ll0 ll0Var3 = this.y;
            if (ll0Var3.o) {
                if (ll0Var3.m <= 0) {
                    a = 0;
                } else {
                    a = gm.L(((i - 1) << 4) + 10);
                }
            }
            if (b != getPaddingTop() || a != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b, getPaddingRight(), a);
            }
        }
    }

    public final void G() {
        ll0 ll0Var = this.y;
        ne9 ne9Var = this.f;
        ne9 ne9Var2 = this.h;
        if (ll0Var != null && n(ll0Var.b) && (ne9Var.length() > 0 || ne9Var2.length() > 0)) {
            if (ne9Var2.getVisibility() != 0) {
                ne9Var2.setVisibility(0);
                requestLayout();
            }
        } else if (ne9Var2.getVisibility() != 8) {
            if (ne9Var2.isFocused()) {
                ne9Var.requestFocus();
            }
            ne9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        ne9 ne9Var = this.f;
        if (ne9Var.getText() != null) {
            Editable text = ne9Var.getText();
            int i2 = -1;
            if (m() && ((TL_iv.pageBlockBlockquote) this.y.b).collapsed && (layout = ne9Var.getLayout()) != null && layout.getLineCount() > 3 && (lineStart = layout.getLineStart(3)) < (i = text.length())) {
                i2 = lineStart;
            } else {
                i = -1;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                yl ylVar = this.Q;
                if (ylVar != null) {
                    text.removeSpan(ylVar);
                }
                if (i2 >= 0) {
                    yl ylVar2 = this.Q;
                    if (ylVar2 == null) {
                        ylVar2 = new yl(this, (byte) 2);
                        this.Q = ylVar2;
                    }
                    text.setSpan(ylVar2, i2, i, 33);
                }
                this.T = false;
                this.R = i2;
                this.S = i;
            } catch (Throwable th) {
                this.T = false;
                throw th;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        ne9 ne9Var = this.h;
        if (ne9Var != null) {
            ne9Var.updateColors();
        }
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.d.setTextColor(cmb.v0(i, ylbVar));
        if (this.L != null) {
            int v0 = cmb.v0(cmb.Ei, ylbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        p99 p99Var = this.K;
        if (p99Var != null) {
            uue.a(p99Var, ylbVar);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z) {
        float f;
        boolean z2 = pageBlock instanceof TL_iv.pageBlockPreformatted;
        LinearLayout linearLayout = this.s;
        if (!z2) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (linearLayout != null && z) {
            gm.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = cmb.h6;
            anb.R(linearLayout3, cmb.Y(cmb.v0(i, this.a), gm.L(3.0f), gm.L(3.0f)), null, anb.M(i), this.a);
            this.s.setPadding(gm.L(6.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
            addView(this.s, qoe.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, qoe.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(2131230874);
            this.s.addView(this.x, qoe.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ml8 ml8Var = el2.a;
            synchronized (ml8Var.a) {
                if (!ml8Var.f) {
                    ml8Var.b.execute(new hl8(ml8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new pk9(this, (byte) 1));
            this.s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = cmb.F6;
        int v0 = cmb.v0(i2, this.a);
        float f2 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f = 0.5f;
        } else {
            f = 0.75f;
        }
        cmb.p1(f, v0);
        if (TextUtils.isEmpty(str)) {
            f2 = 0.5f;
        }
        wmb K = anb.K(f2, i2);
        ImageView imageView2 = this.x;
        ylb ylbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f3 = K.d;
        int P = anb.P(i3, -1, 2, f3, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        anb.N(imageView2, 5, i3, -1, 2, f3, ylbVar, P, porterDuffColorFilter).h = mode;
        anb.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(jb6.M0(2131753982, null));
        } else {
            textView2.setText(h47.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        ll0 ll0Var = this.y;
        boolean z = false;
        if (ll0Var != null && ll0Var.d > 0) {
            ne9 ne9Var = this.f;
            if (ne9Var.length() > 0 && (ne9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        if (z) {
            typeface = gm.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        ll0 ll0Var2 = this.y;
        if (ll0Var2 != null && ll0Var2.d > 0) {
            a(ll0Var2);
        }
    }

    public final void a(ll0 ll0Var) {
        int i;
        int e;
        int i2;
        ll0 ll0Var2;
        int i3;
        String k;
        int i4 = ll0Var.c;
        xd9 xd9Var = this.e;
        t8 t8Var = this.d;
        View view = this.c;
        if (i4 <= 0) {
            view.setVisibility(8);
            t8Var.setVisibility(8);
            xd9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = gm.L(24.0f) * (i4 - 1);
        view.setLayoutParams(layoutParams);
        if (i4 > 1) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (ll0Var.e) {
            t8Var.setVisibility(8);
            xd9Var.setVisibility(0);
            ((CheckBoxBase) xd9Var.b).f(-1, ll0Var.f, false);
            return;
        }
        xd9Var.setVisibility(8);
        t8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t8Var.getLayoutParams();
        if (ll0Var.d == 0) {
            e = gm.L(18.0f);
        } else {
            uk9 uk9Var = this.E;
            if (uk9Var != null) {
                TextPaint paint = t8Var.getPaint();
                ArrayList arrayList = ((mg9) uk9Var).a.t3;
                int indexOf = arrayList.indexOf(ll0Var);
                if (indexOf >= 0 && (i2 = ll0Var.c) > 0 && ll0Var.d > 0) {
                    int i5 = indexOf;
                    while (i5 > 0) {
                        ll0 ll0Var3 = (ll0) arrayList.get(i5 - 1);
                        int i6 = ll0Var3.c;
                        if (i6 < i2 || (i6 == i2 && ll0Var3.d <= 0)) {
                            break;
                        }
                        i5--;
                    }
                    int i7 = indexOf + 1;
                    while (i7 < arrayList.size() && (i3 = (ll0Var2 = (ll0) arrayList.get(i7)).c) >= i2 && (i3 != i2 || ll0Var2.d > 0)) {
                        i7++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(gm.o());
                    float f = 0.0f;
                    while (i5 < i7) {
                        ll0 ll0Var4 = (ll0) arrayList.get(i5);
                        if (ll0Var4.c == i2 && ll0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(ll0Var4.d + "."));
                        }
                        i5++;
                    }
                    e = kt6.e(10.0f, (int) Math.ceil(f), gm.L(28.0f));
                } else {
                    e = kt6.e(10.0f, (int) Math.ceil(paint.measureText(hg9.k(new StringBuilder(), ll0Var.d, "."))), gm.L(28.0f));
                }
            } else {
                int L = gm.L(28.0f);
                TextPaint paint3 = t8Var.getPaint();
                e = kt6.e(10.0f, (int) Math.ceil(paint3.measureText(ll0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            t8Var.setLayoutParams(layoutParams2);
        }
        if (ll0Var.d == 0) {
            k = "";
        } else {
            k = hg9.k(new StringBuilder(), ll0Var.d, ".");
        }
        t8Var.setText(k);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    public final void d(defpackage.ll0 r27, defpackage.uk9 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk9.d(ll0, uk9, boolean):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.f(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.f(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.f(false);
                    if (contains && m()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        uk9 uk9Var = this.E;
                        if (uk9Var != null) {
                            ch9 ch9Var = ((mg9) uk9Var).a;
                            of9 of9Var = ch9Var.R3;
                            if (of9Var != null) {
                                of9Var.g();
                            }
                            ch9Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.f(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        Layout layout;
        u30 u30Var;
        int L;
        boolean z;
        if (i()) {
            ne9 ne9Var = this.h;
            if (ne9Var.getVisibility() == 0 && (layout = ne9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new u30(this);
                }
                boolean z2 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + ne9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + ne9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + ne9Var.getPaddingTop() + measuredHeight;
                int L2 = gm.L(3.333f);
                this.M.getClass();
                float y = kt6.y(16.0f, i, L2) - ((gm.L(23.66f) + u30Var.b) + (gm.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L2;
                float L3 = i3 - gm.L(17.66f);
                float f = i3;
                if (lineRight > y) {
                    z = true;
                } else {
                    z = false;
                }
                if (lineBottom <= L3 || lineTop >= f) {
                    z2 = false;
                }
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + gm.L(4.0f)) + L) + L2) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            g(ll0Var.b);
        }
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() != 0) {
            ne9Var.setVisibility(0);
            requestLayout();
        }
        ne9Var.O();
        ne9Var.setSelection(ne9Var.length());
    }

    public ne9 getAuthorEditText() {
        return this.h;
    }

    public ne9 getEditText() {
        return this.f;
    }

    public ll0 getRow() {
        return this.y;
    }

    public gm4 getStyleDelegate() {
        return this.f;
    }

    public final boolean i() {
        Layout layout;
        if (!m() || (layout = this.f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        ne9 ne9Var = this.f;
        Layout layout2 = ne9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new zj9(layout2, ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        ne9 ne9Var2 = this.h;
        if (ne9Var2.getVisibility() == 0 && (layout = ne9Var2.getLayout()) != null) {
            arrayList.add(new zj9(layout, ne9Var2.getPaddingLeft() + ne9Var2.getLeft(), ne9Var2.getPaddingTop() + ne9Var2.getTop(), (byte) 2));
        }
    }

    public final boolean l() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        ll0 ll0Var = this.y;
        if (ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    public final void o(boolean z) {
        uk9 uk9Var;
        this.f.setHint(getHint());
        if (!z && (uk9Var = this.E) != null) {
            ((mg9) uk9Var).a.p3.b(this, null);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        ne9Var.layout(paddingLeft, measuredHeight, ne9Var.getMeasuredWidth() + paddingLeft, ne9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        ne9Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + ne9Var.getMeasuredHeight() + measuredHeight;
        int e = e(size, paddingBottom);
        this.P = e;
        setMeasuredDimension(size, paddingBottom + e);
    }

    public void setLocked(boolean z) {
        this.f.setLocked(z);
        this.h.setLocked(z);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(cmb.c6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        ll0 ll0Var = this.y;
        if (ll0Var != null && n(ll0Var.b)) {
            TL_iv.PageBlock pageBlock = this.y.b;
            TL_iv.RichText f = zk9.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            u30 u30Var = this.M;
            if (u30Var != null) {
                if (drawable != ((ho) u30Var.e) && drawable != ((c09) u30Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            b(ll0Var.b, this.f.getText());
        }
    }
}
