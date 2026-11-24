package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class xvc implements lv8, u29, z99, mv8 {
    public static volatile xvc f;
    public static final nw7 h = new Object();
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public xvc(File file) {
        String str;
        String str2;
        this.a = (byte) 7;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        long[] jArr = new long[1];
        this.e = jArr;
        this.b = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(H(bufferedReader));
        ki6 ki6Var = (ki6) hashMap.get("content-type");
        if (ki6Var == null) {
            str = null;
        } else {
            str = (String) ki6Var.b.get("boundary");
        }
        if (str != null) {
            int length = str.length() + 2;
            ji6 ji6Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (ji6Var != null) {
                        ji6Var.d = (jArr[0] - length) - 2;
                        arrayList.add(ji6Var);
                        ki6 ki6Var2 = (ki6) ji6Var.a.get("content-location");
                        if (ki6Var2 == null) {
                            str2 = null;
                        } else {
                            str2 = ki6Var2.a;
                        }
                        hashMap2.put(str2, ji6Var);
                    }
                    ji6Var = new ji6();
                    ji6Var.b = (File) this.b;
                    ji6Var.a.putAll(H(bufferedReader));
                    ji6Var.c = jArr[0];
                }
            }
            if (ji6Var != null && ji6Var.c != 0 && ji6Var.d != 0) {
                arrayList.add(ji6Var);
                ki6 ki6Var3 = (ki6) ji6Var.a.get("content-location");
                hashMap2.put(ki6Var3 != null ? ki6Var3.a : null, ji6Var);
            }
        }
        bufferedReader.close();
    }

    public static void b(String str, String str2, HashMap hashMap) {
        ki6 ki6Var = new ki6();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = ts2.m(1, 1, trim3);
                    }
                    ki6Var.b.put(trim2, trim3);
                } else {
                    ki6Var.a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), ki6Var);
    }

    public final boolean A() {
        yv1 yv1Var = ((glc) this.e).b.a.F3;
        if (yv1Var != null) {
            if (yv1Var.g9 == null) {
                Dialog visibleDialog = yv1Var.getVisibleDialog();
                if (visibleDialog != null && visibleDialog.isShowing()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean B() {
        return ((ArrayList) this.d).isEmpty();
    }

    public final void E(float f2, float f3) {
        ykc ykcVar;
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        glc glcVar = (glc) this.e;
        c cVar = glcVar.b;
        if (!Float.isNaN(f2) && (ykcVar = glcVar.K) != null && glcVar.c != 0) {
            ykcVar.getLocationInWindow(iArr2);
            ((ViewGroup) this.d).getLocationInWindow(iArr);
            cVar.g((f2 + iArr2[1]) - iArr[1], f3);
            return;
        }
        cVar.g(Float.NaN, 0.0f);
    }

    public final void F() {
        glc glcVar = (glc) this.e;
        String trim = glcVar.n.trim();
        if (trim.isEmpty()) {
            return;
        }
        Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
        glcVar.m("field send");
        ChatActivityEnterView chatActivityEnterView = glcVar.b.a;
        int i = ChatActivityEnterView.z7;
        chatActivityEnterView.E2(trim, new mw1(chatActivityEnterView, (byte) 23));
    }

    public final void G(float f2, float f3, float f4, float f5) {
        glc glcVar = (glc) this.e;
        int[] iArr = glcVar.d0;
        int[] iArr2 = glcVar.c0;
        EditTextBoldCursor editTextBoldCursor = glcVar.X;
        if (editTextBoldCursor != null && glcVar.K != null) {
            int max = Math.max(1, Math.round(f4 - f2));
            int max2 = Math.max(1, Math.round(f5 - f3));
            ViewGroup.LayoutParams layoutParams = editTextBoldCursor.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != max || layoutParams.height != max2)) {
                layoutParams.width = max;
                layoutParams.height = max2;
                editTextBoldCursor.setLayoutParams(layoutParams);
            }
            Rect clipBounds = editTextBoldCursor.getClipBounds();
            if (clipBounds == null || clipBounds.width() != max || clipBounds.height() != max2 || clipBounds.left != 0 || clipBounds.top != 0) {
                editTextBoldCursor.setClipBounds(new Rect(0, 0, max, max2));
            }
            glcVar.K.getLocationInWindow(iArr2);
            editTextBoldCursor.getLocationInWindow(iArr);
            float translationX = iArr[0] - editTextBoldCursor.getTranslationX();
            float translationY = iArr[1] - editTextBoldCursor.getTranslationY();
            editTextBoldCursor.setTranslationX((iArr2[0] + f2) - translationX);
            editTextBoldCursor.setTranslationY((iArr2[1] + f3) - translationY);
        }
    }

    public final HashMap H(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.e;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                } else if (str != null && sb != null) {
                    sb.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                } else {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb = td4.s(trim3);
                            str = trim2;
                        } else {
                            b(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            b(str, sb.toString(), hashMap);
        }
        if (str != null && sb != null) {
            b(str, sb.toString(), hashMap);
        }
        return hashMap;
    }

    public final void I() {
        boolean z;
        if (((wvc) this.c) == null) {
            wvc wvcVar = (wvc) ((ArrayDeque) this.b).pollFirst();
            this.c = wvcVar;
            if (wvcVar != null) {
                int i = 0;
                uvc uvcVar = new uvc(this, wvcVar, (byte) 0);
                this.d = uvcVar;
                gm.d3(uvcVar, 10000L);
                bw8 bw8Var = wvcVar.b;
                String str = bw8Var.b;
                String str2 = bw8Var.f;
                vvc vvcVar = new vvc(this, wvcVar);
                wm9 k = bwc.k(str);
                byte[] f2 = bwc.f(str2);
                if (k != null && f2 != null) {
                    try {
                        z = nwc.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th) {
                        fc4.g(th, true);
                        z = false;
                    }
                    if (z) {
                        synchronized (bwc.y) {
                            bwc bwcVar = bwc.A;
                            if (bwcVar != null) {
                                bwcVar.q();
                                bwc.A = null;
                            }
                            try {
                                bwc bwcVar2 = new bwc(k, str2, f2);
                                bwc.A = bwcVar2;
                                bwcVar2.x = vvcVar;
                                us usVar = us.f;
                                if (usVar != null) {
                                    usVar.d.add(bwcVar2);
                                }
                                bwcVar2.j.execute(new yvc(bwcVar2, (byte) 1));
                                gm.c3(new yvc(bwcVar2, (byte) 2));
                                i = bwc.A.i.getLocalPort();
                            } catch (Exception e) {
                                fc4.g(e, true);
                                bwc bwcVar3 = bwc.A;
                                if (bwcVar3 != null) {
                                    bwcVar3.q();
                                    bwc.A = null;
                                }
                            }
                        }
                    }
                }
                wvcVar.d = i;
                if (i == 0) {
                    r(wvcVar);
                }
            }
        }
    }

    public final void a(pm7 pm7Var) {
        ((ArrayList) this.b).add(pm7Var);
    }

    public final void c(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public final Object clone() {
        switch (this.a) {
            case 10:
                xvc xvcVar = new xvc((byte) 10);
                xvcVar.b = new ArrayList((ArrayList) this.b);
                xvcVar.c = new ArrayList((ArrayList) this.c);
                xvcVar.d = (String) this.d;
                xvcVar.e = (String) this.e;
                return xvcVar;
            default:
                return super.clone();
        }
    }

    @Override
    public final void d() {
        gm.d3(new t99((yv1) this.b, (Activity) this.c, (ylb) this.d, (k47) this.e, (byte) 2), 200L);
    }

    public final im0 e(ykc ykcVar) {
        im0 im0Var;
        am0 am0Var;
        ChatActivityEnterView chatActivityEnterView = ((glc) this.e).b.a;
        int i = ChatActivityEnterView.z7;
        va2 C0 = chatActivityEnterView.C0();
        km0 km0Var = chatActivityEnterView.L1;
        if (km0Var != null && C0 != null && (im0Var = C0.n) != null && (am0Var = im0Var.w) != null) {
            return km0Var.c(ykcVar, am0Var, false);
        }
        return null;
    }

    @Override
    public final void f() {
        gm.d3(new jm1((yv1) this.b, (k47) this.e, (byte) 8), 200L);
    }

    @Override
    public final void g(android.view.View r14, defpackage.k39 r15, boolean r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvc.g(android.view.View, k39, boolean, boolean):void");
    }

    @Override
    public final Object mo8get() {
        switch (this.a) {
            case 5:
                return new hj4((li4) ((lq5) this.b).a, (l9a) ((lv8) this.c).mo8get(), (cy2) ((lq5) this.d).a, (j9a) ((lv8) this.e).mo8get());
            default:
                return new e7a((Executor) ((mv8) this.b).mo8get(), (mq9) ((mv8) this.c).mo8get(), (in3) ((wm9) this.d).mo8get(), (mq9) ((mv8) this.e).mo8get());
        }
    }

    @Override
    public final boolean h() {
        byte b = this.a;
        return true;
    }

    @Override
    public final void i() {
        yv1 yv1Var = (yv1) this.b;
        yv1Var.showDialog(new kj8((d) yv1Var, 3, true));
    }

    public final void j(Canvas canvas, int i) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i, gm.L(14.66f));
        RectF rectF = gm.P;
        float f2 = i;
        rectF.set(0.0f, 0.0f, f2, gm.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (jb6.a0) {
            canvas.translate(f2, 0.0f);
        }
        int L = i - gm.L(25.0f);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            ig3 ig3Var = (ig3) arrayList.get(i2);
            L = wi8.B(4.0f, ig3Var.g, L);
            if (L < 0) {
                break;
            }
            if (jb6.a0) {
                canvas.translate(-ig3Var.g, 0.0f);
                ig3Var.a(canvas);
                canvas.translate(-gm.L(4.0f), 0.0f);
            } else {
                ig3Var.a(canvas);
                canvas.translate(gm.L(4.0f) + ig3Var.g, 0.0f);
            }
            i2++;
        }
        if (i2 < arrayList.size()) {
            int size = arrayList.size() - i2;
            ig3 ig3Var2 = (ig3) this.e;
            if (ig3Var2 == null || ig3Var2.a != size) {
                ?? obj = new Object();
                obj.a = size;
                uib uibVar = new uib(hg9.j(size, "+"), 10.0f, gm.o());
                uibVar.q((hg3) this.b);
                obj.c = uibVar;
                int L2 = gm.L(9.32f);
                uib uibVar2 = obj.c;
                obj.g = L2 + ((int) uibVar2.c);
                uibVar2.h();
                int i3 = cmb.m8;
                obj.f = i3;
                obj.e = true;
                obj.d = cmb.w0(null, i3, false);
                this.e = obj;
                ig3Var2 = obj;
            }
            if (jb6.a0) {
                canvas.translate(-ig3Var2.g, 0.0f);
                ((ig3) this.e).a(canvas);
                canvas.translate(-gm.L(4.0f), 0.0f);
            } else {
                ig3Var2.a(canvas);
                canvas.translate(gm.L(4.0f) + ((ig3) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public final boolean l() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void o() {
        byte b = this.a;
    }

    public final void p(an7 an7Var) {
        Bundle bundle = new Bundle();
        if (!((ArrayList) this.b).isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(((ArrayList) this.b).size());
            ArrayList arrayList2 = (ArrayList) this.b;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                pm7 pm7Var = (pm7) obj;
                IconCompat a = pm7Var.a();
                boolean z = pm7Var.d;
                Bundle bundle2 = pm7Var.a;
                Icon icon = null;
                if (a != null) {
                    icon = pme.a(a, null);
                }
                Notification.Action.Builder a2 = ln7.a(icon, pm7Var.h, pm7Var.i);
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    mn7.a(a2, z);
                }
                if (i2 >= 31) {
                    nn7.a(a2, false);
                }
                kn7.a(a2, bundle3);
                i89[] i89VarArr = pm7Var.c;
                if (i89VarArr != null) {
                    for (RemoteInput remoteInput : i89.a(i89VarArr)) {
                        kn7.b(a2, remoteInput);
                    }
                }
                arrayList.add(kn7.c(a2));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        if (!((ArrayList) this.c).isEmpty()) {
            ArrayList arrayList3 = (ArrayList) this.c;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        String str = (String) this.d;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = (String) this.e;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        Bundle bundle4 = an7Var.v;
        if (bundle4 == null) {
            bundle4 = new Bundle();
            an7Var.v = bundle4;
        }
        bundle4.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final String q(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.c);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                c(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e) {
            arrayList.clear();
            fc4.g(e, true);
        }
        return TextUtils.join("", arrayList);
    }

    public final void r(wvc wvcVar) {
        if (((wvc) this.c) != wvcVar) {
            return;
        }
        uvc uvcVar = (uvc) this.d;
        if (uvcVar != null) {
            gm.r(uvcVar);
            this.d = null;
        }
        uvc uvcVar2 = (uvc) this.e;
        if (uvcVar2 != null) {
            gm.r(uvcVar2);
            this.e = null;
        }
        synchronized (bwc.y) {
            bwc bwcVar = bwc.A;
            if (bwcVar != null) {
                bwcVar.q();
                bwc.A = null;
            }
        }
        this.c = null;
        wvcVar.c.run(-1L);
        I();
    }

    @Override
    public final boolean s() {
        byte b = this.a;
        return false;
    }

    public final float t() {
        EditTextBoldCursor editTextBoldCursor = ((glc) this.e).X;
        if (editTextBoldCursor == null) {
            return -1.0f;
        }
        if (editTextBoldCursor.getLayout() != null) {
            return editTextBoldCursor.getLayout().getHeight();
        }
        return 0.0f;
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((ai4) this.e).toString();
            default:
                return super.toString();
        }
    }

    public final cw3 u() {
        ChatActivityEnterView chatActivityEnterView = ((glc) this.e).b.a;
        long j = chatActivityEnterView.W6;
        cw3 cw3Var = null;
        if (j == 0) {
            return null;
        }
        if (chatActivityEnterView.x6 != j) {
            chatActivityEnterView.x6 = j;
            TLRPC.TL_availableEffect Y0 = oc7.r1(chatActivityEnterView.R).Y0(chatActivityEnterView.W6);
            if (Y0 != null) {
                cw3Var = gw3.g(Y0.emoticon);
            }
            chatActivityEnterView.y6 = cw3Var;
        }
        return chatActivityEnterView.y6;
    }

    public final boolean v(RectF rectF, boolean z) {
        char c;
        int[] iArr;
        int[] iArr2 = (int[]) this.c;
        int[] iArr3 = (int[]) this.b;
        glc glcVar = (glc) this.e;
        if (glcVar.K != null) {
            ChatActivityEnterView chatActivityEnterView = glcVar.b.a;
            ela elaVar = chatActivityEnterView.c2;
            RectF rectF2 = chatActivityEnterView.H4;
            if (elaVar != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr4);
                elaVar.getLocationInWindow(iArr5);
                float f2 = iArr4[0] - iArr5[0];
                float f3 = iArr4[1] - iArr5[1];
                if (z) {
                    rectF.set(f2 + 0.0f, 0.0f, (f2 + chatActivityEnterView.getWidth()) - 0.0f, f3);
                    if (rectF.width() > gm.L(80.0f)) {
                        c = 0;
                    }
                } else {
                    c = 0;
                    float width = (chatActivityEnterView.getWidth() + f2) - gm.L(64.0f);
                    if (chatActivityEnterView.E2 != null && !rectF2.isEmpty() && chatActivityEnterView.E2.getVisibility() == 0) {
                        chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                        width = ((iArr[0] - iArr5[0]) + rectF2.left) - gm.L(8.0f);
                    }
                    rectF.set(f2, 0.0f, width, f3);
                    if (rectF.width() <= gm.L(80.0f)) {
                        return false;
                    }
                }
                glcVar.K.getLocationInWindow(iArr3);
                ((ViewGroup) this.d).getLocationInWindow(iArr2);
                rectF.offset(iArr2[c] - iArr3[c], iArr2[1] - iArr3[1]);
                return true;
            }
        }
        return false;
    }

    public final float w() {
        sy1 sy1Var = ((glc) this.e).b.a.F0;
        if (sy1Var != null) {
            return sy1Var.getTextSize();
        }
        return gm.L(18.0f);
    }

    public final boolean x() {
        if (DictationAsr.E() && DictationAsr.G().length > 0) {
            return true;
        }
        return false;
    }

    public final void y(int i, String str, HashMap hashMap) {
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            if (trim.charAt(0) == '(') {
                Matcher matcher = tvc.A0.matcher(trim);
                int i2 = 0;
                while (true) {
                    if (!matcher.find()) {
                        break;
                    } else if (matcher.group(0).indexOf(48) == 40) {
                        i2++;
                    } else {
                        i2--;
                        if (i2 == 0) {
                            y(i, trim.substring(1, matcher.start()), hashMap);
                            trim = trim.substring(matcher.end()).trim();
                            if (TextUtils.isEmpty(trim)) {
                                return;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                    throw new Exception(b10.h("Premature end of parens in ", trim));
                }
            }
            int i3 = 0;
            while (true) {
                String[] strArr = (String[]) this.e;
                if (i3 < strArr.length) {
                    String str2 = strArr[i3];
                    Locale locale = Locale.US;
                    Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                    if (!matcher2.find()) {
                        i3++;
                    } else {
                        y(i - 1, matcher2.group(3), hashMap);
                        String group = matcher2.group(2);
                        if (!TextUtils.isEmpty(group)) {
                            y(i, group, hashMap);
                            return;
                        } else {
                            hashMap.put(matcher2.group(1), "");
                            return;
                        }
                    }
                } else {
                    try {
                        Integer.parseInt(trim);
                        return;
                    } catch (Exception unused) {
                        Locale locale2 = Locale.US;
                        if (!Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(trim).find()) {
                            if (trim.charAt(0) != '\"' || trim.charAt(trim.length() - 1) != '\"') {
                                try {
                                    new JSONObject(trim).toString();
                                    return;
                                } catch (Exception unused2) {
                                    Locale locale3 = Locale.US;
                                    Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                                    if (matcher3.find()) {
                                        matcher3.group(1);
                                        y(i - 1, matcher3.group(2), hashMap);
                                        return;
                                    }
                                    Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(trim);
                                    if (matcher4.find()) {
                                        String group2 = matcher4.group(1);
                                        String group3 = matcher4.group(2);
                                        String group4 = matcher4.group(3);
                                        if (TextUtils.isEmpty(group3)) {
                                            group3 = group4;
                                        }
                                        group3.replace("\"", "");
                                        String group5 = matcher4.group(4);
                                        if (hashMap.get(group2) == null) {
                                            ArrayList arrayList = (ArrayList) this.b;
                                            Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.c);
                                            String str3 = null;
                                            while (true) {
                                                if (!matcher5.find()) {
                                                    break;
                                                }
                                                String group6 = matcher5.group();
                                                String group7 = matcher5.group(2);
                                                if (TextUtils.isEmpty(group7)) {
                                                    str3 = group7;
                                                } else {
                                                    if (!arrayList.contains(group6)) {
                                                        arrayList.add(matcher5.group());
                                                    }
                                                    str3 = group7;
                                                }
                                            }
                                            Matcher matcher6 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str3);
                                            while (matcher6.find()) {
                                                c(matcher6.group(3), matcher6.group(2).split(","));
                                            }
                                        }
                                        if (group5 != null) {
                                            if (trim.charAt(trim.length() - 1) == ')') {
                                                if (group5.length() != 0) {
                                                    for (String str4 : group5.split(",")) {
                                                        y(i, str4, hashMap);
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            throw new Exception("last char not ')'");
                                        }
                                        return;
                                    }
                                    Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                                    if (matcher7.find()) {
                                        hashMap.get(matcher7.group(1));
                                        y(i - 1, matcher7.group(2), hashMap);
                                        return;
                                    }
                                    int i4 = 0;
                                    while (true) {
                                        String[] strArr2 = (String[]) this.d;
                                        if (i4 < strArr2.length) {
                                            String str5 = strArr2[i4];
                                            Locale locale4 = Locale.US;
                                            Matcher matcher8 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                                            if (matcher8.find()) {
                                                boolean[] zArr = new boolean[1];
                                                int i5 = i - 1;
                                                z(matcher8.group(1), hashMap, zArr, i5);
                                                if (!zArr[0]) {
                                                    z(matcher8.group(2), hashMap, zArr, i5);
                                                    if (zArr[0]) {
                                                        throw new Exception(td4.r("Premature right-side return of ", str5, " in ", trim));
                                                    }
                                                } else {
                                                    throw new Exception(td4.r("Premature left-side return of ", str5, " in ", trim));
                                                }
                                            }
                                            i4++;
                                        } else {
                                            Locale locale5 = Locale.US;
                                            Matcher matcher9 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                            if (matcher9.find()) {
                                                q(matcher9.group(1));
                                            }
                                            throw new Exception("Unsupported JS expression ".concat(trim));
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void z(String str, HashMap hashMap, boolean[] zArr, int i) {
        if (i >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = tvc.y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = tvc.z0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            y(i, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    private final void C() {
    }

    private final void D() {
    }

    public xvc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public xvc(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public xvc(ky2 ky2Var, e93 e93Var, hj1 hj1Var) {
        this.a = (byte) 14;
        this.b = ky2Var;
        this.c = hj1Var;
        this.d = zsd.a(Integer.MAX_VALUE, null, 6);
        this.e = new k6d((byte) 7);
        av5 av5Var = (av5) ky2Var.c().get(nf5.c);
        if (av5Var != null) {
            av5Var.invokeOnCompletion(new wi7(e93Var, this, (byte) 1));
        }
    }

    public xvc(byte b, boolean z) {
        this.a = b;
    }

    public xvc(hg3 hg3Var) {
        this.a = (byte) 4;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = hg3Var;
    }

    public xvc(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                return;
            case 9:
            default:
                this.b = new ArrayDeque();
                return;
            case 10:
                this.b = new ArrayList();
                this.c = new ArrayList();
                return;
        }
    }

    public xvc(Context context) {
        this.a = (byte) 2;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = kg7.b;
        if (context == null) {
            this.e = r00.f;
        }
    }

    public xvc(a83 a83Var, g83 g83Var, cx7 cx7Var) {
        this.a = (byte) 11;
        this.b = a83Var;
        this.c = g83Var;
        this.d = cx7Var;
    }

    public xvc(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = new SparseBooleanArray();
        this.c = new cka(0);
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        pw7 pw7Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            pw7 pw7Var2 = (pw7) arrayList.get(i2);
            int i3 = pw7Var2.e;
            if (i3 > i) {
                pw7Var = pw7Var2;
                i = i3;
            }
        }
        this.e = pw7Var;
    }

    public xvc(String str) {
        this.a = (byte) 18;
        this.b = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.c = str;
    }

    public xvc(y79 y79Var, uj7 uj7Var, wm4 wm4Var, uj7 uj7Var2) {
        Object obj;
        this.a = (byte) 9;
        if (y79Var != null) {
            obj = mo5.q(y79Var);
        } else {
            ko5 ko5Var = mo5.b;
            obj = y79.e;
        }
        this.b = obj;
        this.c = uj7Var;
        this.d = wm4Var;
        this.e = uj7Var2;
    }

    public xvc(glc glcVar, ViewGroup viewGroup) {
        this.a = (byte) 17;
        this.e = glcVar;
        this.d = viewGroup;
        this.b = new int[2];
        this.c = new int[2];
    }

    private final void k(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }

    private final void n(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
