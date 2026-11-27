package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ixc extends n9c implements fn7 {
    public d58 e;
    public final vs f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public ixc(vs vsVar) {
        this.f = vsVar;
    }

    public static boolean c0(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !c0(file2, bool)) {
                        z = false;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                file.delete();
            }
        } else if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
            return false;
        } else {
            file.delete();
        }
        return true;
    }

    public static long d0(File file, Boolean bool) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += d0(file2, bool);
                }
                return j;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String M0 = ob6.M0(2131752838, null);
        b8c b8cVar = new b8c(9);
        b8cVar.d = 1;
        b8cVar.m = M0;
        b8cVar.L(S2);
        arrayList.add(b8cVar);
        arrayList.add(b8c.C(ob6.M0(2131752837, null)));
        int i = 0;
        if (!S2) {
            getMessagesController().U2();
            b8c i2 = b8c.i(17, ob6.M0(2131742565, null));
            i2.L(getMessagesController().U2());
            arrayList.add(i2);
            arrayList.add(b8c.C(ob6.M0(2131742564, null)));
            arrayList.add(b8c.u(ob6.M0(2131752846, null)));
            arrayList.size();
            d58 d58Var = this.e;
            String M02 = ob6.M0(2131752830, null);
            b8c b8cVar2 = new b8c(3);
            b8cVar2.d = 16;
            b8cVar2.H = d58Var;
            b8cVar2.m = M02;
            b8cVar2.r = true;
            arrayList.add(b8cVar2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().o5;
            if (tL_webBrowserSettings == null) {
                arrayList3 = new ArrayList<>();
            } else {
                arrayList3 = tL_webBrowserSettings.inapp_exceptions;
            }
            int size = arrayList3.size();
            while (i < size) {
                TL_account.WebDomainException webDomainException = arrayList3.get(i);
                i++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str2 = webDomainException2.domain;
                String str3 = webDomainException2.title;
                long j = webDomainException2.favicon;
                int i3 = gxc.b;
                b8c K = b8c.K(gxc.class);
                K.m = str2;
                K.o = str3;
                K.C = j;
                arrayList.add(K);
            }
            arrayList.add(b8c.C(ob6.M0(2131752847, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                b8c e = b8c.e(5, ob6.M0(2131752829, null));
                e.s = true;
                arrayList.add(e);
                arrayList.add(b8c.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = ob6.M0(2131752843, null);
        long j2 = this.n;
        String str4 = "";
        if (j2 <= 0) {
            str = "";
        } else {
            str = hl.i0(j2, false, false);
        }
        arrayList.add(b8c.d(3, 2131231780, M03, str));
        arrayList.size();
        String M04 = ob6.M0(2131752845, null);
        long j3 = this.h;
        if (j3 > 0) {
            str4 = hl.i0(j3, false, false);
        }
        arrayList.add(b8c.d(2, 2131231779, M04, str4));
        arrayList.add(b8c.C(ob6.M0(2131752841, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(b8c.c(9, 2131231781, ob6.M0(2131752831, null)));
            arrayList.size();
            arrayList.add(b8c.d(7, 2131231779, ob6.M0(2131752836, null), ob6.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(b8c.C(null));
        }
        arrayList.add(b8c.u(ob6.M0(2131752827, null)));
        arrayList.size();
        d58 d58Var2 = this.e;
        String M05 = ob6.M0(2131752830, null);
        b8c b8cVar3 = new b8c(3);
        b8cVar3.d = 15;
        b8cVar3.H = d58Var2;
        b8cVar3.m = M05;
        b8cVar3.r = true;
        arrayList.add(b8cVar3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().o5;
        if (tL_webBrowserSettings2 == null) {
            arrayList2 = new ArrayList<>();
        } else {
            arrayList2 = tL_webBrowserSettings2.external_exceptions;
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList2.get(i4);
            i4++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str5 = webDomainException4.domain;
            String str6 = webDomainException4.title;
            long j4 = webDomainException4.favicon;
            int i5 = gxc.b;
            b8c K2 = b8c.K(gxc.class);
            K2.m = str5;
            K2.o = str6;
            K2.C = j4;
            arrayList.add(K2);
        }
        arrayList.add(b8c.C(ob6.M0(2131752828, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            b8c e2 = b8c.e(5, ob6.M0(2131752829, null));
            e2.s = true;
            arrayList.add(e2);
            arrayList.add(b8c.C(null));
        }
        arrayList.size();
        arrayList.add(b8c.d(6, 2131232359, ob6.M0(2131745527, null), bw9.a().a));
        arrayList.add(b8c.C(ob6.M0(2131752823, null)));
        boolean z = f11.a;
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131752822, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        View view2;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4 = b8cVar.d;
        if (i4 == 12) {
            xea.I();
            ((wkb) view).setChecked(xea.s0);
        } else if (i4 == 13) {
            xea.t0 = !xea.t0;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("onlyLocalInstantView", xea.t0);
            edit.apply();
            ((wkb) view).setChecked(xea.t0);
        } else if (i4 == 17) {
            boolean z2 = !getMessagesController().U2();
            uc7 messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
            if (tL_webBrowserSettings != null) {
                messagesController.I5(tL_webBrowserSettings.open_external_browser, z2);
            }
            ((wkb) view).setChecked(z2);
            this.a.g3.O(true);
        } else if (i4 == 1) {
            uc7 messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.o5;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.I5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean S2 = getMessagesController().S2();
            wkb wkbVar = (wkb) view;
            wkbVar.setChecked(S2);
            if (S2) {
                i3 = aob.f6;
            } else {
                i3 = aob.e6;
            }
            wkbVar.b(aob.w0(null, i3, false), S2);
            this.a.g3.O(true);
        } else if (i4 == 10) {
            uc7 messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.o5;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.I5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
        } else if (i4 == 11) {
            uc7 messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.o5;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.I5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
        } else {
            String str = "";
            if (i4 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M0 = ob6.M0(2131752845, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                if (this.h != 0) {
                    str = c00.k(new StringBuilder(" ("), hl.i0(this.h, false, false), ")");
                }
                idVar.U = ob6.a0(null, null, 2131752844, str);
                alertDialog$Builder.j(ob6.M0(2131752066, null), new fd(this) {
                    public final ixc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar2, int i5) {
                        byte b = r2;
                        ixc ixcVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(ixcVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        ixc.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        ixc.c0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                                j84 c = j84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                ixcVar.e0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        ixc.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                }
                                ixcVar.e0();
                                return;
                            case 2:
                                try {
                                    ptd.c.clear();
                                    ptd.d.clear();
                                    File file4 = new File(xb4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    cc4.g(e4, true);
                                }
                                ixcVar.r = 0L;
                                ixcVar.a.g3.O(true);
                                return;
                            default:
                                uc7 messagesController5 = ixcVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.e5(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                                ixcVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            } else if (i4 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M02 = ob6.M0(2131752843, null);
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                if (this.n != 0) {
                    str = c00.k(new StringBuilder(" ("), hl.i0(this.n, false, false), ")");
                }
                idVar2.U = ob6.a0(null, null, 2131752842, str);
                alertDialog$Builder2.j(ob6.M0(2131752066, null), new fd(this) {
                    public final ixc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar22, int i5) {
                        byte b = r2;
                        ixc ixcVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(ixcVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        ixc.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        ixc.c0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                                j84 c = j84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                ixcVar.e0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        ixc.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                }
                                ixcVar.e0();
                                return;
                            case 2:
                                try {
                                    ptd.c.clear();
                                    ptd.d.clear();
                                    File file4 = new File(xb4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    cc4.g(e4, true);
                                }
                                ixcVar.r = 0L;
                                ixcVar.a.g3.O(true);
                                return;
                            default:
                                uc7 messagesController5 = ixcVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.e5(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                                ixcVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder2.c(-1);
                alertDialog$Builder2.o();
            } else if (i4 == 7) {
                ArrayList a = ptd.a(null);
                int size = a.size();
                long j = Long.MAX_VALUE;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = a.get(i5);
                    i5++;
                    j = Math.min(j, ((n01) obj).b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M03 = ob6.M0(2131752836, null);
                id idVar3 = alertDialog$Builder3.a;
                idVar3.S = M03;
                idVar3.U = ob6.a0(null, null, 2131752835, ob6.u(j / 1000, false));
                alertDialog$Builder3.j(ob6.M0(2131752066, null), new fd(this) {
                    public final ixc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar22, int i52) {
                        byte b = r2;
                        ixc ixcVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(ixcVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        ixc.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        ixc.c0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                                j84 c = j84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                ixcVar.e0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        ixc.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                }
                                ixcVar.e0();
                                return;
                            case 2:
                                try {
                                    ptd.c.clear();
                                    ptd.d.clear();
                                    File file4 = new File(xb4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    cc4.g(e4, true);
                                }
                                ixcVar.r = 0L;
                                ixcVar.a.g3.O(true);
                                return;
                            default:
                                uc7 messagesController5 = ixcVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.e5(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                                ixcVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder3.c(-1);
                alertDialog$Builder3.o();
            } else if (i4 == 9) {
                ng5[] ng5VarArr = {null};
                e ng5Var = new ng5(null, new ku9(this, ng5VarArr, (byte) 25));
                ng5VarArr[0] = ng5Var;
                presentFragment(ng5Var);
            } else if (i4 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M04 = ob6.M0(2131742568, null);
                id idVar4 = alertDialog$Builder4.a;
                idVar4.S = M04;
                idVar4.U = ob6.M0(2131742569, null);
                alertDialog$Builder4.j(ob6.M0(2131751563, null), new fd(this) {
                    public final ixc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void w(id idVar22, int i52) {
                        byte b = r2;
                        ixc ixcVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(ixcVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        ixc.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        ixc.c0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                                j84 c = j84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                ixcVar.e0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        ixc.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                }
                                ixcVar.e0();
                                return;
                            case 2:
                                try {
                                    ptd.c.clear();
                                    ptd.d.clear();
                                    File file4 = new File(xb4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    cc4.g(e4, true);
                                }
                                ixcVar.r = 0L;
                                ixcVar.a.g3.O(true);
                                return;
                            default:
                                uc7 messagesController5 = ixcVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.e5(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new ic((byte) 0), new f87(messagesController5, (byte) 4));
                                ixcVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
            } else if (b8cVar.H(gxc.class)) {
                hxc hxcVar = (hxc) view;
                String str2 = hxcVar.e;
                fu5 G = fu5.G((ViewGroup) this.fragmentView, null, hxcVar);
                G.s = (short) 40;
                G.b(2131231789, ob6.M0(2131746048, null), new zwc(this, str2, (byte) 2), false);
                G.a0();
            } else {
                int i6 = b8cVar.d;
                if (i6 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b = bw9.b();
                        int size2 = b.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i7 = 0; i7 < size2; i7++) {
                            charSequenceArr[i7] = ((bw9) b.get(i7)).a;
                            j29 j29Var = new j29(getParentActivity(), null);
                            j29Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                            j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                            CharSequence charSequence = charSequenceArr[i7];
                            if (i7 == xea.m0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j29Var.b(charSequence, z);
                            int i8 = aob.i6;
                            hf0 f0 = aob.f0(aob.w0(null, i8, false), 2, -1);
                            uob M = yob.M(i8);
                            j29Var.setBackground(f0);
                            yob.j(j29Var, f0, null, M, null);
                            linearLayout.addView(j29Var);
                            j29Var.setOnClickListener(new ae(i7, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String M05 = ob6.M0(2131745527, null);
                        id idVar5 = alertDialog$Builder5.a;
                        idVar5.S = M05;
                        alertDialog$Builder5.n(linearLayout);
                        alertDialog$Builder5.g(ob6.M0(2131752570, null), null);
                        atomicReference.set(idVar5);
                        showDialog(idVar5);
                    }
                } else if (i6 == 15 || i6 == 16) {
                    boolean S22 = getMessagesController().S2();
                    if (getMessagesController().R2(S22)) {
                        jj.r0(this, ob6.M0(2131742566, null), ob6.M0(2131742567, null), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    vnb resourceProvider = getResourceProvider();
                    sa saVar = new sa((byte) 11, this, S22);
                    Pattern pattern = jj.a;
                    Activity W = hl.W(parentActivity);
                    if (W != null) {
                        view2 = W.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    id[] idVarArr = new id[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, resourceProvider, parentActivity);
                    if (S22) {
                        i = 2131752849;
                    } else {
                        i = 2131752848;
                    }
                    String M06 = ob6.M0(i, null);
                    id idVar6 = alertDialog$Builder6.a;
                    idVar6.S = M06;
                    if (S22) {
                        i2 = 2131752851;
                    } else {
                        i2 = 2131752850;
                    }
                    idVar6.U = ob6.M0(i2, null);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i9 = aob.j5;
                    yob.X(editTextBoldCursor, i9, resourceProvider);
                    yob.D(editTextBoldCursor, aob.Oi, resourceProvider);
                    editTextBoldCursor.setHint(ob6.M0(2131752852, null));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(hl.L(16.0f), hl.L(13.0f), hl.L(16.0f), hl.L(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.A(aob.q6, resourceProvider);
                    ShapeDrawable b0 = aob.b0(hl.L(22.0f), aob.p1(0.06f, aob.v0(i9, resourceProvider)));
                    uob K = yob.K(0.06f, i9);
                    editTextBoldCursor.setBackground(b0);
                    yob.j(editTextBoldCursor, b0, K, null, resourceProvider);
                    o97 o97Var = new o97(editTextBoldCursor, saVar, idVarArr, view2, (byte) 7);
                    editTextBoldCursor.setOnEditorActionListener(new j(o97Var, (byte) 2));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, tre.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.b();
                    alertDialog$Builder6.n(linearLayout2);
                    idVar6.a = Math.min(hl.L(320.0f), (hl.q.x * 85) / 100);
                    alertDialog$Builder6.j(ob6.M0(2131751319, null), new m0(o97Var, (byte) 17));
                    alertDialog$Builder6.g(ob6.M0(2131752570, null), new bg((byte) 17));
                    idVarArr[0] = idVar6;
                    idVar6.k0 = false;
                    idVar6.setOnDismissListener(new o1(editTextBoldCursor, (byte) 4));
                    idVarArr[0].setOnShowListener(new df(editTextBoldCursor, (byte) 1));
                    idVarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232575).mutate();
        Drawable e = c00.e(context, 2131232576);
        int themedColor = getThemedColor(aob.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        e.setColorFilter(new PorterDuffColorFilter(getThemedColor(aob.k7), mode));
        d58 d58Var = new d58(mutate, e, (byte) 4);
        d58Var.y = hl.L(2.0f);
        this.e = d58Var;
        this.fragmentView = super.createView(context);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wa waVar;
        if (i == jn7.U5 && (waVar = this.a) != null) {
            waVar.g3.O(true);
        }
    }

    public final void e0() {
        l9c l9cVar;
        ArrayList a = ptd.a(new sh9(this, (byte) 29));
        if (a != null) {
            this.r = a.size();
            wa waVar = this.a;
            if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                l9cVar.O(true);
            }
        }
        Utilities.e.c(new olc(this, (byte) 19));
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
        e0();
        getNotificationCenter().b(this, jn7.U5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.U5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z;
        super.onThemeColorsChanged();
        try {
            d58 d58Var = this.e;
            if (d58Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int themedColor = getThemedColor(aob.N6);
                int themedColor2 = getThemedColor(aob.k7);
                if (themedColor != this.s || themedColor2 != this.w) {
                    this.s = themedColor;
                    this.w = themedColor2;
                    Drawable drawable = d58Var.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = d58Var.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    }
                    wa waVar = this.a;
                    if (waVar != null) {
                        waVar.i1();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
