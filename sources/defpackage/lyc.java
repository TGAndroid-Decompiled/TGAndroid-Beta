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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class lyc implements tw8, h49, jb9, uw8 {
    public static volatile lyc f;
    public static final tx7 h = new Object();
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public lyc(File file) {
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
        hashMap.putAll(K(bufferedReader));
        oi6 oi6Var = (oi6) hashMap.get("content-type");
        if (oi6Var == null) {
            str = null;
        } else {
            str = (String) oi6Var.b.get("boundary");
        }
        if (str != null) {
            int length = str.length() + 2;
            ni6 ni6Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (ni6Var != null) {
                        ni6Var.d = (jArr[0] - length) - 2;
                        arrayList.add(ni6Var);
                        oi6 oi6Var2 = (oi6) ni6Var.a.get("content-location");
                        if (oi6Var2 == null) {
                            str2 = null;
                        } else {
                            str2 = oi6Var2.a;
                        }
                        hashMap2.put(str2, ni6Var);
                    }
                    ni6Var = new ni6();
                    ni6Var.b = (File) this.b;
                    ni6Var.a.putAll(K(bufferedReader));
                    ni6Var.c = jArr[0];
                }
            }
            if (ni6Var != null && ni6Var.c != 0 && ni6Var.d != 0) {
                arrayList.add(ni6Var);
                oi6 oi6Var3 = (oi6) ni6Var.a.get("content-location");
                hashMap2.put(oi6Var3 != null ? oi6Var3.a : null, ni6Var);
            }
        }
        bufferedReader.close();
    }

    public static void b(String str, String str2, HashMap hashMap) {
        oi6 oi6Var = new oi6();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = bs2.n(1, 1, trim3);
                    }
                    oi6Var.b.put(trim2, trim3);
                } else {
                    oi6Var.a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), oi6Var);
    }

    public final void A(int i, String str, HashMap hashMap) {
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            if (trim.charAt(0) == '(') {
                Matcher matcher = hyc.A0.matcher(trim);
                int i2 = 0;
                while (true) {
                    if (!matcher.find()) {
                        break;
                    } else if (matcher.group(0).indexOf(48) == 40) {
                        i2++;
                    } else {
                        i2--;
                        if (i2 == 0) {
                            A(i, trim.substring(1, matcher.start()), hashMap);
                            trim = trim.substring(matcher.end()).trim();
                            if (TextUtils.isEmpty(trim)) {
                                return;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                    throw new Exception(c00.i("Premature end of parens in ", trim));
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
                        A(i - 1, matcher2.group(3), hashMap);
                        String group = matcher2.group(2);
                        if (!TextUtils.isEmpty(group)) {
                            A(i, group, hashMap);
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
                                        A(i - 1, matcher3.group(2), hashMap);
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
                                                        A(i, str4, hashMap);
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
                                        A(i - 1, matcher7.group(2), hashMap);
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
                                                B(matcher8.group(1), hashMap, zArr, i5);
                                                if (!zArr[0]) {
                                                    B(matcher8.group(2), hashMap, zArr, i5);
                                                    if (zArr[0]) {
                                                        throw new Exception(qd4.q("Premature right-side return of ", str5, " in ", trim));
                                                    }
                                                } else {
                                                    throw new Exception(qd4.q("Premature left-side return of ", str5, " in ", trim));
                                                }
                                            }
                                            i4++;
                                        } else {
                                            Locale locale5 = Locale.US;
                                            Matcher matcher9 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                            if (matcher9.find()) {
                                                r(matcher9.group(1));
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

    public final void B(String str, HashMap hashMap, boolean[] zArr, int i) {
        if (i >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = hyc.y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = hyc.z0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            A(i, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public final boolean C() {
        zu1 zu1Var = ((snc) this.e).b.a.E3;
        if (zu1Var != null) {
            if (zu1Var.g9 == null) {
                Dialog visibleDialog = zu1Var.getVisibleDialog();
                if (visibleDialog != null && visibleDialog.isShowing()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean D() {
        return ((ArrayList) this.d).isEmpty();
    }

    public final void G(float f2) {
        ChatActivityEnterView chatActivityEnterView = ((snc) this.e).b.a;
        if (Math.abs(chatActivityEnterView.d6 - f2) >= 0.002f) {
            chatActivityEnterView.d6 = f2;
            if (chatActivityEnterView.D2 != null && !Float.isNaN(f2)) {
                chatActivityEnterView.D2.setAlpha(chatActivityEnterView.f6 * chatActivityEnterView.d6);
            }
        }
    }

    public final void H(float f2, float f3) {
        boolean z;
        knc kncVar;
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        snc sncVar = (snc) this.e;
        c cVar = sncVar.b;
        knc kncVar2 = sncVar.L;
        if (kncVar2 != null && !kncVar2.R) {
            z = true;
        } else {
            z = false;
        }
        if (!Float.isNaN(f2) && (kncVar = sncVar.L) != null && (sncVar.c != 0 || z)) {
            kncVar.getLocationInWindow(iArr2);
            ((ViewGroup) this.d).getLocationInWindow(iArr);
            cVar.g((f2 + iArr2[1]) - iArr[1], f3);
            return;
        }
        cVar.g(Float.NaN, 0.0f);
    }

    public final void I() {
        snc sncVar = (snc) this.e;
        String trim = sncVar.n.trim();
        if (trim.isEmpty()) {
            return;
        }
        Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
        sncVar.n("field send");
        ChatActivityEnterView chatActivityEnterView = sncVar.b.a;
        int i = ChatActivityEnterView.X7;
        chatActivityEnterView.N2(trim, new mv1(chatActivityEnterView, (byte) 21));
    }

    public final void J(float f2, float f3, float f4, float f5) {
        snc sncVar = (snc) this.e;
        int[] iArr = sncVar.f0;
        int[] iArr2 = sncVar.e0;
        m7 m7Var = sncVar.Y;
        if (m7Var != null && sncVar.L != null) {
            int max = Math.max(1, Math.round(f4 - f2));
            int max2 = Math.max(1, Math.round(f5 - f3));
            ViewGroup.LayoutParams layoutParams = m7Var.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != max || layoutParams.height != max2)) {
                layoutParams.width = max;
                layoutParams.height = max2;
                m7Var.setLayoutParams(layoutParams);
            }
            Rect clipBounds = m7Var.getClipBounds();
            if (clipBounds == null || clipBounds.width() != max || clipBounds.height() != max2 || clipBounds.left != 0 || clipBounds.top != 0) {
                m7Var.setClipBounds(new Rect(0, 0, max, max2));
            }
            sncVar.L.getLocationInWindow(iArr2);
            m7Var.getLocationInWindow(iArr);
            float translationX = iArr[0] - m7Var.getTranslationX();
            float translationY = iArr[1] - m7Var.getTranslationY();
            m7Var.setTranslationX((iArr2[0] + f2) - translationX);
            m7Var.setTranslationY((iArr2[1] + f3) - translationY);
        }
    }

    public final HashMap K(BufferedReader bufferedReader) {
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
                            sb = qd4.r(trim3);
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

    public final void L() {
        boolean z;
        if (((kyc) this.c) == null) {
            kyc kycVar = (kyc) ((ArrayDeque) this.b).pollFirst();
            this.c = kycVar;
            if (kycVar != null) {
                int i = 0;
                iyc iycVar = new iyc(this, kycVar, (byte) 0);
                this.d = iycVar;
                hl.d3(iycVar, 10000L);
                jx8 jx8Var = kycVar.b;
                String str = jx8Var.b;
                String str2 = jx8Var.f;
                jyc jycVar = new jyc(this, kycVar);
                ko9 k = pyc.k(str);
                byte[] f2 = pyc.f(str2);
                if (k != null && f2 != null) {
                    try {
                        z = czc.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th) {
                        cc4.g(th, true);
                        z = false;
                    }
                    if (z) {
                        synchronized (pyc.y) {
                            pyc pycVar = pyc.A;
                            if (pycVar != null) {
                                pycVar.q();
                                pyc.A = null;
                            }
                            try {
                                pyc pycVar2 = new pyc(k, str2, f2);
                                pyc.A = pycVar2;
                                pycVar2.x = jycVar;
                                vr vrVar = vr.f;
                                if (vrVar != null) {
                                    vrVar.d.add(pycVar2);
                                }
                                pycVar2.j.execute(new myc(pycVar2, (byte) 1));
                                hl.c3(new myc(pycVar2, (byte) 2));
                                i = pyc.A.i.getLocalPort();
                            } catch (Exception e) {
                                cc4.g(e, true);
                                pyc pycVar3 = pyc.A;
                                if (pycVar3 != null) {
                                    pycVar3.q();
                                    pyc.A = null;
                                }
                            }
                        }
                    }
                }
                kycVar.d = i;
                if (i == 0) {
                    s(kycVar);
                }
            }
        }
    }

    public final void a(ln7 ln7Var) {
        ((ArrayList) this.b).add(ln7Var);
    }

    public final void c(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            B(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public final Object clone() {
        switch (this.a) {
            case 10:
                lyc lycVar = new lyc((byte) 10);
                lycVar.b = new ArrayList((ArrayList) this.b);
                lycVar.c = new ArrayList((ArrayList) this.c);
                lycVar.d = (String) this.d;
                lycVar.e = (String) this.e;
                return lycVar;
            default:
                return super.clone();
        }
    }

    @Override
    public final void d() {
        hl.d3(new eb9((zu1) this.b, (Activity) this.c, (vnb) this.d, (r47) this.e, (byte) 2), 200L);
    }

    @Override
    public final void e(android.view.View r14, defpackage.w49 r15, boolean r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyc.e(android.view.View, w49, boolean, boolean):void");
    }

    @Override
    public final void f() {
        hl.d3(new fm1((zu1) this.b, (r47) this.e, (byte) 8), 200L);
    }

    public final jl0 g(knc kncVar) {
        jl0 jl0Var;
        bl0 bl0Var;
        ChatActivityEnterView chatActivityEnterView = ((snc) this.e).b.a;
        int i = ChatActivityEnterView.X7;
        z92 G0 = chatActivityEnterView.G0();
        ll0 ll0Var = chatActivityEnterView.K1;
        if (ll0Var != null && G0 != null && (jl0Var = G0.r) != null && (bl0Var = jl0Var.w) != null) {
            return ll0Var.c(kncVar, bl0Var, false);
        }
        return null;
    }

    @Override
    public final Object mo21get() {
        switch (this.a) {
            case 5:
                return new gj4((ji4) ((aj3) this.b).b, (bba) ((tw8) this.c).mo21get(), (mx2) ((aj3) this.d).b, (zaa) ((tw8) this.e).mo21get());
            default:
                return new u8a((Executor) ((uw8) this.b).mo21get(), (ds9) ((uw8) this.c).mo21get(), (pm3) ((ko9) this.d).mo21get(), (ds9) ((uw8) this.e).mo21get());
        }
    }

    public final void h(Canvas canvas, int i) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i, hl.L(14.66f));
        RectF rectF = hl.P;
        float f2 = i;
        rectF.set(0.0f, 0.0f, f2, hl.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (ob6.a0) {
            canvas.translate(f2, 0.0f);
        }
        int L = i - hl.L(25.0f);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            pf3 pf3Var = (pf3) arrayList.get(i2);
            L = ik8.B(4.0f, pf3Var.g, L);
            if (L < 0) {
                break;
            }
            if (ob6.a0) {
                canvas.translate(-pf3Var.g, 0.0f);
                pf3Var.a(canvas);
                canvas.translate(-hl.L(4.0f), 0.0f);
            } else {
                pf3Var.a(canvas);
                canvas.translate(hl.L(4.0f) + pf3Var.g, 0.0f);
            }
            i2++;
        }
        if (i2 < arrayList.size()) {
            int size = arrayList.size() - i2;
            pf3 pf3Var2 = (pf3) this.e;
            if (pf3Var2 == null || pf3Var2.a != size) {
                ?? obj = new Object();
                obj.a = size;
                pkb pkbVar = new pkb(uh9.k(size, "+"), 10.0f, hl.o());
                pkbVar.q((of3) this.b);
                obj.c = pkbVar;
                int L2 = hl.L(9.32f);
                pkb pkbVar2 = obj.c;
                obj.g = L2 + ((int) pkbVar2.c);
                pkbVar2.h();
                int i3 = aob.n8;
                obj.f = i3;
                obj.e = true;
                obj.d = aob.w0(null, i3, false);
                this.e = obj;
                pf3Var2 = obj;
            }
            if (ob6.a0) {
                canvas.translate(-pf3Var2.g, 0.0f);
                ((pf3) this.e).a(canvas);
                canvas.translate(-hl.L(4.0f), 0.0f);
            } else {
                pf3Var2.a(canvas);
                canvas.translate(hl.L(4.0f) + ((pf3) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public final void i() {
        zu1 zu1Var = (zu1) this.b;
        zu1Var.showDialog(new xk8((e) zu1Var, 3, true));
    }

    @Override
    public final boolean j() {
        byte b = this.a;
        return true;
    }

    @Override
    public final boolean k() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void n() {
        byte b = this.a;
    }

    @Override
    public final boolean p() {
        byte b = this.a;
        return false;
    }

    public final void q(wn7 wn7Var) {
        Bundle bundle = new Bundle();
        if (!((ArrayList) this.b).isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(((ArrayList) this.b).size());
            ArrayList arrayList2 = (ArrayList) this.b;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ln7 ln7Var = (ln7) obj;
                IconCompat a = ln7Var.a();
                boolean z = ln7Var.d;
                Bundle bundle2 = ln7Var.a;
                Icon icon = null;
                if (a != null) {
                    icon = jpe.a(a, null);
                }
                Notification.Action.Builder a2 = ho7.a(icon, ln7Var.h, ln7Var.i);
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    io7.a(a2, z);
                }
                if (i2 >= 31) {
                    jo7.a(a2, false);
                }
                go7.a(a2, bundle3);
                t99[] t99VarArr = ln7Var.c;
                if (t99VarArr != null) {
                    for (RemoteInput remoteInput : t99.a(t99VarArr)) {
                        go7.b(a2, remoteInput);
                    }
                }
                arrayList.add(go7.c(a2));
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
        Bundle bundle4 = wn7Var.v;
        if (bundle4 == null) {
            bundle4 = new Bundle();
            wn7Var.v = bundle4;
        }
        bundle4.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final String r(String str) {
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
            cc4.g(e, true);
        }
        return TextUtils.join("", arrayList);
    }

    public final void s(kyc kycVar) {
        if (((kyc) this.c) != kycVar) {
            return;
        }
        iyc iycVar = (iyc) this.d;
        if (iycVar != null) {
            hl.r(iycVar);
            this.d = null;
        }
        iyc iycVar2 = (iyc) this.e;
        if (iycVar2 != null) {
            hl.r(iycVar2);
            this.e = null;
        }
        synchronized (pyc.y) {
            pyc pycVar = pyc.A;
            if (pycVar != null) {
                pycVar.q();
                pyc.A = null;
            }
        }
        this.c = null;
        kycVar.c.run(-1L);
        L();
    }

    public final float t() {
        m7 m7Var = ((snc) this.e).Y;
        if (m7Var == null) {
            return -1.0f;
        }
        if (m7Var.getLayout() != null) {
            return m7Var.getLayout().getHeight();
        }
        return 0.0f;
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((xh4) this.e).toString();
            default:
                return super.toString();
        }
    }

    public final lv3 u() {
        ChatActivityEnterView chatActivityEnterView = ((snc) this.e).b.a;
        long j = chatActivityEnterView.o7;
        lv3 lv3Var = null;
        if (j == 0) {
            return null;
        }
        if (chatActivityEnterView.Q6 != j) {
            chatActivityEnterView.Q6 = j;
            TLRPC.TL_availableEffect Z0 = uc7.s1(chatActivityEnterView.R).Z0(chatActivityEnterView.o7);
            if (Z0 != null) {
                lv3Var = pv3.g(Z0.emoticon);
            }
            chatActivityEnterView.R6 = lv3Var;
        }
        return chatActivityEnterView.R6;
    }

    public final boolean v(RectF rectF, boolean z) {
        char c;
        int[] iArr;
        int[] iArr2 = (int[]) this.c;
        int[] iArr3 = (int[]) this.b;
        snc sncVar = (snc) this.e;
        if (sncVar.L != null) {
            ChatActivityEnterView chatActivityEnterView = sncVar.b.a;
            wma wmaVar = chatActivityEnterView.b2;
            RectF rectF2 = chatActivityEnterView.G4;
            if (wmaVar != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr4);
                wmaVar.getLocationInWindow(iArr5);
                float f2 = iArr4[0] - iArr5[0];
                float f3 = iArr4[1] - iArr5[1];
                if (z) {
                    rectF.set(f2 + 0.0f, 0.0f, (f2 + chatActivityEnterView.getWidth()) - 0.0f, f3);
                    if (rectF.width() > hl.L(80.0f)) {
                        c = 0;
                    }
                } else {
                    c = 0;
                    float width = (chatActivityEnterView.getWidth() + f2) - hl.L(64.0f);
                    if (chatActivityEnterView.D2 != null && !rectF2.isEmpty() && chatActivityEnterView.D2.getVisibility() == 0) {
                        chatActivityEnterView.D2.getLocationInWindow(new int[2]);
                        width = ((iArr[0] - iArr5[0]) + rectF2.left) - hl.L(8.0f);
                    }
                    rectF.set(f2, 0.0f, width, f3);
                    if (rectF.width() <= hl.L(80.0f)) {
                        return false;
                    }
                }
                sncVar.L.getLocationInWindow(iArr3);
                ((ViewGroup) this.d).getLocationInWindow(iArr2);
                rectF.offset(iArr2[c] - iArr3[c], iArr2[1] - iArr3[1]);
                return true;
            }
        }
        return false;
    }

    public final float w() {
        float f2;
        zu1 zu1Var = ((snc) this.e).b.a.E3;
        if (zu1Var != null) {
            if (zu1Var.R8 != null) {
                return zu1Var.b9 * 0.2f;
            }
            float f3 = zu1Var.X8;
            if (zu1Var.Z8 != null) {
                f2 = zu1Var.a9;
            } else {
                f2 = 1.0f;
            }
            return f3 * f2;
        }
        return 0.0f;
    }

    public final float x() {
        tx1 tx1Var = ((snc) this.e).b.a.F0;
        if (tx1Var != null) {
            return tx1Var.getTextSize();
        }
        return hl.L(18.0f);
    }

    public final boolean y() {
        zu1 zu1Var = ((snc) this.e).b.a.E3;
        if (zu1Var != null && zu1Var.y()) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (DictationAsr.G() && DictationAsr.I().length > 0) {
            return true;
        }
        return false;
    }

    private final void E() {
    }

    private final void F() {
    }

    public lyc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public lyc(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public lyc(ux2 ux2Var, l83 l83Var, ii1 ii1Var) {
        this.a = (byte) 14;
        this.b = ux2Var;
        this.c = ii1Var;
        this.d = mvd.a(Integer.MAX_VALUE, null, 6);
        this.e = new z8d((byte) 7);
        ev5 ev5Var = (ev5) ux2Var.c().get(qf5.c);
        if (ev5Var != null) {
            ev5Var.invokeOnCompletion(new dj7(l83Var, this, (byte) 1));
        }
    }

    public lyc(byte b, boolean z) {
        this.a = b;
    }

    public lyc(of3 of3Var) {
        this.a = (byte) 4;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = of3Var;
    }

    public lyc(byte b) {
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

    public lyc(Context context) {
        this.a = (byte) 2;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = sg7.b;
        if (context == null) {
            this.e = sz.f;
        }
    }

    public lyc(h73 h73Var, n73 n73Var, iy7 iy7Var) {
        this.a = (byte) 11;
        this.b = h73Var;
        this.c = n73Var;
        this.d = iy7Var;
    }

    public lyc(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = new SparseBooleanArray();
        this.c = new vla(0);
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        vx7 vx7Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            vx7 vx7Var2 = (vx7) arrayList.get(i2);
            int i3 = vx7Var2.e;
            if (i3 > i) {
                vx7Var = vx7Var2;
                i = i3;
            }
        }
        this.e = vx7Var;
    }

    public lyc(String str) {
        this.a = (byte) 18;
        this.b = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.c = str;
    }

    public lyc(j99 j99Var, bk7 bk7Var, um4 um4Var, bk7 bk7Var2) {
        Object obj;
        this.a = (byte) 9;
        if (j99Var != null) {
            obj = po5.q(j99Var);
        } else {
            no5 no5Var = po5.b;
            obj = j99.e;
        }
        this.b = obj;
        this.c = bk7Var;
        this.d = um4Var;
        this.e = bk7Var2;
    }

    public lyc(snc sncVar, ViewGroup viewGroup) {
        this.a = (byte) 17;
        this.e = sncVar;
        this.d = viewGroup;
        this.b = new int[2];
        this.c = new int[2];
    }

    private final void l(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }

    private final void o(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
