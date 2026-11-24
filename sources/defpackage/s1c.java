package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
public abstract class s1c extends my0 implements jm7 {
    public static final String[] R1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S1;
    public final Drawable A1;
    public final Drawable B1;
    public int C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public final d1c G1;
    public final r1c H1;
    public final gkb I1;
    public final rkb J1;
    public final View K1;
    public final TextView L1;
    public d M1;
    public rac N1;
    public boolean O1;
    public final ln P1;
    public Boolean Q1;
    public Integer l1;
    public final CharSequence m1;
    public final TLRPC.InputPeer n1;
    public final int o1;
    public final boolean p1;
    public final TL_iv.RichMessage q1;
    public final mi9 r1;
    public final mi9 s1;
    public final String t1;
    public String u1;
    public String v1;
    public final p1c w1;
    public final t8 x1;
    public final c1c y1;
    public final l66 z1;

    public s1c(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, TL_iv.RichMessage richMessage) {
        super(1, (ylb) null, context, false);
        String charSequence2;
        View view;
        this.E1 = cmb.I.o();
        this.O1 = true;
        this.u0 = 0;
        J();
        this.m1 = charSequence;
        this.n1 = inputPeer;
        this.o1 = i;
        this.p1 = z;
        this.q1 = richMessage;
        this.t1 = str;
        this.u1 = str2;
        l1c l1cVar = new l1c(this, context);
        this.b = l1cVar;
        this.P1 = new ln(320L, l1cVar, d53.h);
        t8 t8Var = new t8(context, (byte) 12);
        this.x1 = t8Var;
        t8Var.setPadding(gm.L(22.0f), gm.L(12.0f), gm.L(22.0f), gm.L(6.0f));
        t8Var.setTextSize(1, gda.S0);
        int i2 = cmb.i5;
        anb.X(t8Var, i2, null);
        wmb K = anb.K(0.2f, i2);
        anb.n(t8Var, 2, K.a, -1, 2, K.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        t8Var.setText(gw3.m(charSequence2, t8Var.getPaint().getFontMetricsInt(), true, null, 0));
        this.y1 = new FrameLayout(context);
        l66 l66Var = new l66(context, null);
        this.z1 = l66Var;
        l66Var.setDisablePaddingsOffsetY(true);
        l66Var.setPadding(gm.L(22.0f), gm.L(12.0f), gm.L(22.0f), gm.L(6.0f));
        l66Var.setTextSize(1, gda.S0);
        anb.X(l66Var, i2, null);
        anb.G(l66Var, cmb.Wc, null);
        l66Var.setTextIsSelectable(true);
        anb.C(l66Var, cmb.kg, null);
        int v0 = cmb.v0(cmb.lg, this.J0);
        this.D1 = v0;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !p0f.b()) {
                Drawable textSelectHandleLeft = l66Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(v0, mode);
                l66Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.A1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = l66Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(v0, mode);
                l66Var.setTextSelectHandleRight(textSelectHandleRight);
                this.B1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.y1.addView(this.z1, qoe.c(-1.0f, -1));
        if (this.q1 != null) {
            mi9 mi9Var = new mi9(this.a, null, context);
            this.r1 = mi9Var;
            mi9Var.setPadding(gm.L(22.0f), gm.L(12.0f), gm.L(22.0f), gm.L(6.0f));
            mi9Var.set(this.q1);
            mi9Var.setTranslationLoading(true);
            mi9 mi9Var2 = new mi9(this.a, null, context);
            this.s1 = mi9Var2;
            mi9Var2.setPadding(gm.L(22.0f), gm.L(12.0f), gm.L(22.0f), gm.L(6.0f));
        }
        d1c d1cVar = new d1c(this, context);
        this.G1 = d1cVar;
        d1cVar.setOverScrollMode(1);
        d1cVar.setPadding(0, gm.L(56.0f) + gm.m, 0, gm.L(80.0f));
        d1cVar.setClipToPadding(true);
        u46 u46Var = new u46();
        d1cVar.setLayoutManager(u46Var);
        if (this.q1 != null) {
            view = this.r1;
        } else {
            view = this.x1;
        }
        ?? y59Var = new y59();
        y59Var.e = 1;
        y59Var.c = context;
        y59Var.d = view;
        this.H1 = y59Var;
        d1cVar.setAdapter(y59Var);
        d1cVar.setOnScrollListener(new e1c(this));
        f1c f1cVar = new f1c(this);
        f1cVar.n(180L);
        f1cVar.o(new LinearInterpolator());
        d1cVar.setItemAnimator(f1cVar);
        this.b.addView(d1cVar, qoe.e(-1, -2, 80));
        gkb gkbVar = new gkb();
        this.I1 = gkbVar;
        gkbVar.Q(d1cVar);
        gkbVar.z0 = u46Var;
        rkb m = gkbVar.m(context);
        this.J1 = m;
        gm.B2(m);
        this.b.addView(m, qoe.e(-1, -1, 119));
        mi9 mi9Var3 = this.s1;
        if (mi9Var3 != null) {
            mi9Var3.setTextSelectionHelper(gkbVar);
        }
        p1c p1cVar = new p1c(this, context);
        this.w1 = p1cVar;
        this.b.addView(p1cVar, qoe.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        anb.h(cmb.g5, null, frameLayout);
        View view2 = new View(context);
        this.K1 = view2;
        anb.h(cmb.U5, null, view2);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, qoe.a(-1.0f, gm.e1() / gm.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.L1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        anb.X(textView, cmb.Ii, null);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(jb6.M0(2131751974, null));
        int w0 = cmb.w0(null, cmb.Ei, false);
        this.C1 = w0;
        textView.setBackground(ulb.e(w0, 24.0f));
        textView.setOnClickListener(new oha(this, (byte) 26));
        frameLayout.addView(textView, qoe.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.b.addView(frameLayout, qoe.e(-1, -2, 87));
        S0();
    }

    public static void D0(String str, String str2, String str3, jac jacVar) {
        if (str2 == null) {
            eoe.b(str, new b1c(jacVar, str, str3), new b1c(jacVar, str, str3), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < encode.length()) {
                int min = Math.min(i + 5000, encode.length());
                int i2 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i2);
                if (lastIndexOf < i) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i2);
                    if (lastIndexOf2 >= i) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i, min));
                i = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i4 = 0;
            while (i4 < arrayList.size()) {
                jac jacVar2 = jacVar;
                new h1c(str2, str3, (String) arrayList.get(i4), new e(zArr, arrayList2, i4, jacVar2, (byte) 9)).start();
                i4++;
                jacVar = jacVar2;
            }
            return;
        }
        new h1c(str2, str3, encode, jacVar).start();
    }

    public static String E0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String G0() {
        return oc7.d1().getString("translate_to_language", jb6.D0().y.getLanguage());
    }

    public static HashMap H0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j = gw3.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i = 0; i < j.size(); i++) {
                ew3 ew3Var = (ew3) j.get(i);
                if (ew3Var != null && ew3Var.c != null) {
                    String substring = charSequence2.substring(ew3Var.a, ew3Var.b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(ew3Var);
                }
            }
        }
        return hashMap;
    }

    public static String J0(String str, boolean[] zArr, boolean[] zArr2) {
        hb6 hb6Var;
        String str2;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        if (zArr != null) {
            String N0 = jb6.N0("TranslateLanguage" + str3.toUpperCase());
            boolean startsWith = N0.startsWith("LOC_ERR");
            zArr[0] = startsWith ^ true;
            if (!startsWith) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = jb6.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            boolean startsWith2 = N02.startsWith("LOC_ERR");
            zArr2[0] = startsWith2 ^ true;
            if (!startsWith2) {
                return N02;
            }
        }
        String R0 = R0(str, false);
        if (R0 == null) {
            R0 = R0(str3, false);
        }
        if (R0 != null) {
            return R0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        hb6 hb6Var2 = jb6.D0().B;
        Iterator it = jb6.D0().N.values().iterator();
        while (true) {
            if (it.hasNext()) {
                hb6Var = (hb6) it.next();
                String str4 = hb6Var.d;
                if (str4 != null && str4.equals("remote") && ((str2 = hb6Var.c) == null || !str2.endsWith("_raw"))) {
                    String str5 = hb6Var.f;
                    if (str5 != null && str5.equals(str)) {
                        break;
                    }
                }
            } else {
                hb6Var = null;
                break;
            }
        }
        if (hb6Var == null) {
            return null;
        }
        if (hb6Var2 != null && "en".equals(hb6Var2.f)) {
            return hb6Var.b;
        }
        return hb6Var.a;
    }

    public static String K0(String str) {
        String J0 = J0(str, null, null);
        if (J0 == null) {
            return null;
        }
        return J0.substring(0, 1).toUpperCase() + J0.substring(1);
    }

    public static TLRPC.TL_textWithEntities L0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        ew3 ew3Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 != null && tL_textWithEntities2.text != null) {
            for (int i = 0; i < tL_textWithEntities2.entities.size(); i++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i2 = messageEntity.offset;
                        String substring = str.substring(i2, messageEntity.length + i2);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i < arrayList.size() && (tL_textWithEntities.entities.get(i) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i).language;
                }
            }
            if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
                HashMap H0 = H0(tL_textWithEntities.text);
                HashMap H02 = H0(tL_textWithEntities2.text);
                for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i3);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i4 = messageEntity2.offset;
                        String substring2 = str2.substring(i4, messageEntity2.length + i4);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) H0.get(substring2);
                            ArrayList arrayList3 = (ArrayList) H02.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList2.size()) {
                                        ew3 ew3Var2 = (ew3) arrayList2.get(i5);
                                        int i6 = ew3Var2.a;
                                        int i7 = messageEntity2.offset;
                                        if (i6 == i7 && ew3Var2.b == i7 + messageEntity2.length) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        i5 = -1;
                                        break;
                                    }
                                }
                                if (i5 >= 0 && i5 < arrayList3.size() && (ew3Var = (ew3) arrayList3.get(i5)) != null) {
                                    int i8 = ew3Var.b;
                                    int i9 = ew3Var.a;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i10);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i11 = messageEntity3.offset;
                                                if (!gm.z1(i9, i8, i11, messageEntity3.length + i11)) {
                                                }
                                            }
                                            i10++;
                                        } else {
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                            tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                            tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                            tL_messageEntityCustomEmoji.offset = i9;
                                            tL_messageEntityCustomEmoji.length = i8 - i9;
                                            tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return tL_textWithEntities2;
        }
        return null;
    }

    public static void O0(String str) {
        oc7.d1().edit().putString("translate_to_language", str).apply();
    }

    public static i1c P0(Activity activity, yv1 yv1Var, TLRPC.InputPeer inputPeer, int i, boolean z, String str, String str2, CharSequence charSequence, boolean z2, jn1 jn1Var, Runnable runnable) {
        i1c i1cVar = new i1c(activity, str, str2, charSequence, inputPeer, i, z, runnable);
        i1cVar.N0(z2);
        i1cVar.M1 = yv1Var;
        i1cVar.N1 = jn1Var;
        if (yv1Var.getParentActivity() != null) {
            yv1Var.showDialog(i1cVar);
        }
        return i1cVar;
    }

    public static void Q0(Context context, d dVar, String str, String str2, CharSequence charSequence, k22 k22Var, zcb zcbVar) {
        if (context == null) {
            return;
        }
        k1c k1cVar = new k1c(context, str, str2, charSequence, zcbVar);
        k1cVar.N0(false);
        k1cVar.M1 = dVar;
        k1cVar.N1 = k22Var;
        if (dVar != null) {
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(k1cVar);
                return;
            }
            return;
        }
        k1cVar.show();
    }

    public static String R0(String str, boolean z) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (S1 == null) {
                S1 = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i = 0; i < availableLocales.length; i++) {
                        S1.put(availableLocales[i].getLanguage(), availableLocales[i]);
                        String country = availableLocales[i].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = S1;
                            hashMap.put(availableLocales[i].getLanguage() + "-" + country.toLowerCase(), availableLocales[i]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) S1.get(lowerCase);
                if (locale3 != null) {
                    if (z) {
                        locale = locale3;
                    } else {
                        locale = Locale.getDefault();
                    }
                    String displayLanguage = locale3.getDisplayLanguage(locale);
                    if (lowerCase.contains("-")) {
                        if (z) {
                            locale2 = locale3;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        String displayCountry = locale3.getDisplayCountry(locale2);
                        if (!TextUtils.isEmpty(displayCountry)) {
                            return displayLanguage + " (" + displayCountry + ")";
                        }
                        return displayLanguage;
                    }
                    return displayLanguage;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final float F0(boolean z) {
        ln lnVar;
        d1c d1cVar = this.G1;
        float top = d1cVar.getTop();
        if (d1cVar.getChildCount() >= 1) {
            top += Math.max(0, d1cVar.getChildAt(d1cVar.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - gm.L(78.0f));
        if (z && (lnVar = this.P1) != null) {
            if (!d1cVar.J1 && !this.F1) {
                return lnVar.e(false, max);
            }
            lnVar.e(true, max);
        }
        return max;
    }

    @Override
    public final void H() {
        if (this.l1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l1.intValue(), true);
            this.l1 = null;
        }
        super.H();
    }

    public final boolean I0() {
        d1c d1cVar;
        View childAt;
        float f = 0.0f;
        int i = 0;
        while (true) {
            d1cVar = this.G1;
            if (i >= d1cVar.getChildCount()) {
                break;
            }
            if (RecyclerView.R(d1cVar.getChildAt(i)) == 1) {
                f += childAt.getHeight();
            }
            i++;
        }
        if (f < (d1cVar.getHeight() - d1cVar.getPaddingTop()) - d1cVar.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final CharSequence M0(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N1 != null || this.M1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new q1(this, uRLSpan, (byte) 9), spanStart, spanEnd, 33);
                }
            }
        }
        return gw3.m(spannableStringBuilder, this.z1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void N0(boolean z) {
        l66 l66Var = this.z1;
        if (l66Var != null) {
            l66Var.setTextIsSelectable(!z);
        }
        if (z) {
            getWindow().addFlags(8192);
            gm.f2();
            return;
        }
        getWindow().clearFlags(8192);
        gm.f2();
    }

    public final void S0() {
        String charSequence;
        if (this.l1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l1.intValue(), true);
            this.l1 = null;
        }
        if ("alternative".equalsIgnoreCase(oc7.r1(this.a).l4.J2.f)) {
            T0();
            return;
        }
        String str = this.u1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        if (this.q1 != null && this.n1 != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags |= 1;
            tL_messages_translateRichMessage.peer = this.n1;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(this.o1));
            tL_messages_translateRichMessage.to_lang = b3c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateRichMessage, new go9(this, (byte) 17)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.m1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.p1 && this.n1 != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.peer = this.n1;
            tL_messages_summarizeText.id = this.o1;
            tL_messages_summarizeText.to_lang = b3c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_summarizeText, new kc((byte) 0), new s87(this, tL_textWithEntities, (byte) 17)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        TLRPC.InputPeer inputPeer = this.n1;
        int i = tL_messages_translateText.flags;
        if (inputPeer != null) {
            tL_messages_translateText.flags = i | 1;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(this.o1));
        } else {
            tL_messages_translateText.flags = i | 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = b3c.D(str);
        this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateText, new ara(this, tL_textWithEntities, (byte) 17)));
    }

    public final void T0() {
        String charSequence;
        CharSequence charSequence2 = this.m1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.t1;
        if (str != null) {
            str = str.split("_")[0];
        }
        String str2 = "no";
        if ("nb".equals(str)) {
            str = "no";
        }
        String str3 = this.u1;
        if (str3 != null) {
            str3 = str3.split("_")[0];
        }
        if (!"nb".equals(str3)) {
            str2 = str3;
        }
        D0(charSequence, str, str2, new o6b(this, (byte) 8));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            this.x1.invalidate();
            this.z1.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.M5);
        nm7.e().n(this, nm7.L5);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = cmb.w0(null, cmb.Ei, false);
            TextView textView = this.L1;
            if (textView != null && (w0 != this.C1 || this.E1 != cmb.I.o())) {
                this.C1 = w0;
                this.E1 = cmb.I.o();
                textView.setBackground(ulb.e(w0, 24.0f));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            int v0 = cmb.v0(cmb.lg, this.J0);
            if (v0 != this.D1) {
                this.D1 = v0;
                Drawable drawable = this.A1;
                if (drawable != null) {
                    drawable.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.B1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.M5);
        nm7.e().b(this, nm7.L5);
    }
}
