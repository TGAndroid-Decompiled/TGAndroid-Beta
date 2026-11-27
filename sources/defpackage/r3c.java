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
import org.telegram.ui.ActionBar.e;
public abstract class r3c extends nx0 implements fn7 {
    public static final String[] R1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S1;
    public final Drawable A1;
    public final Drawable B1;
    public int C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public final c3c G1;
    public final q3c H1;
    public final amb I1;
    public final lmb J1;
    public final View K1;
    public final TextView L1;
    public e M1;
    public qcc N1;
    public boolean O1;
    public final mm P1;
    public Boolean Q1;
    public Integer l1;
    public final CharSequence m1;
    public final TLRPC.InputPeer n1;
    public final int o1;
    public final boolean p1;
    public final TL_iv.RichMessage q1;
    public final zj9 r1;
    public final zj9 s1;
    public final String t1;
    public String u1;
    public String v1;
    public final o3c w1;
    public final u8 x1;
    public final b3c y1;
    public final p66 z1;

    public r3c(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, TL_iv.RichMessage richMessage) {
        super(1, (vnb) null, context, false);
        String charSequence2;
        View view;
        this.E1 = aob.I.o();
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
        k3c k3cVar = new k3c(this, context);
        this.b = k3cVar;
        this.P1 = new mm(320L, k3cVar, k43.h);
        u8 u8Var = new u8(context, (byte) 12);
        this.x1 = u8Var;
        u8Var.setPadding(hl.L(22.0f), hl.L(12.0f), hl.L(22.0f), hl.L(6.0f));
        u8Var.setTextSize(1, xea.S0);
        int i2 = aob.j5;
        yob.X(u8Var, i2, null);
        uob K = yob.K(0.2f, i2);
        yob.n(u8Var, 2, K.a, -1, 2, K.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        u8Var.setText(pv3.m(charSequence2, u8Var.getPaint().getFontMetricsInt(), true, null, 0));
        this.y1 = new FrameLayout(context);
        p66 p66Var = new p66(context, null);
        this.z1 = p66Var;
        p66Var.setDisablePaddingsOffsetY(true);
        p66Var.setPadding(hl.L(22.0f), hl.L(12.0f), hl.L(22.0f), hl.L(6.0f));
        p66Var.setTextSize(1, xea.S0);
        yob.X(p66Var, i2, null);
        yob.G(p66Var, aob.Xc, null);
        p66Var.setTextIsSelectable(true);
        yob.C(p66Var, aob.lg, null);
        int v0 = aob.v0(aob.mg, this.J0);
        this.D1 = v0;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !f3f.b()) {
                Drawable textSelectHandleLeft = p66Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(v0, mode);
                p66Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.A1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = p66Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(v0, mode);
                p66Var.setTextSelectHandleRight(textSelectHandleRight);
                this.B1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.y1.addView(this.z1, tre.c(-1.0f, -1));
        if (this.q1 != null) {
            zj9 zj9Var = new zj9(this.a, null, context);
            this.r1 = zj9Var;
            zj9Var.setPadding(hl.L(22.0f), hl.L(12.0f), hl.L(22.0f), hl.L(6.0f));
            zj9Var.set(this.q1);
            zj9Var.setTranslationLoading(true);
            zj9 zj9Var2 = new zj9(this.a, null, context);
            this.s1 = zj9Var2;
            zj9Var2.setPadding(hl.L(22.0f), hl.L(12.0f), hl.L(22.0f), hl.L(6.0f));
        }
        c3c c3cVar = new c3c(this, context);
        this.G1 = c3cVar;
        c3cVar.setOverScrollMode(1);
        c3cVar.setPadding(0, hl.L(56.0f) + hl.m, 0, hl.L(80.0f));
        c3cVar.setClipToPadding(true);
        x46 x46Var = new x46();
        c3cVar.setLayoutManager(x46Var);
        if (this.q1 != null) {
            view = this.r1;
        } else {
            view = this.x1;
        }
        ?? j79Var = new j79();
        j79Var.e = 1;
        j79Var.c = context;
        j79Var.d = view;
        this.H1 = j79Var;
        c3cVar.setAdapter(j79Var);
        c3cVar.setOnScrollListener(new d3c(this));
        e3c e3cVar = new e3c(this);
        e3cVar.n(180L);
        e3cVar.o(new LinearInterpolator());
        c3cVar.setItemAnimator(e3cVar);
        this.b.addView(c3cVar, tre.e(-1, -2, 80));
        amb ambVar = new amb();
        this.I1 = ambVar;
        ambVar.Q(c3cVar);
        ambVar.z0 = x46Var;
        lmb m = ambVar.m(context);
        this.J1 = m;
        hl.B2(m);
        this.b.addView(m, tre.e(-1, -1, 119));
        zj9 zj9Var3 = this.s1;
        if (zj9Var3 != null) {
            zj9Var3.setTextSelectionHelper(ambVar);
        }
        o3c o3cVar = new o3c(this, context);
        this.w1 = o3cVar;
        this.b.addView(o3cVar, tre.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        yob.h(aob.h5, null, frameLayout);
        View view2 = new View(context);
        this.K1 = view2;
        yob.h(aob.V5, null, view2);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, tre.a(-1.0f, hl.e1() / hl.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.L1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        yob.X(textView, aob.Ji, null);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(ob6.M0(2131752002, null));
        int w0 = aob.w0(null, aob.Fi, false);
        this.C1 = w0;
        textView.setBackground(rnb.e(w0, 24.0f));
        textView.setOnClickListener(new kla(this, (byte) 24));
        frameLayout.addView(textView, tre.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.b.addView(frameLayout, tre.e(-1, -2, 87));
        T0();
    }

    public static void E0(String str, String str2, String str3, icc iccVar) {
        if (str2 == null) {
            xqe.b(str, new a3c(iccVar, str, str3), new a3c(iccVar, str, str3), false);
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
                icc iccVar2 = iccVar;
                new g3c(str2, str3, (String) arrayList.get(i4), new f(zArr, arrayList2, i4, iccVar2, (byte) 10)).start();
                i4++;
                iccVar = iccVar2;
            }
            return;
        }
        new g3c(str2, str3, encode, iccVar).start();
    }

    public static String F0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String H0() {
        return uc7.e1().getString("translate_to_language", ob6.D0().y.getLanguage());
    }

    public static HashMap I0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j = pv3.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i = 0; i < j.size(); i++) {
                nv3 nv3Var = (nv3) j.get(i);
                if (nv3Var != null && nv3Var.c != null) {
                    String substring = charSequence2.substring(nv3Var.a, nv3Var.b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(nv3Var);
                }
            }
        }
        return hashMap;
    }

    public static String K0(String str, boolean[] zArr, boolean[] zArr2) {
        mb6 mb6Var;
        String str2;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        if (zArr != null) {
            String N0 = ob6.N0("TranslateLanguage" + str3.toUpperCase());
            boolean startsWith = N0.startsWith("LOC_ERR");
            zArr[0] = startsWith ^ true;
            if (!startsWith) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = ob6.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            boolean startsWith2 = N02.startsWith("LOC_ERR");
            zArr2[0] = startsWith2 ^ true;
            if (!startsWith2) {
                return N02;
            }
        }
        String S0 = S0(str, false);
        if (S0 == null) {
            S0 = S0(str3, false);
        }
        if (S0 != null) {
            return S0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        mb6 mb6Var2 = ob6.D0().B;
        Iterator it = ob6.D0().N.values().iterator();
        while (true) {
            if (it.hasNext()) {
                mb6Var = (mb6) it.next();
                String str4 = mb6Var.d;
                if (str4 != null && str4.equals("remote") && ((str2 = mb6Var.c) == null || !str2.endsWith("_raw"))) {
                    String str5 = mb6Var.f;
                    if (str5 != null && str5.equals(str)) {
                        break;
                    }
                }
            } else {
                mb6Var = null;
                break;
            }
        }
        if (mb6Var == null) {
            return null;
        }
        if (mb6Var2 != null && "en".equals(mb6Var2.f)) {
            return mb6Var.b;
        }
        return mb6Var.a;
    }

    public static String L0(String str) {
        String K0 = K0(str, null, null);
        if (K0 == null) {
            return null;
        }
        return K0.substring(0, 1).toUpperCase() + K0.substring(1);
    }

    public static TLRPC.TL_textWithEntities M0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        nv3 nv3Var;
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
                HashMap I0 = I0(tL_textWithEntities.text);
                HashMap I02 = I0(tL_textWithEntities2.text);
                for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i3);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i4 = messageEntity2.offset;
                        String substring2 = str2.substring(i4, messageEntity2.length + i4);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) I0.get(substring2);
                            ArrayList arrayList3 = (ArrayList) I02.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList2.size()) {
                                        nv3 nv3Var2 = (nv3) arrayList2.get(i5);
                                        int i6 = nv3Var2.a;
                                        int i7 = messageEntity2.offset;
                                        if (i6 == i7 && nv3Var2.b == i7 + messageEntity2.length) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        i5 = -1;
                                        break;
                                    }
                                }
                                if (i5 >= 0 && i5 < arrayList3.size() && (nv3Var = (nv3) arrayList3.get(i5)) != null) {
                                    int i8 = nv3Var.b;
                                    int i9 = nv3Var.a;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i10);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i11 = messageEntity3.offset;
                                                if (!hl.z1(i9, i8, i11, messageEntity3.length + i11)) {
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

    public static void P0(String str) {
        uc7.e1().edit().putString("translate_to_language", str).apply();
    }

    public static h3c Q0(Activity activity, zu1 zu1Var, TLRPC.InputPeer inputPeer, int i, boolean z, String str, String str2, CharSequence charSequence, boolean z2, do1 do1Var, Runnable runnable) {
        h3c h3cVar = new h3c(activity, str, str2, charSequence, inputPeer, i, z, runnable);
        h3cVar.O0(z2);
        h3cVar.M1 = zu1Var;
        h3cVar.N1 = do1Var;
        if (zu1Var.getParentActivity() != null) {
            zu1Var.showDialog(h3cVar);
        }
        return h3cVar;
    }

    public static void R0(Context context, e eVar, String str, String str2, CharSequence charSequence, p12 p12Var, s8b s8bVar) {
        if (context == null) {
            return;
        }
        j3c j3cVar = new j3c(context, str, str2, charSequence, s8bVar);
        j3cVar.O0(false);
        j3cVar.M1 = eVar;
        j3cVar.N1 = p12Var;
        if (eVar != null) {
            if (eVar.getParentActivity() != null) {
                eVar.showDialog(j3cVar);
                return;
            }
            return;
        }
        j3cVar.show();
    }

    public static String S0(String str, boolean z) {
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
    public final boolean D() {
        return false;
    }

    public final float G0(boolean z) {
        mm mmVar;
        c3c c3cVar = this.G1;
        float top = c3cVar.getTop();
        if (c3cVar.getChildCount() >= 1) {
            top += Math.max(0, c3cVar.getChildAt(c3cVar.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - hl.L(78.0f));
        if (z && (mmVar = this.P1) != null) {
            if (!c3cVar.J1 && !this.F1) {
                return mmVar.e(false, max);
            }
            mmVar.e(true, max);
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

    public final boolean J0() {
        c3c c3cVar;
        View childAt;
        float f = 0.0f;
        int i = 0;
        while (true) {
            c3cVar = this.G1;
            if (i >= c3cVar.getChildCount()) {
                break;
            }
            if (RecyclerView.S(c3cVar.getChildAt(i)) == 1) {
                f += childAt.getHeight();
            }
            i++;
        }
        if (f < (c3cVar.getHeight() - c3cVar.getPaddingTop()) - c3cVar.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final CharSequence N0(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N1 != null || this.M1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new r1(this, uRLSpan, (byte) 9), spanStart, spanEnd, 33);
                }
            }
        }
        return pv3.m(spannableStringBuilder, this.z1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void O0(boolean z) {
        p66 p66Var = this.z1;
        if (p66Var != null) {
            p66Var.setTextIsSelectable(!z);
        }
        if (z) {
            getWindow().addFlags(8192);
            hl.f2();
            return;
        }
        getWindow().clearFlags(8192);
        hl.f2();
    }

    public final void T0() {
        String charSequence;
        if (this.l1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l1.intValue(), true);
            this.l1 = null;
        }
        if ("alternative".equalsIgnoreCase(uc7.s1(this.a).l4.R2.f)) {
            U0();
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
            tL_messages_translateRichMessage.to_lang = a5c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateRichMessage, new yp9(this, (byte) 17)));
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
            tL_messages_summarizeText.to_lang = a5c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_summarizeText, new ic((byte) 0), new ia7(this, tL_textWithEntities, (byte) 15)));
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
        tL_messages_translateText.to_lang = a5c.D(str);
        this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateText, new isa(this, tL_textWithEntities, (byte) 18)));
    }

    public final void U0() {
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
        E0(charSequence, str, str2, new l8b(this, (byte) 8));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            this.x1.invalidate();
            this.z1.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.L5);
        jn7.e().n(this, jn7.K5);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = aob.w0(null, aob.Fi, false);
            TextView textView = this.L1;
            if (textView != null && (w0 != this.C1 || this.E1 != aob.I.o())) {
                this.C1 = w0;
                this.E1 = aob.I.o();
                textView.setBackground(rnb.e(w0, 24.0f));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            int v0 = aob.v0(aob.mg, this.J0);
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
            cc4.g(e2, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.L5);
        jn7.e().b(this, jn7.K5);
    }
}
