package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class da3 extends n7c {
    public static void d0(String str, StringBuilder sb) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i2].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i));
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                sb.append("\n");
                sb.append(arrayList2.size());
                sb.append("+");
                sb.append(arrayList3.size());
                sb.append(" ");
                sb.append(str.substring(6));
                sb.append(" codecs:\n");
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i3)).intValue());
                    sb.append("{d} ");
                    sb.append(codecInfoAt2.getName());
                    sb.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt2.isHardwareAccelerated()) {
                            sb.append("gpu");
                        }
                        if (codecInfoAt2.isSoftwareOnly()) {
                            sb.append("cpu");
                        }
                        if (codecInfoAt2.isVendor()) {
                            sb.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                    sb.append("; mi=");
                    sb.append(capabilitiesForType.getMaxSupportedInstances());
                    sb.append(")");
                }
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    if (i4 > 0 || !arrayList2.isEmpty()) {
                        sb.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i4)).intValue());
                    sb.append("{e} ");
                    sb.append(codecInfoAt3.getName());
                    sb.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt3.isHardwareAccelerated()) {
                            sb.append("gpu");
                        }
                        if (codecInfoAt3.isSoftwareOnly()) {
                            sb.append("cpu");
                        }
                        if (codecInfoAt3.isVendor()) {
                            sb.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                    sb.append("; mi=");
                    sb.append(capabilitiesForType2.getMaxSupportedInstances());
                    sb.append(")");
                }
                sb.append("\n");
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        arrayList.add(c6c.u("Contacts and chats"));
        arrayList.add(c6c.e(1, jb6.M0(2131751566, null)));
        arrayList.add(c6c.e(2, jb6.M0(2131751560, null)));
        arrayList.add(c6c.e(3, jb6.M0(2131751559, null)));
        arrayList.add(c6c.e(4, jb6.M0(2131751558, null)));
        arrayList.add(c6c.e(5, jb6.M0(2131751561, null)));
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("Data"));
        arrayList.add(c6c.e(8, jb6.M0(2131751580, null)));
        arrayList.add(c6c.e(45, "Forget all hints"));
        arrayList.add(c6c.e(35, "Reload app config"));
        boolean z = e21.a;
        arrayList.add(c6c.e(29, "Clear Mini Apps Permissions and Files"));
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("App"));
        a.t();
        a.m();
        arrayList.add(c6c.e(10, jb6.M0(2131751581, null)));
        arrayList.add(c6c.e(37, "Make Memory Dump"));
        c6c i = c6c.i(42, "Experimental settings");
        in0 in0Var = yed.a;
        in0Var.a();
        i.L(in0Var.d);
        arrayList.add(i);
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("Interface"));
        gm.P1();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            c6c i3 = c6c.i(34, jb6.M0(2131751557, null));
            i3.L(gda.R0);
            arrayList.add(i3);
        }
        if (gda.e() && i2 >= 31) {
            c6c i4 = c6c.i(31, "New GPU blur");
            i4.L(gda.X);
            arrayList.add(i4);
        }
        c6c i5 = c6c.i(36, "Force Forum Tabs");
        i5.L(gda.m);
        arrayList.add(i5);
        c6c i6 = c6c.i(39, "Frame metrics");
        i6.L(gda.o);
        arrayList.add(i6);
        c6c i7 = c6c.i(46, jb6.M0(2131751769, null));
        i7.L(gda.D0);
        arrayList.add(i7);
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("Camera and media"));
        c6c i8 = c6c.i(7, jb6.M0(2131751569, null));
        i8.L(gda.v0);
        arrayList.add(i8);
        c6c i9 = c6c.i(23, jb6.M0(2131751571, null));
        i9.L(ss3.o(getParentActivity()));
        arrayList.add(i9);
        c6c i10 = c6c.i(24, "SurfaceView in stories");
        i10.L(gda.Y);
        arrayList.add(i10);
        c6c i11 = c6c.i(33, "Video qualities debug");
        i11.L(gda.N0);
        arrayList.add(i11);
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("Calls"));
        arrayList.add(c6c.e(9, jb6.M0(2131751582, null)));
        arrayList.add(c6c.C(null));
        arrayList.add(c6c.u("WebView"));
        arrayList.add(c6c.e(15, jb6.M0(2131751578, null)));
        c6c i12 = c6c.i(16, jb6.M0(2131751567, null));
        i12.L(gda.F0);
        arrayList.add(i12);
        c6c i13 = c6c.i(32, "Adaptive browser colors");
        i13.L(gda.s0);
        arrayList.add(i13);
        c6c i14 = c6c.i(26, "Invoice Payment");
        i14.L(gda.a0);
        arrayList.add(i14);
        arrayList.add(c6c.C(null));
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131751583, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        boolean z;
        int i;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3 = 0;
        switch (c6cVar.d) {
            case 1:
                z = true;
                getUserConfig().V = true;
                getUserConfig().u(false);
                getContactsController().l();
                break;
            case 2:
                getContactsController().A(0L, false);
                z = true;
                break;
            case 3:
                getContactsController().K();
                z = true;
                break;
            case 4:
                getMessagesController().y0();
                z = true;
                break;
            case 5:
                cf7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new xc7(messagesStorage, -1, (byte) 2));
                z = true;
                break;
            case 6:
                e21.a = !e21.a;
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", e21.a).commit();
                if (e21.a) {
                    wi8.q(a.s, new StringBuilder("app start time = "));
                    try {
                        fc4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                    } catch (Exception e) {
                        z = true;
                        fc4.g(e, true);
                        break;
                    }
                }
                z = true;
                break;
            case 7:
                gda.v0 = !gda.v0;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("inappCamera", gda.v0);
                edit.apply();
                z = true;
                break;
            case 8:
                cf7 messagesStorage2 = getMessagesStorage();
                messagesStorage2.a.c(new xd7(messagesStorage2, (byte) 11));
                uf2 e2 = uf2.e(this.currentAccount);
                e2.c = 0L;
                e2.d = 0L;
                e2.f().edit().clear().apply();
                getMessagesController().X3.edit().remove("peerColors").remove("profilePeerColors").apply();
                z = true;
                break;
            case 9:
                sic.i(getParentActivity());
                z = true;
                break;
            case 10:
                z = true;
                ((LaunchActivity) getParentActivity()).A(true);
                break;
            case 11:
                z = true;
                gda.U = !gda.U;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putBoolean("disableVoiceAudioEffects", gda.U);
                edit2.apply();
                break;
            case 12:
                gda.f1 = null;
                gda.x();
                nm7.e().k(nm7.U4, new Object[0]);
                z = true;
                break;
            case 13:
                Set set = getMessagesController().u3;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                getNotificationCenter().k(nm7.s1, new Object[0]);
                z = true;
                break;
            case 14:
                a.b.deleteDatabase("webview.db");
                a.b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                try {
                    WebView webView = new WebView(a.b);
                    webView.clearHistory();
                    webView.destroy();
                } catch (Exception unused) {
                }
                z = true;
                break;
            case 15:
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                z = true;
                break;
            case 16:
                gda.J();
                Activity parentActivity = getParentActivity();
                if (gda.F0) {
                    i = 2131751555;
                } else {
                    i = 2131751556;
                }
                Toast.makeText(parentActivity, jb6.M0(i, null), 0).show();
                z = true;
                break;
            case 17:
                gda.V = !gda.V;
                SharedPreferences.Editor edit3 = oc7.d1().edit();
                edit3.putBoolean("forceDisableTabletMode", gda.V);
                edit3.apply();
                Activity parentActivity2 = getParentActivity();
                if (parentActivity2 != null) {
                    Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                    parentActivity2.finishAffinity();
                    parentActivity2.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                z = true;
                break;
            case 18:
                vie.a((LaunchActivity) getParentActivity(), !gda.t1, true);
                z = true;
                break;
            case 19:
                getMessagesController().W2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new aa3(this, (byte) 0));
                z = true;
                break;
            case 20:
                int i4 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
                StringBuilder sb = new StringBuilder();
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                for (int i5 = 0; i5 < i4; i5++) {
                    Long h1 = gm.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_min_freq");
                    Long h12 = gm.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_cur_freq");
                    Long h13 = gm.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_max_freq");
                    Long h14 = gm.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpu_capacity");
                    sb.append("#");
                    sb.append(i5);
                    sb.append(" ");
                    if (h1 != null) {
                        sb.append("min=");
                        l = h12;
                        sb.append(h1.longValue() / 1000);
                        sb.append(" ");
                        j = (h1.longValue() / 1000) + j;
                        j2++;
                    } else {
                        l = h12;
                    }
                    if (l != null) {
                        sb.append("cur=");
                        sb.append(l.longValue() / 1000);
                        sb.append(" ");
                        j3 = (l.longValue() / 1000) + j3;
                        j4++;
                    }
                    if (h13 != null) {
                        sb.append("max=");
                        sb.append(h13.longValue() / 1000);
                        sb.append(" ");
                        j5 = (h13.longValue() / 1000) + j5;
                        j6++;
                    }
                    if (h14 != null) {
                        sb.append("cpc=");
                        sb.append(h14);
                        sb.append(" ");
                        j7 = h14.longValue() + j7;
                        j8++;
                    }
                    sb.append("\n");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.MODEL);
                sb2.append(" (");
                sb2.append(Build.PRODUCT);
                sb2.append(", ");
                sb2.append(Build.DEVICE);
                sb2.append(")  (android ");
                int i6 = Build.VERSION.SDK_INT;
                sb2.append(i6);
                sb2.append(")\n");
                if (i6 >= 31) {
                    sb2.append("SoC: ");
                    sb2.append(Build.SOC_MANUFACTURER);
                    sb2.append(", ");
                    sb2.append(Build.SOC_MODEL);
                    sb2.append("\n");
                }
                String i1 = gm.i1("/sys/kernel/gpu/gpu_model");
                if (i1 != null) {
                    sb2.append("GPU: ");
                    sb2.append(i1);
                    Long h15 = gm.h1("/sys/kernel/gpu/gpu_min_clock");
                    Long h16 = gm.h1("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long h17 = gm.h1("/sys/kernel/gpu/gpu_max_clock");
                    if (h15 != null) {
                        sb2.append(", min=");
                        sb2.append(h15.longValue() / 1000);
                    }
                    if (h16 != null) {
                        sb2.append(", mmin=");
                        sb2.append(h16.longValue() / 1000);
                    }
                    if (h17 != null) {
                        sb2.append(", max=");
                        sb2.append(h17.longValue() / 1000);
                    }
                    sb2.append("\n");
                }
                ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) a.b.getSystemService("activity")).getDeviceConfigurationInfo();
                sb2.append("GLES Version: ");
                sb2.append(deviceConfigurationInfo.getGlEsVersion());
                sb2.append("\nMemory: class=");
                sb2.append(gm.i0(memoryClass << 20, false, false));
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sb2.append(", total=");
                sb2.append(gm.i0(memoryInfo.totalMem, false, false));
                sb2.append(", avail=");
                sb2.append(gm.i0(memoryInfo.availMem, false, false));
                sb2.append(", low?=");
                sb2.append(memoryInfo.lowMemory);
                sb2.append(" (threshold=");
                sb2.append(gm.i0(memoryInfo.threshold, false, false));
                sb2.append(")\nCurrent class: ");
                sb2.append(gda.w(gda.o()));
                sb2.append(", measured: ");
                sb2.append(gda.w(gda.u()));
                if (i6 >= 31) {
                    sb2.append(", suggest=");
                    sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                }
                sb2.append("\n");
                sb2.append(i4);
                sb2.append(" CPUs");
                if (j2 > 0) {
                    sb2.append(", avgMinFreq=");
                    sb2.append(j / j2);
                }
                if (j4 > 0) {
                    sb2.append(", avgCurFreq=");
                    sb2.append(j3 / j4);
                }
                if (j6 > 0) {
                    sb2.append(", avgMaxFreq=");
                    sb2.append(j5 / j6);
                }
                if (j8 > 0) {
                    sb2.append(", avgCapacity=");
                    sb2.append(j7 / j8);
                }
                sb2.append("\n");
                sb2.append((CharSequence) sb);
                d0("video/avc", sb2);
                d0("video/hevc", sb2);
                d0("video/x-vnd.on2.vp8", sb2);
                d0("video/x-vnd.on2.vp9", sb2);
                showDialog(new ca3(this, getParentActivity(), sb2.toString()));
                z = true;
                break;
            case 21:
                String str6 = "";
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                alertDialog$Builder.a.S = "Force performance class";
                int o = gda.o();
                int u = gda.u();
                if (o == 2) {
                    str = "**HIGH**";
                } else {
                    str = "HIGH";
                }
                if (u != 2) {
                    str2 = "";
                } else {
                    str2 = " (measured)";
                }
                SpannableStringBuilder S2 = gm.S2(str.concat(str2));
                if (o == 1) {
                    str3 = "**AVERAGE**";
                } else {
                    str3 = "AVERAGE";
                }
                if (u != 1) {
                    str4 = "";
                } else {
                    str4 = " (measured)";
                }
                SpannableStringBuilder S22 = gm.S2(str3.concat(str4));
                if (o == 0) {
                    str5 = "**LOW**";
                } else {
                    str5 = "LOW";
                }
                if (u == 0) {
                    str6 = " (measured)";
                }
                alertDialog$Builder.e(new CharSequence[]{S2, S22, gm.S2(str5.concat(str6))}, new ba3(u, (byte) 0));
                wi8.y(null, 2131752542, alertDialog$Builder, null);
                z = true;
                break;
            case 22:
            case 28:
            case 40:
            default:
                return;
            case 23:
                boolean o2 = ss3.o(getParentActivity());
                oc7.d1().edit().putBoolean("dual_available", !o2).apply();
                try {
                    Activity parentActivity3 = getParentActivity();
                    if (!o2) {
                        i2 = 2131751570;
                    } else {
                        i2 = 2131751572;
                    }
                    Toast.makeText(parentActivity3, jb6.M0(i2, null), 0).show();
                } catch (Exception unused2) {
                }
                z = true;
                break;
            case 24:
                gda.M();
                while (i3 < getParentLayout().getFragmentStack().size()) {
                    ((d) getParentLayout().getFragmentStack().get(i3)).clearSheets();
                    i3++;
                }
                z = true;
                break;
            case 25:
                gda.L();
                z = true;
                break;
            case 26:
                gda.K();
                z = true;
                break;
            case 27:
                getMediaDataController().G0(false, true, null);
                z = true;
                break;
            case 29:
                up0.a();
                tr0.b();
                mq0.a();
                yaa.c();
                z = true;
                break;
            case 30:
                p50.a();
                z = true;
                break;
            case 31:
                gda.O();
                z = true;
                break;
            case 32:
                gda.I();
                z = true;
                break;
            case 33:
                gda.N0 = !gda.N0;
                SharedPreferences.Editor edit4 = oc7.d1().edit();
                edit4.putBoolean("debugVideoQualities", gda.N0);
                edit4.apply();
                z = true;
                break;
            case 34:
                gda.R0 = !gda.R0;
                gm.a = null;
                SharedPreferences.Editor edit5 = oc7.d1().edit();
                edit5.putBoolean("useSystemBoldFont", gda.R0);
                edit5.apply();
                z = true;
                break;
            case 35:
                oc7.r1(this.currentAccount).W2(true);
                z = true;
                break;
            case 36:
                gda.m = !gda.m;
                SharedPreferences.Editor edit6 = oc7.d1().edit();
                edit6.putBoolean("forceForumTabs", gda.m);
                edit6.apply();
                z = true;
                break;
            case 37:
                fc4.j();
                fc4.c(true);
                z = true;
                break;
            case 38:
                gda.n = !gda.n;
                SharedPreferences.Editor edit7 = oc7.d1().edit();
                edit7.putBoolean("fastWallpaperDisabled", gda.n);
                edit7.apply();
                z = true;
                break;
            case 39:
                gda.o = !gda.o;
                SharedPreferences.Editor edit8 = oc7.d1().edit();
                edit8.putBoolean("frameMetricsEnabled", gda.o);
                edit8.apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.C();
                }
                z = true;
                break;
            case 41:
                SharedPreferences.Editor edit9 = a.b.getSharedPreferences("mainconfig", 0).edit();
                boolean z2 = !gda.c1;
                gda.c1 = z2;
                edit9.putBoolean("debugViewMetrics", z2).apply();
                z = true;
                break;
            case 42:
                in0 in0Var = yed.a;
                synchronized (in0Var) {
                    if (!in0Var.b) {
                        SharedPreferences sharedPreferences = jaa.a;
                        in0Var.c = sharedPreferences.contains("experimental_settings_allowed");
                        in0Var.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        in0Var.b = true;
                    }
                    boolean z3 = !in0Var.d;
                    in0Var.d = z3;
                    in0Var.c = true;
                    in0Var.b = true;
                    jaa.a.edit().putBoolean("experimental_settings_allowed", z3).apply();
                }
                z = true;
                break;
            case 43:
                while (i3 < 4) {
                    if (z8c.h(i3).o()) {
                        cf7 Y = cf7.Y(i3);
                        Y.a.c(new xd7(Y, (byte) 1));
                    }
                    i3++;
                }
                c41.b0(this).Q(2131624000, 36, "Widget heights cleared").j();
                z = true;
                break;
            case 44:
                gda.G0 = !gda.G0;
                oc7.d1().edit().putBoolean("widgetStaticLayers", gda.G0).apply();
                z = true;
                break;
            case 45:
                gda.C(false);
                kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(kt6.i(oc7.d1().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew"), "speedhint", "gifhint", "reminderhint", "soundHint"), "themehint", "bganimationhint", "filterhint", "n_0"), "storyprvhint", "storyhint", "storyhint2", "storydualhint"), "storysvddualhint", "stories_camera", "dualcam", "dualmatrix"), "dual_available", "archivehint", "askNotificationsAfter", "askNotificationsDuration"), "viewoncehint", "voicepausehint", "taptostorysoundhint", "nothanos"), "voiceoncehint", "savedhint", "savedsearchhint", "savedsearchtaghint"), "newppsms", "monetizationadshint", "seekSpeedHintShowed", "unsupport_video/av01"), "statusgiftpage", "multistorieshint", "trimvoicehint", "taptostoryhighlighthint"), "proxycheckstatusip", "callmiconstart", "showchattagsinfo", "language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
                sle.a();
                ewe.a(this.currentAccount);
                oc7.r1(this.currentAccount).Y3.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                oc7.e1().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
                gda.I = 0;
                gda.N = 0;
                gda.Q = false;
                gda.O = false;
                gda.P = false;
                gda.Y0 = 3;
                gda.Z0 = 3;
                gda.a1 = 3;
                gda.r1 = 3;
                gda.b0 = 2;
                gda.Q(2);
                gda.G(false);
                gda.F(false);
                gda.B(false);
                getNotificationCenter().k(nm7.s1, new Object[0]);
                qc9.a0();
                m58.e(this.currentAccount).a();
                SharedPreferences sharedPreferences2 = getMessagesController().X3;
                SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                edit10.remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str7 : sharedPreferences2.getAll().keySet()) {
                    if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                        edit10.remove(str7);
                    }
                }
                edit10.apply();
                SharedPreferences.Editor edit11 = oc7.r1(this.currentAccount).W3.edit();
                for (String str8 : oc7.r1(this.currentAccount).W3.getAll().keySet()) {
                    if (str8.startsWith("dialog_bar_botver")) {
                        edit11.remove(str8);
                    }
                }
                edit11.apply();
                z = true;
                break;
            case 46:
                gda.D0 = !gda.D0;
                SharedPreferences.Editor edit12 = oc7.d1().edit();
                edit12.putBoolean("compactMode", gda.D0);
                edit12.apply();
                cmb.j(false, false);
                z = true;
                break;
        }
        if (c6cVar.a == 4) {
            this.a.g3.O(z);
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
