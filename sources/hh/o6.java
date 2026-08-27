package hh;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import lh.kc;
import lh.nc;
import lh.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.op0;

public final class o6 implements Utilities.Callback {

    public final int f9837a;

    public final boolean f9838b;

    public final Object f9839c;

    public o6(int i10, Object obj, boolean z10) {
        this.f9837a = i10;
        this.f9839c = obj;
        this.f9838b = z10;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr;
        Context context;
        int i10 = 8;
        lh.k7 k7Var = null;
        int i11 = 0;
        switch (this.f9837a) {
            case 0:
                u7 u7Var = (u7) this.f9839c;
                HashSet hashSet = (HashSet) obj;
                if (this.f9838b) {
                    SendMessagesHelper.getInstance(u7Var.f10151a).cancelSendingMessage(new ArrayList<>(hashSet));
                } else {
                    u7Var.getClass();
                }
                break;
            case 1:
                jh.e4 e4Var = (jh.e4) this.f9839c;
                boolean z10 = this.f9838b;
                jh.j3 j3Var = e4Var.Y0;
                org.telegram.ui.ActionBar.c6 c6Var = e4Var.f13290x0;
                new mc(j3Var, c6Var).o(z10 ? lc.h : lc.f30339e, c6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f9839c;
                boolean z11 = this.f9838b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activityFindActivity = LaunchActivity.C1;
                    if (activityFindActivity == null) {
                        activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activityFindActivity == null || activityFindActivity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2 b2Var = z11 ? new org.telegram.ui.ActionBar.b2(activityFindActivity, 3, new jh.b()) : null;
                        if (z11) {
                            b2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kc kcVar = new kc(z11, b2Var, callback, i11);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (qc.f16608b == null || !TextUtils.equals(qc.f16607a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            lh.mc mcVar = new lh.mc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, kcVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new cg.e0(iArr2, messagesController, userArr, mcVar, kcVar, 3));
                            } else {
                                iArr = iArr2;
                                mcVar.run();
                            }
                            k7Var = new lh.k7(i10, iArr, connectionsManager);
                        } else {
                            kcVar.run(qc.f16608b);
                        }
                        if (z11 && k7Var != null) {
                            b2Var.setOnCancelListener(new lh.lc(k7Var, i11));
                            break;
                        }
                    }
                }
                break;
            case 3:
                o6 o6Var = (o6) this.f9839c;
                boolean z12 = this.f9838b;
                if (((Boolean) obj).booleanValue()) {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location lastKnownLocation = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                        if (lastKnownLocation != null) {
                            if (lastKnownLocation == null && z12) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    try {
                                        final Utilities.Callback[] callbackArr = {o6Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() {
                                            @Override
                                            public final void onLocationChanged(Location location2) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                Utilities.Callback[] callbackArr2 = callbackArr;
                                                Utilities.Callback callback2 = callbackArr2[0];
                                                if (callback2 != null) {
                                                    callback2.run(location2);
                                                    callbackArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        o6Var.run(null);
                                        return;
                                    }
                                } else {
                                    context = LaunchActivity.C1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new nc(context, i11));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                }
                            }
                            o6Var.run(lastKnownLocation);
                        }
                        break;
                    }
                    if (lastKnownLocation == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                            context = LaunchActivity.C1;
                            if (context == null) {
                                context = ApplicationLoader.applicationContext;
                            }
                            if (context != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                                alertDialog$Builder2.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Enable), new nc(context, i11));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.o();
                            }
                        } else {
                            final Utilities.Callback[] callbackArr2 = {o6Var};
                            final LocationListener[] locationListenerArr2 = {null};
                            LocationListener locationListener2 = new LocationListener() {
                                @Override
                                public final void onLocationChanged(Location location2) {
                                    LocationListener[] locationListenerArr3 = locationListenerArr2;
                                    LocationListener locationListener3 = locationListenerArr3[0];
                                    if (locationListener3 != null) {
                                        locationManager.removeUpdates(locationListener3);
                                        locationListenerArr3[0] = null;
                                    }
                                    Utilities.Callback[] callbackArr3 = callbackArr2;
                                    Utilities.Callback callback2 = callbackArr3[0];
                                    if (callback2 != null) {
                                        callback2.run(location2);
                                        callbackArr3[0] = null;
                                    }
                                }
                            };
                            locationListenerArr2[0] = locationListener2;
                            locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener2);
                        }
                    }
                    o6Var.run(lastKnownLocation);
                } else {
                    o6Var.run(null);
                }
                break;
            case 4:
                dz0 dz0Var = (dz0) this.f9839c;
                boolean z13 = this.f9838b;
                ProfileActivity profileActivity = dz0Var.f37574b;
                if (profileActivity.getParentActivity() != null) {
                    mc.a0(profileActivity).o(z13 ? lc.h : lc.f30339e, null).j();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new op0((org.telegram.ui.web.l) this.f9839c, (String) obj, this.f9838b, i10));
                break;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f9839c;
                v1Var.getMessagesController().addWebBrowserException((String) obj, this.f9838b);
                v1Var.f28261a.U2.N(true);
                break;
        }
    }
}
