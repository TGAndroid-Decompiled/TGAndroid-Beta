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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uuc extends n7c implements jm7 {
    public o38 e;
    public final xt f;
    public long h;
    public long n;
    public long r;
    public int s;
    public int w;

    public uuc(xt xtVar) {
        this.f = xtVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
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

    public static long e0(File file, Boolean bool) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += e0(file2, bool);
                }
                return j;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean O2 = getMessagesController().O2();
        arrayList.size();
        String M0 = jb6.M0(2131752810, null);
        c6c c6cVar = new c6c(9);
        c6cVar.d = 1;
        c6cVar.m = M0;
        c6cVar.L(O2);
        arrayList.add(c6cVar);
        arrayList.add(c6c.C(jb6.M0(2131752809, null)));
        int i = 0;
        if (!O2) {
            getMessagesController().Q2();
            c6c i2 = c6c.i(17, jb6.M0(2131742597, null));
            i2.L(getMessagesController().Q2());
            arrayList.add(i2);
            arrayList.add(c6c.C(jb6.M0(2131742596, null)));
            arrayList.add(c6c.u(jb6.M0(2131752818, null)));
            arrayList.size();
            o38 o38Var = this.e;
            String M02 = jb6.M0(2131752802, null);
            c6c c6cVar2 = new c6c(3);
            c6cVar2.d = 16;
            c6cVar2.H = o38Var;
            c6cVar2.m = M02;
            c6cVar2.r = true;
            arrayList.add(c6cVar2);
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
                int i3 = suc.b;
                c6c K = c6c.K(suc.class);
                K.m = str2;
                K.o = str3;
                K.C = j;
                arrayList.add(K);
            }
            arrayList.add(c6c.C(jb6.M0(2131752819, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                c6c e = c6c.e(5, jb6.M0(2131752801, null));
                e.s = true;
                arrayList.add(e);
                arrayList.add(c6c.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = jb6.M0(2131752815, null);
        long j2 = this.n;
        String str4 = "";
        if (j2 <= 0) {
            str = "";
        } else {
            str = gm.i0(j2, false, false);
        }
        arrayList.add(c6c.d(3, 2131231781, M03, str));
        arrayList.size();
        String M04 = jb6.M0(2131752817, null);
        long j3 = this.h;
        if (j3 > 0) {
            str4 = gm.i0(j3, false, false);
        }
        arrayList.add(c6c.d(2, 2131231780, M04, str4));
        arrayList.add(c6c.C(jb6.M0(2131752813, null)));
        if (this.r > 0) {
            arrayList.size();
            arrayList.add(c6c.c(9, 2131231782, jb6.M0(2131752803, null)));
            arrayList.size();
            arrayList.add(c6c.d(7, 2131231780, jb6.M0(2131752808, null), jb6.H(',', "BrowserSettingsHistoryPages", (int) this.r)));
            arrayList.add(c6c.C(null));
        }
        arrayList.add(c6c.u(jb6.M0(2131752799, null)));
        arrayList.size();
        o38 o38Var2 = this.e;
        String M05 = jb6.M0(2131752802, null);
        c6c c6cVar3 = new c6c(3);
        c6cVar3.d = 15;
        c6cVar3.H = o38Var2;
        c6cVar3.m = M05;
        c6cVar3.r = true;
        arrayList.add(c6cVar3);
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
            int i5 = suc.b;
            c6c K2 = c6c.K(suc.class);
            K2.m = str5;
            K2.o = str6;
            K2.C = j4;
            arrayList.add(K2);
        }
        arrayList.add(c6c.C(jb6.M0(2131752800, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            c6c e2 = c6c.e(5, jb6.M0(2131752801, null));
            e2.s = true;
            arrayList.add(e2);
            arrayList.add(c6c.C(null));
        }
        arrayList.size();
        arrayList.add(c6c.d(6, 2131232360, jb6.M0(2131745533, null), ku9.a().a));
        arrayList.add(c6c.C(jb6.M0(2131752795, null)));
        boolean z = e21.a;
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131752794, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        View view2;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4 = c6cVar.d;
        if (i4 == 12) {
            gda.I();
            ((bjb) view).setChecked(gda.s0);
        } else if (i4 == 13) {
            gda.t0 = !gda.t0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("onlyLocalInstantView", gda.t0);
            edit.apply();
            ((bjb) view).setChecked(gda.t0);
        } else if (i4 == 17) {
            boolean z2 = !getMessagesController().Q2();
            oc7 messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.o5;
            if (tL_webBrowserSettings != null) {
                messagesController.C5(tL_webBrowserSettings.open_external_browser, z2);
            }
            ((bjb) view).setChecked(z2);
            this.a.g3.O(true);
        } else if (i4 == 1) {
            oc7 messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.o5;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.C5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean O2 = getMessagesController().O2();
            bjb bjbVar = (bjb) view;
            bjbVar.setChecked(O2);
            if (O2) {
                i3 = cmb.e6;
            } else {
                i3 = cmb.d6;
            }
            bjbVar.b(cmb.w0(null, i3, false), O2);
            this.a.g3.O(true);
        } else if (i4 == 10) {
            oc7 messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.o5;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.C5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.a.g3.O(true);
        } else if (i4 == 11) {
            oc7 messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.o5;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.C5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.a.g3.O(true);
        } else {
            String str = "";
            if (i4 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M0 = jb6.M0(2131752817, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (this.h != 0) {
                    str = b10.j(new StringBuilder(" ("), gm.i0(this.h, false, false), ")");
                }
                heVar.U = jb6.a0(null, null, 2131752816, str);
                alertDialog$Builder.j(jb6.M0(2131752038, null), new ee(this) {
                    public final uuc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar2, int i5) {
                        byte b = r2;
                        uuc uucVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(uucVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        uuc.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        uuc.d0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                                x84 c = x84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                uucVar.f0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        uuc.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    fc4.g(e3, true);
                                }
                                uucVar.f0();
                                return;
                            case 2:
                                try {
                                    crd.c.clear();
                                    crd.d.clear();
                                    File file4 = new File(bc4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    fc4.g(e4, true);
                                }
                                uucVar.r = 0L;
                                uucVar.a.g3.O(true);
                                return;
                            default:
                                oc7 messagesController5 = uucVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.Y4(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                                uucVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            } else if (i4 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M02 = jb6.M0(2131752815, null);
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                if (this.n != 0) {
                    str = b10.j(new StringBuilder(" ("), gm.i0(this.n, false, false), ")");
                }
                heVar2.U = jb6.a0(null, null, 2131752814, str);
                alertDialog$Builder2.j(jb6.M0(2131752038, null), new ee(this) {
                    public final uuc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar22, int i5) {
                        byte b = r2;
                        uuc uucVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(uucVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        uuc.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        uuc.d0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                                x84 c = x84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                uucVar.f0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        uuc.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    fc4.g(e3, true);
                                }
                                uucVar.f0();
                                return;
                            case 2:
                                try {
                                    crd.c.clear();
                                    crd.d.clear();
                                    File file4 = new File(bc4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    fc4.g(e4, true);
                                }
                                uucVar.r = 0L;
                                uucVar.a.g3.O(true);
                                return;
                            default:
                                oc7 messagesController5 = uucVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.Y4(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                                uucVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder2.c(-1);
                alertDialog$Builder2.o();
            } else if (i4 == 7) {
                ArrayList a = crd.a(null);
                int size = a.size();
                long j = Long.MAX_VALUE;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = a.get(i5);
                    i5++;
                    j = Math.min(j, ((m11) obj).b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M03 = jb6.M0(2131752808, null);
                he heVar3 = alertDialog$Builder3.a;
                heVar3.S = M03;
                heVar3.U = jb6.a0(null, null, 2131752807, jb6.u(j / 1000, false));
                alertDialog$Builder3.j(jb6.M0(2131752038, null), new ee(this) {
                    public final uuc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar22, int i52) {
                        byte b = r2;
                        uuc uucVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(uucVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        uuc.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        uuc.d0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                                x84 c = x84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                uucVar.f0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        uuc.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    fc4.g(e3, true);
                                }
                                uucVar.f0();
                                return;
                            case 2:
                                try {
                                    crd.c.clear();
                                    crd.d.clear();
                                    File file4 = new File(bc4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    fc4.g(e4, true);
                                }
                                uucVar.r = 0L;
                                uucVar.a.g3.O(true);
                                return;
                            default:
                                oc7 messagesController5 = uucVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.Y4(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                                uucVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder3.c(-1);
                alertDialog$Builder3.o();
            } else if (i4 == 9) {
                lg5[] lg5VarArr = {null};
                d lg5Var = new lg5(null, new ts9(this, lg5VarArr, (byte) 26));
                lg5VarArr[0] = lg5Var;
                presentFragment(lg5Var);
            } else if (i4 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
                String M04 = jb6.M0(2131742600, null);
                he heVar4 = alertDialog$Builder4.a;
                heVar4.S = M04;
                heVar4.U = jb6.M0(2131742601, null);
                alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee(this) {
                    public final uuc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void r(he heVar22, int i52) {
                        byte b = r2;
                        uuc uucVar = this.b;
                        switch (b) {
                            case 0:
                                a.b.deleteDatabase("webview.db");
                                a.b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(uucVar.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        uuc.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                try {
                                    File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        uuc.d0(file2, null);
                                    }
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                                x84 c = x84.c();
                                HashMap hashMap = (HashMap) c.d;
                                if (hashMap == null) {
                                    c.b = false;
                                    c.a = true;
                                    c.d = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                c.e();
                                uucVar.f0();
                                return;
                            case 1:
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        uuc.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e3) {
                                    fc4.g(e3, true);
                                }
                                uucVar.f0();
                                return;
                            case 2:
                                try {
                                    crd.c.clear();
                                    crd.d.clear();
                                    File file4 = new File(bc4.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e4) {
                                    fc4.g(e4, true);
                                }
                                uucVar.r = 0L;
                                uucVar.a.g3.O(true);
                                return;
                            default:
                                oc7 messagesController5 = uucVar.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.o5;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.o5.inapp_exceptions.clear();
                                    messagesController5.Y4(messagesController5.o5);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new kc((byte) 0), new k87(messagesController5, (byte) 6));
                                uucVar.a.g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
            } else if (c6cVar.H(suc.class)) {
                tuc tucVar = (tuc) view;
                String str2 = tucVar.e;
                bu5 G = bu5.G((ViewGroup) this.fragmentView, null, tucVar);
                G.s = (short) 40;
                G.b(2131231790, jb6.M0(2131746054, null), new ptc(this, str2, (byte) 4), false);
                G.a0();
            } else {
                int i6 = c6cVar.d;
                if (i6 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b = ku9.b();
                        int size2 = b.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i7 = 0; i7 < size2; i7++) {
                            charSequenceArr[i7] = ((ku9) b.get(i7)).a;
                            x09 x09Var = new x09(getParentActivity(), null);
                            x09Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                            x09Var.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                            CharSequence charSequence = charSequenceArr[i7];
                            if (i7 == gda.m0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            x09Var.b(charSequence, z);
                            int i8 = cmb.h6;
                            fg0 f0 = cmb.f0(cmb.w0(null, i8, false), 2, -1);
                            wmb M = anb.M(i8);
                            x09Var.setBackground(f0);
                            anb.j(x09Var, f0, null, M, null);
                            linearLayout.addView(x09Var);
                            x09Var.setOnClickListener(new wh(i7, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String M05 = jb6.M0(2131745533, null);
                        he heVar5 = alertDialog$Builder5.a;
                        heVar5.S = M05;
                        alertDialog$Builder5.n(linearLayout);
                        alertDialog$Builder5.g(jb6.M0(2131752542, null), null);
                        atomicReference.set(heVar5);
                        showDialog(heVar5);
                    }
                } else if (i6 == 15 || i6 == 16) {
                    boolean O22 = getMessagesController().O2();
                    if (getMessagesController().N2(O22)) {
                        ik.r0(this, jb6.M0(2131742598, null), jb6.M0(2131742599, null), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    ylb resourceProvider = getResourceProvider();
                    ra raVar = new ra((byte) 11, this, O22);
                    Pattern pattern = ik.a;
                    Activity W = gm.W(parentActivity);
                    if (W != null) {
                        view2 = W.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    he[] heVarArr = new he[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, resourceProvider, parentActivity);
                    if (O22) {
                        i = 2131752821;
                    } else {
                        i = 2131752820;
                    }
                    String M06 = jb6.M0(i, null);
                    he heVar6 = alertDialog$Builder6.a;
                    heVar6.S = M06;
                    if (O22) {
                        i2 = 2131752823;
                    } else {
                        i2 = 2131752822;
                    }
                    heVar6.U = jb6.M0(i2, null);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i9 = cmb.i5;
                    anb.X(editTextBoldCursor, i9, resourceProvider);
                    anb.D(editTextBoldCursor, cmb.Ni, resourceProvider);
                    editTextBoldCursor.setHint(jb6.M0(2131752824, null));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(gm.L(16.0f), gm.L(13.0f), gm.L(16.0f), gm.L(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.A(cmb.p6, resourceProvider);
                    ShapeDrawable b0 = cmb.b0(gm.L(22.0f), cmb.p1(0.06f, cmb.v0(i9, resourceProvider)));
                    wmb K = anb.K(0.06f, i9);
                    editTextBoldCursor.setBackground(b0);
                    anb.j(editTextBoldCursor, b0, K, null, resourceProvider);
                    l97 l97Var = new l97(editTextBoldCursor, raVar, heVarArr, view2, (byte) 6);
                    editTextBoldCursor.setOnEditorActionListener(new j(l97Var, (byte) 3));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, qoe.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.b();
                    alertDialog$Builder6.n(linearLayout2);
                    heVar6.a = Math.min(gm.L(320.0f), (gm.q.x * 85) / 100);
                    alertDialog$Builder6.j(jb6.M0(2131751291, null), new l0(l97Var, (byte) 11));
                    alertDialog$Builder6.g(jb6.M0(2131752542, null), new c((byte) 16));
                    heVarArr[0] = heVar6;
                    heVar6.k0 = false;
                    heVar6.setOnDismissListener(new n1(editTextBoldCursor, (byte) 3));
                    heVarArr[0].setOnShowListener(new bf(editTextBoldCursor, (byte) 0));
                    heVarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232576).mutate();
        Drawable d = b10.d(context, 2131232577);
        int themedColor = getThemedColor(cmb.M6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        d.setColorFilter(new PorterDuffColorFilter(getThemedColor(cmb.j7), mode));
        o38 o38Var = new o38(mutate, d, (byte) 4);
        o38Var.y = gm.L(2.0f);
        this.e = o38Var;
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i == nm7.V5 && (vaVar = this.a) != null) {
            vaVar.g3.O(true);
        }
    }

    public final void f0() {
        l7c l7cVar;
        ArrayList a = crd.a(new eg9(this, (byte) 29));
        if (a != null) {
            this.r = a.size();
            va vaVar = this.a;
            if (vaVar != null && (l7cVar = vaVar.g3) != null && vaVar.H) {
                l7cVar.O(true);
            }
        }
        Utilities.e.c(new cpc(this, (byte) 10));
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
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().b(this, nm7.V5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.V5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z;
        super.onThemeColorsChanged();
        try {
            o38 o38Var = this.e;
            if (o38Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int themedColor = getThemedColor(cmb.M6);
                int themedColor2 = getThemedColor(cmb.j7);
                if (themedColor != this.s || themedColor2 != this.w) {
                    this.s = themedColor;
                    this.w = themedColor2;
                    Drawable drawable = o38Var.a;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable2 = o38Var.b;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    }
                    va vaVar = this.a;
                    if (vaVar != null) {
                        vaVar.h1();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
