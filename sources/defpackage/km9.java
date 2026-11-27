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
public final class km9 extends FrameLayout implements snb, zlb {
    public hm9 E;
    public boolean F;
    public boolean G;
    public fh9 H;
    public String I;
    public int J;
    public ab9 K;
    public Drawable L;
    public zb4 M;
    public final RectF N;
    public boolean O;
    public int P;
    public zk Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final vnb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final u8 d;
    public final nf9 e;
    public final dg9 f;
    public final dg9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public mk0 y;

    public km9(Context context, vnb vnbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.a0 = new Paint(1);
        this.a = vnbVar;
        setPadding(hl.L(16.0f), hl.L(5.0f), hl.L(16.0f), hl.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        u8 u8Var = new u8(this, context);
        this.d = u8Var;
        u8Var.setGravity(8388627);
        u8Var.setPaddingRelative(hl.L(6.0f), 0, 0, 0);
        u8Var.setSingleLine(true);
        u8Var.setIncludeFontPadding(false);
        u8Var.setTextSize(1, 16.0f);
        linearLayout.addView(u8Var, tre.o(18, -2));
        nf9 nf9Var = new nf9(context, vnbVar);
        this.e = nf9Var;
        nf9Var.setVisibility(8);
        nf9Var.setOnClickListener(new cm9(this, (byte) 0));
        linearLayout.addView(nf9Var, tre.o(18, -2));
        dg9 dg9Var = new dg9(context, vnbVar);
        this.f = dg9Var;
        dg9Var.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        dg9Var.setListener(new fm9(this));
        dg9Var.setDelegate(new vt3(this) {
            public final km9 b;

            {
                this.b = this;
            }

            @Override
            public final void c() {
                byte b = r2;
                km9 km9Var = this.b;
                switch (b) {
                    case 0:
                        if (!km9Var.T && km9Var.y != null) {
                            km9Var.K();
                            km9.b(km9Var.y.b, km9Var.f.getText());
                            hm9 hm9Var = km9Var.E;
                            if (hm9Var != null) {
                                ((zh9) hm9Var).a.X3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (km9Var.y != null) {
                            km9Var.v();
                            hm9 hm9Var2 = km9Var.E;
                            if (hm9Var2 != null) {
                                ((zh9) hm9Var2).a.X3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        dg9Var.setOnFocusChangeListener(new ts0(this, (byte) 17));
        linearLayout.addView(dg9Var, tre.l(1.0f, 0, -2));
        addView(linearLayout, tre.e(-1, -2, 51));
        dg9 dg9Var2 = new dg9(context, vnbVar);
        this.h = dg9Var2;
        dg9Var2.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(1.0f));
        dg9Var2.setAllowNewlines(false);
        dg9Var2.setInputType(147457);
        dg9Var2.setListener(new gm9(this));
        dg9Var2.setDelegate(new vt3(this) {
            public final km9 b;

            {
                this.b = this;
            }

            @Override
            public final void c() {
                byte b = r2;
                km9 km9Var = this.b;
                switch (b) {
                    case 0:
                        if (!km9Var.T && km9Var.y != null) {
                            km9Var.K();
                            km9.b(km9Var.y.b, km9Var.f.getText());
                            hm9 hm9Var = km9Var.E;
                            if (hm9Var != null) {
                                ((zh9) hm9Var).a.X3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (km9Var.y != null) {
                            km9Var.v();
                            hm9 hm9Var2 = km9Var.E;
                            if (hm9Var2 != null) {
                                ((zh9) hm9Var2).a.X3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        dg9Var2.setVisibility(8);
        addView(dg9Var2, tre.e(-1, -2, 51));
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
        pageBlock.text = mm9.f(charSequence);
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
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                if (mk0Var.p) {
                    i = 2131754007;
                } else {
                    i = 2131754023;
                }
                return ob6.M0(i, null);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return ob6.M0(2131754022, null);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                    return ob6.M0(2131754021, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                    return ob6.M0(2131754020, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                    return ob6.M0(2131754019, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                    return ob6.M0(2131754018, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    return ob6.M0(2131754012, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    return ob6.M0(2131754009, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ob6.M0(2131754009, null);
                }
                if (mk0Var.q) {
                    return ob6.M0(2131754008, null);
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

    public static boolean j(dg9 dg9Var, int i, int i2, int i3, int i4) {
        if (dg9Var.length() != 0 || i3 < i || i3 > dg9Var.getWidth() + i || i4 < i2 || i4 > dg9Var.getHeight() + i2) {
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

    public static jm9 q(mk0 mk0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str != null && mk0Var != null) {
            String trim = str.trim();
            int i3 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new jm9(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new jm9(u(charAt - '0'), mk0Var.c, mk0Var.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new jm9(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new jm9(pageblockpullquote, 0, 0);
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
                                return new jm9(t(i3, i), 0, 0);
                            }
                        }
                        i = 2;
                        return new jm9(t(i3, i), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new jm9(pageblockblockquote, 0, 0);
            }
            return new jm9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static jm9 r(mk0 mk0Var, String str) {
        int length;
        boolean z;
        char charAt;
        if (mk0Var != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = mk0Var.b;
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
                        return new jm9(u(i2), mk0Var.c, mk0Var.d);
                    }
                    return null;
                } else if (z2) {
                    if (mk0Var.c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new jm9(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c(pageblockparagraph, "");
                            return new jm9(pageblockparagraph, 1, 0);
                        }
                    }
                    if (mk0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return s(false);
                    }
                    if (mk0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return s(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return s(true);
                        }
                    }
                    if (mk0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        c(pageblockparagraph2, "");
                        return new jm9(pageblockparagraph2, 1, 1);
                    } else if (mk0Var.c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new jm9(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new jm9(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static jm9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new jm9(pageblockparagraph, 1, 0, true, z);
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
                pagetablerow.cells.add(ajb.f());
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

    public static boolean x(dg9 dg9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = dg9Var.getLayout();
        if (layout != null && dg9Var.length() != 0) {
            int paddingLeft = i3 - (dg9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (dg9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = hl.L(24.0f);
                int max = Math.max(0, (dg9Var.getWidth() - dg9Var.getPaddingLeft()) - dg9Var.getPaddingRight());
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
        return mm9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return mm9.r(pageBlock.text, pageBlock, true);
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
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                fh9 fh9Var = new fh9(this, (byte) 1);
                this.H = fh9Var;
                postDelayed(fh9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (fk2 fk2Var : (fk2[]) text.getSpans(0, text.length(), fk2.class)) {
                text.removeSpan(fk2Var);
            }
        }
        this.I = null;
    }

    public final void C(kf9 kf9Var) {
        if (this.E != null && this.y != null && kf9Var != null) {
            List<String> list = kf9Var.c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int p = p(str);
                    if (p != 0) {
                        ((zh9) this.E).c(this.y, p);
                        return;
                    }
                    jm9 q = q(this.y, str);
                    if (q == null) {
                        q = r(this.y, qd4.o(str, " "));
                        continue;
                    }
                    if (q != null) {
                        ((zh9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                        return;
                    }
                }
            }
        }
    }

    public final void D(Editable editable) {
        hm[] hmVarArr;
        mk0 mk0Var = this.y;
        if (mk0Var != null && pi9.z3(mk0Var.b) && ik8.A(editable)) {
            dg9 dg9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = dg9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((dg9Var.getTextSize() * 0.85f) / 1.2f));
            for (mv3 mv3Var : (mv3[]) editable.getSpans(0, editable.length(), mv3.class)) {
                mv3Var.b = 0.85f;
            }
            for (hm hmVar : (hm[]) editable.getSpans(0, editable.length(), hm.class)) {
                hmVar.replaceFontMetrics(fontMetricsInt);
                hmVar.setSize(max);
            }
        }
    }

    public final void F() {
        hm9 hm9Var;
        int i;
        int i2;
        mk0 mk0Var = this.y;
        if (mk0Var != null && mk0Var.c > 0 && (hm9Var = this.E) != null) {
            int b = ((zh9) hm9Var).b(mk0Var);
            int a = ((zh9) this.E).a(this.y);
            mk0 mk0Var2 = this.y;
            if (mk0Var2.n) {
                if (mk0Var2.l <= 0) {
                    b = 0;
                } else {
                    b = hl.L(((i2 - 1) << 4) + 10);
                }
            }
            mk0 mk0Var3 = this.y;
            if (mk0Var3.o) {
                if (mk0Var3.m <= 0) {
                    a = 0;
                } else {
                    a = hl.L(((i - 1) << 4) + 10);
                }
            }
            if (b != getPaddingTop() || a != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b, getPaddingRight(), a);
            }
        }
    }

    public final void G() {
        mk0 mk0Var = this.y;
        dg9 dg9Var = this.f;
        dg9 dg9Var2 = this.h;
        if (mk0Var != null && n(mk0Var.b) && (dg9Var.length() > 0 || dg9Var2.length() > 0)) {
            if (dg9Var2.getVisibility() != 0) {
                dg9Var2.setVisibility(0);
                requestLayout();
            }
        } else if (dg9Var2.getVisibility() != 8) {
            if (dg9Var2.isFocused()) {
                dg9Var.requestFocus();
            }
            dg9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        dg9 dg9Var = this.f;
        if (dg9Var.getText() != null) {
            Editable text = dg9Var.getText();
            int i2 = -1;
            if (m() && ((TL_iv.pageBlockBlockquote) this.y.b).collapsed && (layout = dg9Var.getLayout()) != null && layout.getLineCount() > 3 && (lineStart = layout.getLineStart(3)) < (i = text.length())) {
                i2 = lineStart;
            } else {
                i = -1;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                zk zkVar = this.Q;
                if (zkVar != null) {
                    text.removeSpan(zkVar);
                }
                if (i2 >= 0) {
                    zk zkVar2 = this.Q;
                    if (zkVar2 == null) {
                        zkVar2 = new zk(this, (byte) 2);
                        this.Q = zkVar2;
                    }
                    text.setSpan(zkVar2, i2, i, 33);
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
        dg9 dg9Var = this.h;
        if (dg9Var != null) {
            dg9Var.updateColors();
        }
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.d.setTextColor(aob.v0(i, vnbVar));
        if (this.L != null) {
            int v0 = aob.v0(aob.Fi, vnbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        ab9 ab9Var = this.K;
        if (ab9Var != null) {
            nxe.a(ab9Var, vnbVar);
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
            hl.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = aob.i6;
            yob.R(linearLayout3, aob.Y(aob.v0(i, this.a), hl.L(3.0f), hl.L(3.0f)), null, yob.M(i), this.a);
            this.s.setPadding(hl.L(6.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
            addView(this.s, tre.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, tre.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(2131230873);
            this.s.addView(this.x, tre.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            wm8 wm8Var = mk2.a;
            synchronized (wm8Var.a) {
                if (!wm8Var.f) {
                    wm8Var.b.execute(new rm8(wm8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new cm9(this, (byte) 1));
            this.s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = aob.G6;
        int v0 = aob.v0(i2, this.a);
        float f2 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f = 0.5f;
        } else {
            f = 0.75f;
        }
        aob.p1(f, v0);
        if (TextUtils.isEmpty(str)) {
            f2 = 0.5f;
        }
        uob K = yob.K(f2, i2);
        ImageView imageView2 = this.x;
        vnb vnbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f3 = K.d;
        int P = yob.P(i3, -1, 2, f3, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        yob.N(imageView2, 5, i3, -1, 2, f3, vnbVar, P, porterDuffColorFilter).h = mode;
        yob.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(ob6.M0(2131754010, null));
        } else {
            textView2.setText(o47.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        mk0 mk0Var = this.y;
        boolean z = false;
        if (mk0Var != null && mk0Var.d > 0) {
            dg9 dg9Var = this.f;
            if (dg9Var.length() > 0 && (dg9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        if (z) {
            typeface = hl.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        mk0 mk0Var2 = this.y;
        if (mk0Var2 != null && mk0Var2.d > 0) {
            a(mk0Var2);
        }
    }

    public final void a(mk0 mk0Var) {
        int i;
        int e;
        int i2;
        mk0 mk0Var2;
        int i3;
        String l;
        int i4 = mk0Var.c;
        nf9 nf9Var = this.e;
        u8 u8Var = this.d;
        View view = this.c;
        if (i4 <= 0) {
            view.setVisibility(8);
            u8Var.setVisibility(8);
            nf9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = hl.L(24.0f) * (i4 - 1);
        view.setLayoutParams(layoutParams);
        if (i4 > 1) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (mk0Var.e) {
            u8Var.setVisibility(8);
            nf9Var.setVisibility(0);
            ((CheckBoxBase) nf9Var.b).f(-1, mk0Var.f, false);
            return;
        }
        nf9Var.setVisibility(8);
        u8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) u8Var.getLayoutParams();
        if (mk0Var.d == 0) {
            e = hl.L(18.0f);
        } else {
            hm9 hm9Var = this.E;
            if (hm9Var != null) {
                TextPaint paint = u8Var.getPaint();
                ArrayList arrayList = ((zh9) hm9Var).a.t3;
                int indexOf = arrayList.indexOf(mk0Var);
                if (indexOf >= 0 && (i2 = mk0Var.c) > 0 && mk0Var.d > 0) {
                    int i5 = indexOf;
                    while (i5 > 0) {
                        mk0 mk0Var3 = (mk0) arrayList.get(i5 - 1);
                        int i6 = mk0Var3.c;
                        if (i6 < i2 || (i6 == i2 && mk0Var3.d <= 0)) {
                            break;
                        }
                        i5--;
                    }
                    int i7 = indexOf + 1;
                    while (i7 < arrayList.size() && (i3 = (mk0Var2 = (mk0) arrayList.get(i7)).c) >= i2 && (i3 != i2 || mk0Var2.d > 0)) {
                        i7++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(hl.o());
                    float f = 0.0f;
                    while (i5 < i7) {
                        mk0 mk0Var4 = (mk0) arrayList.get(i5);
                        if (mk0Var4.c == i2 && mk0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(mk0Var4.d + "."));
                        }
                        i5++;
                    }
                    e = qu6.e(10.0f, (int) Math.ceil(f), hl.L(28.0f));
                } else {
                    e = qu6.e(10.0f, (int) Math.ceil(paint.measureText(uh9.l(new StringBuilder(), mk0Var.d, "."))), hl.L(28.0f));
                }
            } else {
                int L = hl.L(28.0f);
                TextPaint paint3 = u8Var.getPaint();
                e = qu6.e(10.0f, (int) Math.ceil(paint3.measureText(mk0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            u8Var.setLayoutParams(layoutParams2);
        }
        if (mk0Var.d == 0) {
            l = "";
        } else {
            l = uh9.l(new StringBuilder(), mk0Var.d, ".");
        }
        u8Var.setText(l);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    public final void d(defpackage.mk0 r27, defpackage.hm9 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.d(mk0, hm9, boolean):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.dispatchDraw(android.graphics.Canvas):void");
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
                            this.M.d(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.d(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.d(false);
                    if (contains && m()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        hm9 hm9Var = this.E;
                        if (hm9Var != null) {
                            pi9 pi9Var = ((zh9) hm9Var).a;
                            ch9 ch9Var = pi9Var.R3;
                            if (ch9Var != null) {
                                ch9Var.g();
                            }
                            pi9Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.d(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        Layout layout;
        zb4 zb4Var;
        int L;
        boolean z;
        if (i()) {
            dg9 dg9Var = this.h;
            if (dg9Var.getVisibility() == 0 && (layout = dg9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new zb4(this);
                }
                boolean z2 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + dg9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + dg9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + dg9Var.getPaddingTop() + measuredHeight;
                int L2 = hl.L(3.333f);
                this.M.getClass();
                float x = qu6.x(16.0f, i, L2) - ((hl.L(23.66f) + zb4Var.a) + (hl.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L2;
                float L3 = i3 - hl.L(17.66f);
                float f = i3;
                if (lineRight > x) {
                    z = true;
                } else {
                    z = false;
                }
                if (lineBottom <= L3 || lineTop >= f) {
                    z2 = false;
                }
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + hl.L(4.0f)) + L) + L2) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            g(mk0Var.b);
        }
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() != 0) {
            dg9Var.setVisibility(0);
            requestLayout();
        }
        dg9Var.O();
        dg9Var.setSelection(dg9Var.length());
    }

    public dg9 getAuthorEditText() {
        return this.h;
    }

    public dg9 getEditText() {
        return this.f;
    }

    public mk0 getRow() {
        return this.y;
    }

    public km4 getStyleDelegate() {
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
        dg9 dg9Var = this.f;
        Layout layout2 = dg9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new ml9(layout2, dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        dg9 dg9Var2 = this.h;
        if (dg9Var2.getVisibility() == 0 && (layout = dg9Var2.getLayout()) != null) {
            arrayList.add(new ml9(layout, dg9Var2.getPaddingLeft() + dg9Var2.getLeft(), dg9Var2.getPaddingTop() + dg9Var2.getTop(), (byte) 2));
        }
    }

    public final boolean l() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        mk0 mk0Var = this.y;
        if (mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    public final void o(boolean z) {
        hm9 hm9Var;
        this.f.setHint(getHint());
        if (!z && (hm9Var = this.E) != null) {
            ((zh9) hm9Var).a.p3.b(this, null);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        dg9Var.layout(paddingLeft, measuredHeight, dg9Var.getMeasuredWidth() + paddingLeft, dg9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        dg9Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + dg9Var.getMeasuredHeight() + measuredHeight;
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
            if (getBackground() instanceof vg9) {
                ((vg9) getBackground()).a(aob.v0(aob.d6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v() {
        mk0 mk0Var = this.y;
        if (mk0Var != null && n(mk0Var.b)) {
            TL_iv.PageBlock pageBlock = this.y.b;
            TL_iv.RichText f = mm9.f(this.h.getText());
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
            zb4 zb4Var = this.M;
            if (zb4Var != null) {
                if (drawable != ((hn) zb4Var.e) && drawable != ((o19) zb4Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            b(mk0Var.b, this.f.getText());
        }
    }
}
