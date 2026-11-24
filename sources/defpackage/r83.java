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
public final class r83 extends n5c {
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
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        arrayList.add(c4c.u("Contacts and chats"));
        arrayList.add(c4c.e(1, k96.M0(2131751617, null)));
        arrayList.add(c4c.e(2, k96.M0(2131751611, null)));
        arrayList.add(c4c.e(3, k96.M0(2131751610, null)));
        arrayList.add(c4c.e(4, k96.M0(2131751609, null)));
        arrayList.add(c4c.e(5, k96.M0(2131751612, null)));
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("Data"));
        arrayList.add(c4c.e(8, k96.M0(2131751631, null)));
        arrayList.add(c4c.e(45, "Forget all hints"));
        arrayList.add(c4c.e(35, "Reload app config"));
        boolean z = w01.a;
        arrayList.add(c4c.e(29, "Clear Mini Apps Permissions and Files"));
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("App"));
        a.t();
        a.m();
        arrayList.add(c4c.e(10, k96.M0(2131751632, null)));
        arrayList.add(c4c.e(37, "Make Memory Dump"));
        c4c i = c4c.i(42, "Experimental settings");
        im0 im0Var = wcd.a;
        im0Var.a();
        i.L(im0Var.d);
        arrayList.add(i);
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("Interface"));
        gl.P1();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            c4c i3 = c4c.i(34, k96.M0(2131751608, null));
            i3.L(gba.R0);
            arrayList.add(i3);
        }
        if (gba.e() && i2 >= 31) {
            c4c i4 = c4c.i(31, "New GPU blur");
            i4.L(gba.X);
            arrayList.add(i4);
        }
        c4c i5 = c4c.i(36, "Force Forum Tabs");
        i5.L(gba.m);
        arrayList.add(i5);
        c4c i6 = c4c.i(39, "Frame metrics");
        i6.L(gba.o);
        arrayList.add(i6);
        c4c i7 = c4c.i(46, k96.M0(2131751820, null));
        i7.L(gba.D0);
        arrayList.add(i7);
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("Camera and media"));
        c4c i8 = c4c.i(7, k96.M0(2131751620, null));
        i8.L(gba.v0);
        arrayList.add(i8);
        c4c i9 = c4c.i(23, k96.M0(2131751622, null));
        i9.L(ir3.o(getParentActivity()));
        arrayList.add(i9);
        c4c i10 = c4c.i(24, "SurfaceView in stories");
        i10.L(gba.Y);
        arrayList.add(i10);
        c4c i11 = c4c.i(33, "Video qualities debug");
        i11.L(gba.N0);
        arrayList.add(i11);
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("Calls"));
        arrayList.add(c4c.e(9, k96.M0(2131751633, null)));
        arrayList.add(c4c.C(null));
        arrayList.add(c4c.u("WebView"));
        arrayList.add(c4c.e(15, k96.M0(2131751629, null)));
        c4c i12 = c4c.i(16, k96.M0(2131751618, null));
        i12.L(gba.F0);
        arrayList.add(i12);
        c4c i13 = c4c.i(32, "Adaptive browser colors");
        i13.L(gba.s0);
        arrayList.add(i13);
        c4c i14 = c4c.i(26, "Invoice Payment");
        i14.L(gba.a0);
        arrayList.add(i14);
        arrayList.add(c4c.C(null));
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131751634, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
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
        switch (c4cVar.d) {
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
                ad7 messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new wa7(messagesStorage, -1, (byte) 2));
                z = true;
                break;
            case 6:
                w01.a = !w01.a;
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", w01.a).commit();
                if (w01.a) {
                    ug8.q(a.s, new StringBuilder("app start time = "));
                    try {
                        fa4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                    } catch (Exception e) {
                        z = true;
                        fa4.g(e, true);
                        break;
                    }
                }
                z = true;
                break;
            case 7:
                gba.v0 = !gba.v0;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("inappCamera", gba.v0);
                edit.apply();
                z = true;
                break;
            case 8:
                ad7 messagesStorage2 = getMessagesStorage();
                messagesStorage2.a.c(new vb7(messagesStorage2, (byte) 11));
                je2 e2 = je2.e(this.currentAccount);
                e2.c = 0L;
                e2.d = 0L;
                e2.f().edit().clear().apply();
                getMessagesController().X3.edit().remove("peerColors").remove("profilePeerColors").apply();
                z = true;
                break;
            case 9:
                rgc.i(getParentActivity());
                z = true;
                break;
            case 10:
                z = true;
                ((LaunchActivity) getParentActivity()).A(true);
                break;
            case 11:
                z = true;
                gba.U = !gba.U;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putBoolean("disableVoiceAudioEffects", gba.U);
                edit2.apply();
                break;
            case 12:
                gba.f1 = null;
                gba.x();
                kk7.e().k(kk7.S4, new Object[0]);
                z = true;
                break;
            case 13:
                Set set = getMessagesController().u3;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                getNotificationCenter().k(kk7.r1, new Object[0]);
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
                gba.J();
                Activity parentActivity = getParentActivity();
                if (gba.F0) {
                    i = 2131751606;
                } else {
                    i = 2131751607;
                }
                Toast.makeText(parentActivity, k96.M0(i, null), 0).show();
                z = true;
                break;
            case 17:
                gba.V = !gba.V;
                SharedPreferences.Editor edit3 = na7.c1().edit();
                edit3.putBoolean("forceDisableTabletMode", gba.V);
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
                uge.a((LaunchActivity) getParentActivity(), !gba.t1, true);
                z = true;
                break;
            case 19:
                getMessagesController().U2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new o83(this, (byte) 0));
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
                    Long h1 = gl.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_min_freq");
                    Long h12 = gl.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_cur_freq");
                    Long h13 = gl.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_max_freq");
                    Long h14 = gl.h1("/sys/devices/system/cpu/cpu" + i5 + "/cpu_capacity");
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
                String i1 = gl.i1("/sys/kernel/gpu/gpu_model");
                if (i1 != null) {
                    sb2.append("GPU: ");
                    sb2.append(i1);
                    Long h15 = gl.h1("/sys/kernel/gpu/gpu_min_clock");
                    Long h16 = gl.h1("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long h17 = gl.h1("/sys/kernel/gpu/gpu_max_clock");
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
                sb2.append(gl.i0(memoryClass << 20, false, false));
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sb2.append(", total=");
                sb2.append(gl.i0(memoryInfo.totalMem, false, false));
                sb2.append(", avail=");
                sb2.append(gl.i0(memoryInfo.availMem, false, false));
                sb2.append(", low?=");
                sb2.append(memoryInfo.lowMemory);
                sb2.append(" (threshold=");
                sb2.append(gl.i0(memoryInfo.threshold, false, false));
                sb2.append(")\nCurrent class: ");
                sb2.append(gba.w(gba.o()));
                sb2.append(", measured: ");
                sb2.append(gba.w(gba.u()));
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
                showDialog(new q83(this, getParentActivity(), sb2.toString()));
                z = true;
                break;
            case 21:
                String str6 = "";
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                alertDialog$Builder.a.S = "Force performance class";
                int o = gba.o();
                int u = gba.u();
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
                SpannableStringBuilder S2 = gl.S2(str.concat(str2));
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
                SpannableStringBuilder S22 = gl.S2(str3.concat(str4));
                if (o == 0) {
                    str5 = "**LOW**";
                } else {
                    str5 = "LOW";
                }
                if (u == 0) {
                    str6 = " (measured)";
                }
                alertDialog$Builder.e(new CharSequence[]{S2, S22, gl.S2(str5.concat(str6))}, new p83(u, (byte) 0));
                ug8.y(null, 2131752577, alertDialog$Builder, null);
                z = true;
                break;
            case 22:
            case 28:
            case 40:
            default:
                return;
            case 23:
                boolean o2 = ir3.o(getParentActivity());
                na7.c1().edit().putBoolean("dual_available", !o2).apply();
                try {
                    Activity parentActivity3 = getParentActivity();
                    if (!o2) {
                        i2 = 2131751621;
                    } else {
                        i2 = 2131751623;
                    }
                    Toast.makeText(parentActivity3, k96.M0(i2, null), 0).show();
                } catch (Exception unused2) {
                }
                z = true;
                break;
            case 24:
                gba.M();
                while (i3 < getParentLayout().getFragmentStack().size()) {
                    ((d) getParentLayout().getFragmentStack().get(i3)).clearSheets();
                    i3++;
                }
                z = true;
                break;
            case 25:
                gba.L();
                z = true;
                break;
            case 26:
                gba.K();
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
                y8a.c();
                z = true;
                break;
            case 30:
                p40.a();
                z = true;
                break;
            case 31:
                gba.O();
                z = true;
                break;
            case 32:
                gba.I();
                z = true;
                break;
            case 33:
                gba.N0 = !gba.N0;
                SharedPreferences.Editor edit4 = na7.c1().edit();
                edit4.putBoolean("debugVideoQualities", gba.N0);
                edit4.apply();
                z = true;
                break;
            case 34:
                gba.R0 = !gba.R0;
                gl.a = null;
                SharedPreferences.Editor edit5 = na7.c1().edit();
                edit5.putBoolean("useSystemBoldFont", gba.R0);
                edit5.apply();
                z = true;
                break;
            case 35:
                na7.q1(this.currentAccount).U2(true);
                z = true;
                break;
            case 36:
                gba.m = !gba.m;
                SharedPreferences.Editor edit6 = na7.c1().edit();
                edit6.putBoolean("forceForumTabs", gba.m);
                edit6.apply();
                z = true;
                break;
            case 37:
                fa4.j();
                fa4.c(true);
                z = true;
                break;
            case 38:
                gba.n = !gba.n;
                SharedPreferences.Editor edit7 = na7.c1().edit();
                edit7.putBoolean("fastWallpaperDisabled", gba.n);
                edit7.apply();
                z = true;
                break;
            case 39:
                gba.o = !gba.o;
                SharedPreferences.Editor edit8 = na7.c1().edit();
                edit8.putBoolean("frameMetricsEnabled", gba.o);
                edit8.apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.C();
                }
                z = true;
                break;
            case 41:
                SharedPreferences.Editor edit9 = a.b.getSharedPreferences("mainconfig", 0).edit();
                boolean z2 = !gba.c1;
                gba.c1 = z2;
                edit9.putBoolean("debugViewMetrics", z2).apply();
                z = true;
                break;
            case 42:
                im0 im0Var = wcd.a;
                synchronized (im0Var) {
                    if (!im0Var.b) {
                        SharedPreferences sharedPreferences = j8a.a;
                        im0Var.c = sharedPreferences.contains("experimental_settings_allowed");
                        im0Var.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        im0Var.b = true;
                    }
                    boolean z3 = !im0Var.d;
                    im0Var.d = z3;
                    im0Var.c = true;
                    im0Var.b = true;
                    j8a.a.edit().putBoolean("experimental_settings_allowed", z3).apply();
                }
                z = true;
                break;
            case 43:
                while (i3 < 4) {
                    if (y6c.h(i3).o()) {
                        ad7 Y = ad7.Y(i3);
                        Y.a.c(new vb7(Y, (byte) 1));
                    }
                    i3++;
                }
                u21.b0(this).Q(2131624000, 36, "Widget heights cleared").j();
                z = true;
                break;
            case 44:
                gba.G0 = !gba.G0;
                na7.c1().edit().putBoolean("widgetStaticLayers", gba.G0).apply();
                z = true;
                break;
            case 45:
                gba.C(false);
                ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(ls6.i(na7.c1().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew"), "speedhint", "gifhint", "reminderhint", "soundHint"), "themehint", "bganimationhint", "filterhint", "n_0"), "storyprvhint", "storyhint", "storyhint2", "storydualhint"), "storysvddualhint", "stories_camera", "dualcam", "dualmatrix"), "dual_available", "archivehint", "askNotificationsAfter", "askNotificationsDuration"), "viewoncehint", "voicepausehint", "taptostorysoundhint", "nothanos"), "voiceoncehint", "savedhint", "savedsearchhint", "savedsearchtaghint"), "newppsms", "monetizationadshint", "seekSpeedHintShowed", "unsupport_video/av01"), "statusgiftpage", "multistorieshint", "trimvoicehint", "taptostoryhighlighthint"), "proxycheckstatusip", "callmiconstart", "showchattagsinfo", "language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
                qje.a();
                bue.a(this.currentAccount);
                na7.q1(this.currentAccount).Y3.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                na7.d1().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
                gba.I = 0;
                gba.N = 0;
                gba.Q = false;
                gba.O = false;
                gba.P = false;
                gba.Y0 = 3;
                gba.Z0 = 3;
                gba.a1 = 3;
                gba.r1 = 3;
                gba.b0 = 2;
                gba.Q(2);
                gba.G(false);
                gba.F(false);
                gba.B(false);
                getNotificationCenter().k(kk7.r1, new Object[0]);
                qa9.Z();
                k38.e(this.currentAccount).a();
                SharedPreferences sharedPreferences2 = getMessagesController().X3;
                SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                edit10.remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str7 : sharedPreferences2.getAll().keySet()) {
                    if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                        edit10.remove(str7);
                    }
                }
                edit10.apply();
                SharedPreferences.Editor edit11 = na7.q1(this.currentAccount).W3.edit();
                for (String str8 : na7.q1(this.currentAccount).W3.getAll().keySet()) {
                    if (str8.startsWith("dialog_bar_botver")) {
                        edit11.remove(str8);
                    }
                }
                edit11.apply();
                z = true;
                break;
            case 46:
                gba.D0 = !gba.D0;
                SharedPreferences.Editor edit12 = na7.c1().edit();
                edit12.putBoolean("compactMode", gba.D0);
                edit12.apply();
                bkb.j(false, false);
                z = true;
                break;
        }
        if (c4cVar.a == 4) {
            this.a.g3.O(z);
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
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
    public final o39 getListViewForSimpleGlass() {
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
