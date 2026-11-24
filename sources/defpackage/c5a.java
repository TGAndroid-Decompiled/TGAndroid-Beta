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
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
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
public final class c5a implements kt8, s09, x79, lt8 {
    public static c5a f;
    public static final String[] h = {"Connection", "Upgrade"};
    public static final String[] n = {"Upgrade", "websocket"};
    public static final String[] r = {"Sec-WebSocket-Version", "13"};
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public c5a(File file) {
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
        kg6 kg6Var = (kg6) hashMap.get("content-type");
        if (kg6Var == null) {
            str = null;
        } else {
            str = (String) kg6Var.b.get("boundary");
        }
        if (str != null) {
            int length = str.length() + 2;
            jg6 jg6Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (jg6Var != null) {
                        jg6Var.d = (jArr[0] - length) - 2;
                        arrayList.add(jg6Var);
                        kg6 kg6Var2 = (kg6) jg6Var.a.get("content-location");
                        if (kg6Var2 == null) {
                            str2 = null;
                        } else {
                            str2 = kg6Var2.a;
                        }
                        hashMap2.put(str2, jg6Var);
                    }
                    jg6Var = new jg6();
                    jg6Var.b = (File) this.b;
                    jg6Var.a.putAll(K(bufferedReader));
                    jg6Var.c = jArr[0];
                }
            }
            if (jg6Var != null && jg6Var.c != 0 && jg6Var.d != 0) {
                arrayList.add(jg6Var);
                kg6 kg6Var3 = (kg6) jg6Var.a.get("content-location");
                hashMap2.put(kg6Var3 != null ? kg6Var3.a : null, jg6Var);
            }
        }
        bufferedReader.close();
    }

    public static void L(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static void b(String str, String str2, HashMap hashMap) {
        kg6 kg6Var = new kg6();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = ir2.n(1, 1, trim3);
                    }
                    kg6Var.b.put(trim2, trim3);
                } else {
                    kg6Var.a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), kg6Var);
    }

    public static synchronized c5a t() {
        c5a c5aVar;
        synchronized (c5a.class) {
            c5aVar = f;
            if (c5aVar == null) {
                c5aVar = new c5a((byte) 0);
                f = c5aVar;
            }
        }
        return c5aVar;
    }

    public final boolean A(Context context) {
        boolean z;
        Boolean bool = (Boolean) this.c;
        if (bool == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.c = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public final void B(int i, String str, HashMap hashMap) {
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            if (trim.charAt(0) == '(') {
                Matcher matcher = stc.A0.matcher(trim);
                int i2 = 0;
                while (true) {
                    if (!matcher.find()) {
                        break;
                    } else if (matcher.group(0).indexOf(48) == 40) {
                        i2++;
                    } else {
                        i2--;
                        if (i2 == 0) {
                            B(i, trim.substring(1, matcher.start()), hashMap);
                            trim = trim.substring(matcher.end()).trim();
                            if (TextUtils.isEmpty(trim)) {
                                return;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                    throw new Exception(b00.h("Premature end of parens in ", trim));
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
                        B(i - 1, matcher2.group(3), hashMap);
                        String group = matcher2.group(2);
                        if (!TextUtils.isEmpty(group)) {
                            B(i, group, hashMap);
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
                                        B(i - 1, matcher3.group(2), hashMap);
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
                                            ArrayList arrayList = (ArrayList) this.c;
                                            Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.b);
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
                                                f(matcher6.group(3), matcher6.group(2).split(","));
                                            }
                                        }
                                        if (group5 != null) {
                                            if (trim.charAt(trim.length() - 1) == ')') {
                                                if (group5.length() != 0) {
                                                    for (String str4 : group5.split(",")) {
                                                        B(i, str4, hashMap);
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
                                        B(i - 1, matcher7.group(2), hashMap);
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
                                                D(matcher8.group(1), hashMap, zArr, i5);
                                                if (!zArr[0]) {
                                                    D(matcher8.group(2), hashMap, zArr, i5);
                                                    if (zArr[0]) {
                                                        throw new Exception(tb4.q("Premature right-side return of ", str5, " in ", trim));
                                                    }
                                                } else {
                                                    throw new Exception(tb4.q("Premature left-side return of ", str5, " in ", trim));
                                                }
                                            }
                                            i4++;
                                        } else {
                                            Locale locale5 = Locale.US;
                                            Matcher matcher9 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                            if (matcher9.find()) {
                                                n(matcher9.group(1));
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

    @Override
    public final boolean C() {
        byte b = this.a;
        return false;
    }

    public final void D(String str, HashMap hashMap, boolean[] zArr, int i) {
        if (i >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = stc.y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = stc.z0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            B(i, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public final boolean E() {
        mu1 mu1Var = ((gjc) this.e).b.a.F3;
        if (mu1Var != null) {
            if (mu1Var.g9 == null) {
                Dialog visibleDialog = mu1Var.getVisibleDialog();
                if (visibleDialog != null && visibleDialog.isShowing()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void H(float f2, float f3) {
        yic yicVar;
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) this.b;
        gjc gjcVar = (gjc) this.e;
        c cVar = gjcVar.b;
        if (!Float.isNaN(f2) && (yicVar = gjcVar.K) != null && gjcVar.c != 0) {
            yicVar.getLocationInWindow(iArr2);
            ((ViewGroup) this.d).getLocationInWindow(iArr);
            cVar.g((f2 + iArr2[1]) - iArr[1], f3);
            return;
        }
        cVar.g(Float.NaN, 0.0f);
    }

    public final void I() {
        gjc gjcVar = (gjc) this.e;
        String trim = gjcVar.n.trim();
        if (trim.isEmpty()) {
            return;
        }
        Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
        gjcVar.m("field send");
        ChatActivityEnterView chatActivityEnterView = gjcVar.b.a;
        int i = ChatActivityEnterView.r7;
        chatActivityEnterView.z2(trim, new av1(chatActivityEnterView, (byte) 20));
    }

    public final void J(float f2, float f3, float f4, float f5) {
        gjc gjcVar = (gjc) this.e;
        int[] iArr = gjcVar.d0;
        int[] iArr2 = gjcVar.c0;
        EditTextBoldCursor editTextBoldCursor = gjcVar.X;
        if (editTextBoldCursor != null && gjcVar.K != null) {
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
            gjcVar.K.getLocationInWindow(iArr2);
            editTextBoldCursor.getLocationInWindow(iArr);
            float translationX = iArr[0] - editTextBoldCursor.getTranslationX();
            float translationY = iArr[1] - editTextBoldCursor.getTranslationY();
            editTextBoldCursor.setTranslationX((iArr2[0] + f2) - translationX);
            editTextBoldCursor.setTranslationY((iArr2[1] + f3) - translationY);
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
                            sb = tb4.r(trim3);
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

    public final java.lang.Object M(defpackage.gw2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5a.M(gw2):java.lang.Object");
    }

    public final wg0 N(List list) {
        wg0 wg0Var;
        HashMap hashMap = (HashMap) this.d;
        ArrayList c = c(list);
        if (c.size() < 2) {
            return (wg0) jle.a(c, null);
        }
        Collections.sort(c, new sa((byte) 8));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((wg0) c.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= c.size()) {
                break;
            }
            wg0 wg0Var2 = (wg0) c.get(i3);
            if (i2 != wg0Var2.c) {
                if (arrayList.size() == 1) {
                    return (wg0) c.get(0);
                }
            } else {
                arrayList.add(new Pair(wg0Var2.b, Integer.valueOf(wg0Var2.d)));
                i3++;
            }
        }
        wg0 wg0Var3 = (wg0) hashMap.get(arrayList);
        if (wg0Var3 == null) {
            List subList = c.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((wg0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.e).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i < subList.size()) {
                    wg0Var = (wg0) subList.get(i);
                    i6 += wg0Var.d;
                    if (nextInt < i6) {
                        break;
                    }
                    i++;
                } else {
                    wg0Var = (wg0) jle.b(subList);
                    break;
                }
            }
            hashMap.put(arrayList, wg0Var);
            return wg0Var;
        }
        return wg0Var3;
    }

    public final void a(mk7 mk7Var) {
        ((ArrayList) this.c).add(mk7Var);
    }

    public final ArrayList c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        L(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        L(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            wg0 wg0Var = (wg0) list.get(i);
            if (!hashMap.containsKey(wg0Var.b) && !hashMap2.containsKey(Integer.valueOf(wg0Var.c))) {
                arrayList.add(wg0Var);
            }
        }
        return arrayList;
    }

    public final Object clone() {
        switch (this.a) {
            case 10:
                c5a c5aVar = new c5a((byte) 10);
                c5aVar.c = new ArrayList((ArrayList) this.c);
                c5aVar.d = new ArrayList((ArrayList) this.d);
                c5aVar.b = (String) this.b;
                c5aVar.e = (String) this.e;
                return c5aVar;
            default:
                return super.clone();
        }
    }

    @Override
    public final void d() {
        gl.e3(new r79((mu1) this.b, (Activity) this.c, (wjb) this.d, (k27) this.e, (byte) 2), 200L);
    }

    public final r30 e() {
        rx6 rx6Var;
        boolean z;
        if (!((aob) this.d).p() && (rx6Var = (rx6) this.e) != null) {
            if (((aob) this.d).b(rx6Var.a) != -1) {
                z = true;
            } else {
                z = false;
            }
            gre.f(z);
        }
        return new r30(this);
    }

    public final void f(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            D(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    @Override
    public final void g() {
        gl.e3(new bl1((mu1) this.b, (k27) this.e, (byte) 8), 200L);
    }

    @Override
    public final Object mo9get() {
        switch (this.a) {
            case 5:
                return new fh4((jg4) ((mo5) this.b).a, (k7a) ((kt8) this.c).mo9get(), (sw2) ((mo5) this.d).a, (i7a) ((kt8) this.e).mo9get());
            default:
                return new wtc((Executor) ((lt8) this.b).mo9get(), (lo9) ((lt8) this.c).mo9get(), (xl3) ((vk9) this.d).mo9get(), (lo9) ((lt8) this.e).mo9get());
        }
    }

    public final il0 h(yic yicVar) {
        il0 il0Var;
        al0 al0Var;
        ChatActivityEnterView chatActivityEnterView = ((gjc) this.e).b.a;
        int i = ChatActivityEnterView.r7;
        j92 C0 = chatActivityEnterView.C0();
        kl0 kl0Var = chatActivityEnterView.L1;
        if (kl0Var != null && C0 != null && (il0Var = C0.n) != null && (al0Var = il0Var.w) != null) {
            return kl0Var.c(yicVar, al0Var, false);
        }
        return null;
    }

    public final java.lang.Object i(defpackage.gw2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5a.i(gw2):java.lang.Object");
    }

    @Override
    public final void j() {
        mu1 mu1Var = (mu1) this.b;
        mu1Var.showDialog(new jh8((d) mu1Var, 3, true));
    }

    public final void m(xk7 xk7Var) {
        Bundle bundle = new Bundle();
        if (!((ArrayList) this.c).isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(((ArrayList) this.c).size());
            ArrayList arrayList2 = (ArrayList) this.c;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                mk7 mk7Var = (mk7) obj;
                IconCompat a = mk7Var.a();
                boolean z = mk7Var.d;
                Bundle bundle2 = mk7Var.a;
                Icon icon = null;
                if (a != null) {
                    icon = nke.a(a, null);
                }
                Notification.Action.Builder a2 = il7.a(icon, mk7Var.h, mk7Var.i);
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    jl7.a(a2, z);
                }
                if (i2 >= 31) {
                    kl7.a(a2, false);
                }
                hl7.a(a2, bundle3);
                g69[] g69VarArr = mk7Var.c;
                if (g69VarArr != null) {
                    for (RemoteInput remoteInput : g69.a(g69VarArr)) {
                        hl7.b(a2, remoteInput);
                    }
                }
                arrayList.add(hl7.c(a2));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        if (!((ArrayList) this.d).isEmpty()) {
            ArrayList arrayList3 = (ArrayList) this.d;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        String str = (String) this.b;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = (String) this.e;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        Bundle bundle4 = xk7Var.v;
        if (bundle4 == null) {
            bundle4 = new Bundle();
            xk7Var.v = bundle4;
        }
        bundle4.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final String n(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                f(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e) {
            arrayList.clear();
            fa4.g(e, true);
        }
        return TextUtils.join("", arrayList);
    }

    public final float o() {
        EditTextBoldCursor editTextBoldCursor = ((gjc) this.e).X;
        if (editTextBoldCursor == null) {
            return -1.0f;
        }
        if (editTextBoldCursor.getLayout() != null) {
            return editTextBoldCursor.getLayout().getHeight();
        }
        return 0.0f;
    }

    public final ru3 p() {
        ChatActivityEnterView chatActivityEnterView = ((gjc) this.e).b.a;
        long j = chatActivityEnterView.O6;
        ru3 ru3Var = null;
        if (j == 0) {
            return null;
        }
        if (chatActivityEnterView.x6 != j) {
            chatActivityEnterView.x6 = j;
            TLRPC.TL_availableEffect X0 = na7.q1(chatActivityEnterView.R).X0(chatActivityEnterView.O6);
            if (X0 != null) {
                ru3Var = vu3.g(X0.emoticon);
            }
            chatActivityEnterView.y6 = ru3Var;
        }
        return chatActivityEnterView.y6;
    }

    @Override
    public final void q(android.view.View r14, defpackage.h19 r15, boolean r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5a.q(android.view.View, h19, boolean, boolean):void");
    }

    @Override
    public final boolean r() {
        byte b = this.a;
        return true;
    }

    public final boolean s(RectF rectF, boolean z) {
        char c;
        int[] iArr;
        int[] iArr2 = (int[]) this.c;
        int[] iArr3 = (int[]) this.b;
        gjc gjcVar = (gjc) this.e;
        if (gjcVar.K != null) {
            ChatActivityEnterView chatActivityEnterView = gjcVar.b.a;
            cja cjaVar = chatActivityEnterView.c2;
            RectF rectF2 = chatActivityEnterView.H4;
            if (cjaVar != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr4 = new int[2];
                int[] iArr5 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr4);
                cjaVar.getLocationInWindow(iArr5);
                float f2 = iArr4[0] - iArr5[0];
                float f3 = iArr4[1] - iArr5[1];
                if (z) {
                    rectF.set(f2 + 0.0f, 0.0f, (f2 + chatActivityEnterView.getWidth()) - 0.0f, f3);
                    if (rectF.width() > gl.L(80.0f)) {
                        c = 0;
                    }
                } else {
                    c = 0;
                    float width = (chatActivityEnterView.getWidth() + f2) - gl.L(64.0f);
                    if (chatActivityEnterView.E2 != null && !rectF2.isEmpty() && chatActivityEnterView.E2.getVisibility() == 0) {
                        chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                        width = ((iArr[0] - iArr5[0]) + rectF2.left) - gl.L(8.0f);
                    }
                    rectF.set(f2, 0.0f, width, f3);
                    if (rectF.width() <= gl.L(80.0f)) {
                        return false;
                    }
                }
                gjcVar.K.getLocationInWindow(iArr3);
                ((ViewGroup) this.d).getLocationInWindow(iArr2);
                rectF.offset(iArr2[c] - iArr3[c], iArr2[1] - iArr3[1]);
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((z24) this.e).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public final boolean u() {
        byte b = this.a;
        return false;
    }

    public final float v() {
        ex1 ex1Var = ((gjc) this.e).b.a.F0;
        if (ex1Var != null) {
            return ex1Var.getTextSize();
        }
        return gl.L(18.0f);
    }

    public final boolean w(Context context) {
        boolean z;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = Boolean.valueOf(z);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
        byte b = this.a;
    }

    public final boolean y() {
        if (DictationAsr.E() && DictationAsr.G().length > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void z() {
        byte b = this.a;
    }

    private final void F() {
    }

    private final void G() {
    }

    public c5a(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public c5a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public c5a(ax2 ax2Var, s73 s73Var, ai1 ai1Var) {
        this.a = (byte) 14;
        this.b = ax2Var;
        this.c = ai1Var;
        this.d = wqd.a(Integer.MAX_VALUE, null, 6);
        this.e = new i4d((byte) 7);
        bt5 bt5Var = (bt5) ax2Var.c().get(pd5.c);
        if (bt5Var != null) {
            bt5Var.invokeOnCompletion(new tg7(s73Var, this, (byte) 1));
        }
    }

    public c5a(byte b, boolean z) {
        this.a = b;
    }

    public c5a(String str, String str2, String str3, boolean z) {
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        URI.create((z ? "wss" : "ws") + "://" + str2 + str3);
    }

    public c5a(o63 o63Var, u63 u63Var, bv7 bv7Var) {
        this.a = (byte) 11;
        this.c = o63Var;
        this.d = u63Var;
        this.e = bv7Var;
    }

    public c5a(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 8:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                return;
            case 10:
                this.c = new ArrayList();
                this.d = new ArrayList();
                return;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                return;
        }
    }

    public c5a(String str) {
        this.a = (byte) 18;
        this.c = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public c5a(fm4 fm4Var) {
        this.a = (byte) 2;
        this.b = fm4Var;
        this.c = null;
        this.d = aob.a;
        this.e = null;
    }

    public c5a(w59 w59Var, rh7 rh7Var, wk4 wk4Var, rh7 rh7Var2) {
        Object obj;
        this.a = (byte) 9;
        if (w59Var != null) {
            obj = mm5.q(w59Var);
        } else {
            km5 km5Var = mm5.b;
            obj = w59.e;
        }
        this.b = obj;
        this.c = rh7Var;
        this.d = wk4Var;
        this.e = rh7Var2;
    }

    public c5a(v73 v73Var, List list) {
        this.a = (byte) 4;
        this.e = v73Var;
        this.b = new nh7();
        this.c = hsd.a();
        this.d = yk2.k(list);
    }

    public c5a(gjc gjcVar, ViewGroup viewGroup) {
        this.a = (byte) 17;
        this.e = gjcVar;
        this.d = viewGroup;
        this.b = new int[2];
        this.c = new int[2];
    }

    private final void k(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }

    private final void l(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
