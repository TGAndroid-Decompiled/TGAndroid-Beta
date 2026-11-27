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
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.messenger.voip.GroupCallEngine;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
public final class k93 extends n9c {
    public static void c0(String str, StringBuilder sb) {
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
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        arrayList.add(b8c.u("Contacts and chats"));
        arrayList.add(b8c.e(1, ob6.M0(2131751594, null)));
        arrayList.add(b8c.e(2, ob6.M0(2131751588, null)));
        arrayList.add(b8c.e(3, ob6.M0(2131751587, null)));
        arrayList.add(b8c.e(4, ob6.M0(2131751586, null)));
        arrayList.add(b8c.e(5, ob6.M0(2131751589, null)));
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("Data"));
        arrayList.add(b8c.e(8, ob6.M0(2131751608, null)));
        arrayList.add(b8c.e(45, "Forget all hints"));
        arrayList.add(b8c.e(35, "Reload app config"));
        boolean z = f11.a;
        arrayList.add(b8c.e(29, "Clear Mini Apps Permissions and Files"));
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("App"));
        a.t();
        a.m();
        arrayList.add(b8c.e(10, ob6.M0(2131751609, null)));
        arrayList.add(b8c.e(37, "Make Memory Dump"));
        b8c i = b8c.i(42, "Experimental settings");
        im0 im0Var = phd.a;
        im0Var.a();
        i.L(im0Var.d);
        arrayList.add(i);
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("Interface"));
        hl.P1();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            b8c i3 = b8c.i(34, ob6.M0(2131751585, null));
            i3.L(xea.R0);
            arrayList.add(i3);
        }
        if (xea.e() && i2 >= 31) {
            b8c i4 = b8c.i(31, "New GPU blur");
            i4.L(xea.X);
            arrayList.add(i4);
        }
        b8c i5 = b8c.i(36, "Force Forum Tabs");
        i5.L(xea.m);
        arrayList.add(i5);
        b8c i6 = b8c.i(39, "Frame metrics");
        i6.L(xea.o);
        arrayList.add(i6);
        b8c i7 = b8c.i(46, ob6.M0(2131751797, null));
        i7.L(xea.D0);
        arrayList.add(i7);
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("Camera and media"));
        b8c i8 = b8c.i(7, ob6.M0(2131751597, null));
        i8.L(xea.v0);
        arrayList.add(i8);
        b8c i9 = b8c.i(23, ob6.M0(2131751599, null));
        i9.L(as3.g0(getParentActivity()));
        arrayList.add(i9);
        b8c i10 = b8c.i(24, "SurfaceView in stories");
        i10.L(xea.Y);
        arrayList.add(i10);
        b8c i11 = b8c.i(33, "Video qualities debug");
        i11.L(xea.N0);
        arrayList.add(i11);
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("Calls"));
        arrayList.add(b8c.e(9, ob6.M0(2131751610, null)));
        arrayList.add(b8c.C(null));
        arrayList.add(b8c.u("WebView"));
        arrayList.add(b8c.e(15, ob6.M0(2131751606, null)));
        b8c i12 = b8c.i(16, ob6.M0(2131751595, null));
        i12.L(xea.F0);
        arrayList.add(i12);
        b8c i13 = b8c.i(32, "Adaptive browser colors");
        i13.L(xea.s0);
        arrayList.add(i13);
        b8c i14 = b8c.i(26, "Invoice Payment");
        i14.L(xea.a0);
        arrayList.add(i14);
        arrayList.add(b8c.C(null));
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131751611, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int i3 = 0;
        switch (b8cVar.d) {
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
                getMessagesController().A0();
                z = true;
                break;
            case 5:
                jf7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new ad7(messagesStorage, -1, (byte) 2));
                z = true;
                break;
            case 6:
                f11.a = !f11.a;
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", f11.a).commit();
                if (f11.a) {
                    ik8.q(a.s, new StringBuilder("app start time = "));
                    try {
                        cc4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                    } catch (Exception e) {
                        z = true;
                        cc4.g(e, true);
                        break;
                    }
                }
                z = true;
                break;
            case 7:
                xea.v0 = !xea.v0;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("inappCamera", xea.v0);
                edit.apply();
                z = true;
                break;
            case 8:
                jf7 messagesStorage2 = getMessagesStorage();
                messagesStorage2.a.c(new be7(messagesStorage2, (byte) 11));
                af2 e2 = af2.e(this.currentAccount);
                e2.c = 0L;
                e2.d = 0L;
                e2.f().edit().clear().apply();
                getMessagesController().X3.edit().remove("peerColors").remove("profilePeerColors").apply();
                DictationLid.b();
                z = true;
                break;
            case 9:
                xkc.i(getParentActivity());
                z = true;
                break;
            case 10:
                z = true;
                ((LaunchActivity) getParentActivity()).A(true);
                break;
            case 11:
                z = true;
                xea.U = !xea.U;
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                edit2.putBoolean("disableVoiceAudioEffects", xea.U);
                edit2.apply();
                break;
            case 12:
                xea.f1 = null;
                xea.x();
                jn7.e().k(jn7.T4, new Object[0]);
                z = true;
                break;
            case 13:
                Set set = getMessagesController().u3;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                getNotificationCenter().k(jn7.s1, new Object[0]);
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
                xea.J();
                Activity parentActivity = getParentActivity();
                if (xea.F0) {
                    i = 2131751583;
                } else {
                    i = 2131751584;
                }
                Toast.makeText(parentActivity, ob6.M0(i, null), 0).show();
                z = true;
                break;
            case 17:
                xea.V = !xea.V;
                SharedPreferences.Editor edit3 = uc7.e1().edit();
                edit3.putBoolean("forceDisableTabletMode", xea.V);
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
                nle.a((LaunchActivity) getParentActivity(), !xea.t1, true);
                z = true;
                break;
            case 19:
                getMessagesController().a3(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new h93(this, (byte) 0));
                z = true;
                break;
            case 20:
                String str7 = "/sys/devices/system/cpu/cpu";
                int i4 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                while (i5 < i4) {
                    Long h1 = hl.h1(str7 + i5 + "/cpufreq/cpuinfo_min_freq");
                    Long h12 = hl.h1(str7 + i5 + "/cpufreq/cpuinfo_cur_freq");
                    Long h13 = hl.h1(str7 + i5 + "/cpufreq/cpuinfo_max_freq");
                    Long h14 = hl.h1(str7 + i5 + "/cpu_capacity");
                    sb.append("#");
                    sb.append(i5);
                    sb.append(" ");
                    if (h1 != null) {
                        sb.append("min=");
                        str = str7;
                        sb.append(h1.longValue() / 1000);
                        sb.append(" ");
                        j = (h1.longValue() / 1000) + j;
                        j2++;
                    } else {
                        str = str7;
                    }
                    if (h12 != null) {
                        sb.append("cur=");
                        sb.append(h12.longValue() / 1000);
                        sb.append(" ");
                        j3 = (h12.longValue() / 1000) + j3;
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
                    i5++;
                    str7 = str;
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
                String i1 = hl.i1("/sys/kernel/gpu/gpu_model");
                if (i1 != null) {
                    sb2.append("GPU: ");
                    sb2.append(i1);
                    Long h15 = hl.h1("/sys/kernel/gpu/gpu_min_clock");
                    Long h16 = hl.h1("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long h17 = hl.h1("/sys/kernel/gpu/gpu_max_clock");
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
                sb2.append(hl.i0(memoryClass << 20, false, false));
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sb2.append(", total=");
                sb2.append(hl.i0(memoryInfo.totalMem, false, false));
                sb2.append(", avail=");
                sb2.append(hl.i0(memoryInfo.availMem, false, false));
                sb2.append(", low?=");
                sb2.append(memoryInfo.lowMemory);
                sb2.append(" (threshold=");
                sb2.append(hl.i0(memoryInfo.threshold, false, false));
                sb2.append(")\nCurrent class: ");
                sb2.append(xea.w(xea.o()));
                sb2.append(", measured: ");
                sb2.append(xea.w(xea.u()));
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
                c0("video/avc", sb2);
                c0("video/hevc", sb2);
                c0("video/x-vnd.on2.vp8", sb2);
                c0("video/x-vnd.on2.vp9", sb2);
                showDialog(new j93(this, getParentActivity(), sb2.toString()));
                z = true;
                break;
            case 21:
                String str8 = "";
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                alertDialog$Builder.a.S = "Force performance class";
                int o = xea.o();
                int u = xea.u();
                if (o == 2) {
                    str2 = "**HIGH**";
                } else {
                    str2 = "HIGH";
                }
                if (u != 2) {
                    str3 = "";
                } else {
                    str3 = " (measured)";
                }
                SpannableStringBuilder S2 = hl.S2(str2.concat(str3));
                if (o == 1) {
                    str4 = "**AVERAGE**";
                } else {
                    str4 = "AVERAGE";
                }
                if (u != 1) {
                    str5 = "";
                } else {
                    str5 = " (measured)";
                }
                SpannableStringBuilder S22 = hl.S2(str4.concat(str5));
                if (o == 0) {
                    str6 = "**LOW**";
                } else {
                    str6 = "LOW";
                }
                if (u == 0) {
                    str8 = " (measured)";
                }
                alertDialog$Builder.e(new CharSequence[]{S2, S22, hl.S2(str6.concat(str8))}, new i93(u, (byte) 0));
                ik8.y(null, 2131752570, alertDialog$Builder, null);
                z = true;
                break;
            case 22:
            case 28:
            case 40:
            default:
                return;
            case 23:
                boolean g0 = as3.g0(getParentActivity());
                uc7.e1().edit().putBoolean("dual_available", !g0).apply();
                try {
                    Activity parentActivity3 = getParentActivity();
                    if (!g0) {
                        i2 = 2131751598;
                    } else {
                        i2 = 2131751600;
                    }
                    Toast.makeText(parentActivity3, ob6.M0(i2, null), 0).show();
                } catch (Exception unused2) {
                }
                z = true;
                break;
            case 24:
                xea.M();
                while (i3 < getParentLayout().getFragmentStack().size()) {
                    ((e) getParentLayout().getFragmentStack().get(i3)).clearSheets();
                    i3++;
                }
                z = true;
                break;
            case 25:
                xea.L();
                z = true;
                break;
            case 26:
                xea.K();
                z = true;
                break;
            case 27:
                getMediaDataController().G0(false, true, null);
                z = true;
                break;
            case 29:
                uo0.a();
                tq0.b();
                mp0.a();
                oca.c();
                z = true;
                break;
            case 30:
                r40.a();
                z = true;
                break;
            case 31:
                xea.O();
                z = true;
                break;
            case 32:
                xea.I();
                z = true;
                break;
            case 33:
                xea.N0 = !xea.N0;
                SharedPreferences.Editor edit4 = uc7.e1().edit();
                edit4.putBoolean("debugVideoQualities", xea.N0);
                edit4.apply();
                z = true;
                break;
            case 34:
                xea.R0 = !xea.R0;
                hl.a = null;
                SharedPreferences.Editor edit5 = uc7.e1().edit();
                edit5.putBoolean("useSystemBoldFont", xea.R0);
                edit5.apply();
                z = true;
                break;
            case 35:
                uc7.s1(this.currentAccount).a3(true);
                z = true;
                break;
            case 36:
                xea.m = !xea.m;
                SharedPreferences.Editor edit6 = uc7.e1().edit();
                edit6.putBoolean("forceForumTabs", xea.m);
                edit6.apply();
                z = true;
                break;
            case 37:
                cc4.j();
                cc4.c(true);
                z = true;
                break;
            case 38:
                xea.n = !xea.n;
                SharedPreferences.Editor edit7 = uc7.e1().edit();
                edit7.putBoolean("fastWallpaperDisabled", xea.n);
                edit7.apply();
                z = true;
                break;
            case 39:
                xea.o = !xea.o;
                SharedPreferences.Editor edit8 = uc7.e1().edit();
                edit8.putBoolean("frameMetricsEnabled", xea.o);
                edit8.apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.C();
                }
                z = true;
                break;
            case 41:
                SharedPreferences.Editor edit9 = a.b.getSharedPreferences("mainconfig", 0).edit();
                boolean z2 = !xea.c1;
                xea.c1 = z2;
                edit9.putBoolean("debugViewMetrics", z2).apply();
                z = true;
                break;
            case 42:
                im0 im0Var = phd.a;
                synchronized (im0Var) {
                    if (!im0Var.b) {
                        SharedPreferences sharedPreferences = zba.a;
                        im0Var.c = sharedPreferences.contains("experimental_settings_allowed");
                        im0Var.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        im0Var.b = true;
                    }
                    boolean z3 = !im0Var.d;
                    im0Var.d = z3;
                    im0Var.c = true;
                    im0Var.b = true;
                    zba.a.edit().putBoolean("experimental_settings_allowed", z3).apply();
                }
                z = true;
                break;
            case 43:
                while (i3 < 4) {
                    if (yac.h(i3).o()) {
                        jf7 Y = jf7.Y(i3);
                        Y.a.c(new be7(Y, (byte) 1));
                    }
                    i3++;
                }
                d31.b0(this).Q(2131624000, 36, "Widget heights cleared").j();
                z = true;
                break;
            case 44:
                xea.G0 = !xea.G0;
                uc7.e1().edit().putBoolean("widgetStaticLayers", xea.G0).apply();
                z = true;
                break;
            case 45:
                xea.C(false);
                qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(qu6.i(uc7.e1().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew"), "speedhint", "gifhint", "reminderhint", "soundHint"), "themehint", "bganimationhint", "filterhint", "n_0"), "storyprvhint", "storyhint", "storyhint2", "storydualhint"), "storysvddualhint", "stories_camera", "dualcam", "dualmatrix"), "dual_available", "archivehint", "askNotificationsAfter", "askNotificationsDuration"), "viewoncehint", "voicepausehint", "taptostorysoundhint", "nothanos"), "voiceoncehint", "savedhint", "savedsearchhint", "savedsearchtaghint"), "newppsms", "monetizationadshint", "seekSpeedHintShowed", "unsupport_video/av01"), "statusgiftpage", "multistorieshint", "trimvoicehint", "taptostoryhighlighthint"), "proxycheckstatusip", "callmiconstart", "showchattagsinfo", "language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
                ioe.a();
                DictationLid.b();
                vye.a(this.currentAccount);
                uc7.s1(this.currentAccount).Y3.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                uc7.f1().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
                xea.I = 0;
                xea.N = 0;
                xea.Q = false;
                xea.O = false;
                xea.P = false;
                xea.Y0 = 3;
                xea.Z0 = 3;
                xea.a1 = 3;
                xea.r1 = 3;
                xea.b0 = 2;
                xea.Q(2);
                xea.G(false);
                xea.F(false);
                xea.B(false);
                getNotificationCenter().k(jn7.s1, new Object[0]);
                ee9.Z();
                a78.e(this.currentAccount).a();
                SharedPreferences sharedPreferences2 = getMessagesController().X3;
                SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                edit10.remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str9 : sharedPreferences2.getAll().keySet()) {
                    if (str9.contains("show_gift_for_") || str9.contains("bdayhint_") || str9.contains("bdayanim_") || str9.startsWith("ask_paid_message_") || str9.startsWith("topicssidetabs")) {
                        edit10.remove(str9);
                    }
                }
                edit10.apply();
                SharedPreferences.Editor edit11 = uc7.s1(this.currentAccount).W3.edit();
                for (String str10 : uc7.s1(this.currentAccount).W3.getAll().keySet()) {
                    if (str10.startsWith("dialog_bar_botver")) {
                        edit11.remove(str10);
                    }
                }
                edit11.apply();
                z = true;
                break;
            case 46:
                xea.D0 = !xea.D0;
                SharedPreferences.Editor edit12 = uc7.e1().edit();
                edit12.putBoolean("compactMode", xea.D0);
                edit12.apply();
                aob.j(false, false);
                z = true;
                break;
            case 47:
                String[] strArr = {"", "legacy", "java", "opensles", "auto"};
                String debugOverride = CallAudioDevice.getDebugOverride();
                int i7 = 0;
                while (true) {
                    if (i7 < 5) {
                        if (strArr[i7].equals(debugOverride)) {
                            i3 = i7;
                        } else {
                            i7++;
                        }
                    }
                }
                CallAudioDevice.setDebugOverride(strArr[(i3 + 1) % 5]);
                this.a.g3.O(true);
                z = true;
                break;
            case 48:
                String[] strArr2 = {"", "reference", "custom"};
                String debugOverride2 = GroupCallEngine.getDebugOverride();
                int i8 = 0;
                while (true) {
                    if (i8 < 3) {
                        if (strArr2[i8].equals(debugOverride2)) {
                            i3 = i8;
                        } else {
                            i8++;
                        }
                    }
                }
                GroupCallEngine.setDebugOverride(strArr2[(i3 + 1) % 3]);
                this.a.g3.O(true);
                z = true;
                break;
        }
        if (b8cVar.a == 4) {
            this.a.g3.O(z);
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        DictationLid.b();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
