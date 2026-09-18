package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dd0;
import org.telegram.ui.zc0;
import w7.a6;
import w7.y5;
public class t0 extends c implements LocationController.LocationFetchCallback {
    public final int K;
    public final Context L;
    public int M;
    public u6 N;
    public Location O;
    public Location P;
    public String Q;
    public String R;
    public Location S;
    public final int T;
    public final long U;
    public int V;
    public MessageObject W;
    public TLRPC.TL_channelLocation X;
    public ArrayList Y;
    public boolean Z;
    public final boolean f9929a0;
    public final e6 f9930b0;
    public boolean f9931c0;
    public TLRPC.TL_messageMediaVenue f9932d0;
    public TLRPC.TL_messageMediaVenue f9933e0;
    public boolean f9934f0;
    public final boolean f9935g0;
    public zc0 f9936h0;
    public boolean f9937i0;
    public boolean f9938j0;
    public boolean f9939k0;
    public FrameLayout f9940l0;

    public t0(Context context, int i10, long j3, boolean z10, e6 e6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = UserConfig.selectedAccount;
        this.V = -1;
        this.Y = new ArrayList();
        this.f9931c0 = true;
        this.f9938j0 = false;
        this.f9939k0 = false;
        this.f9935g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j3;
        this.f9929a0 = z10;
        this.f9930b0 = e6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.K).getSharingLocationInfo(this.U) == null && this.O == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10;
        int i11 = this.T;
        if (i11 == 8) {
            Location location = this.P;
            if (location != null || (location = this.O) != null) {
                this.Z = true;
                Q();
                LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            }
        } else if (i11 == 4) {
            Location location2 = this.P;
            if (location2 != null || (location2 = this.O) != null) {
                Location location3 = this.S;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.R = null;
                }
                this.Z = true;
                Q();
                LocationController.fetchLocationAddress(location2, this);
            }
        } else {
            Location location4 = this.P;
            if (location4 != null) {
                Location location5 = this.S;
                if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                    this.R = null;
                }
                this.Z = true;
                Q();
                if (this.d) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                LocationController.fetchLocationAddress(location4, i10, this);
            }
        }
    }

    public final Object J(int i10) {
        int i11 = this.T;
        int i12 = 4;
        if (i11 == 4) {
            if (this.R == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.R;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.P;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.P.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.O;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.O.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.W;
        ArrayList arrayList = this.f9681s;
        if (messageObject != null) {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.Y.get(i10 - 5);
            }
        } else {
            int i13 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i13 = 3;
                }
                if (i10 < i13) {
                    return null;
                }
                return this.Y.get(i10 - i13);
            } else if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                if (this.f9933e0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f9680r;
                if (i10 > i12) {
                    int i14 = i12 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i12;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.P = location;
        I();
        Q();
    }

    public final void M(Location location) {
        boolean z10;
        int i10;
        if (this.O == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = location;
        if (this.P == null) {
            I();
        }
        if (z10 && (i10 = this.V) > 0) {
            m(i10);
        }
        if (this.W != null) {
            n(1, new Object());
            if (!this.Y.isEmpty()) {
                r(2, this.Y.size(), new Object());
            }
        } else if (this.T != 2) {
            Q();
        } else if (!this.Y.isEmpty()) {
            r(2, this.Y.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Y = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((dd0) this.Y.get(i10)).f32940a == clientUserId || ((dd0) this.Y.get(i10)).f32941b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f9938j0 == z10 && this.f9939k0 == z11) {
            return;
        }
        this.f9938j0 = z10;
        this.f9939k0 = z11;
        if (z11) {
            this.f9932d0 = null;
            this.f9933e0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.f9940l0;
        if (frameLayout != null) {
            s4.p0 p0Var = (s4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new s4.p0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.M;
            }
            this.f9940l0.setLayoutParams(p0Var);
            this.f9940l0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        u6 u6Var = this.N;
        if (u6Var != null) {
            int i10 = this.T;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.Q)) {
                    string = this.Q;
                } else if (!TextUtils.isEmpty(this.R)) {
                    string = this.R;
                } else if (this.Z) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.N.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.N.setHasLocation(true);
                return;
            }
            String str = "";
            if (i10 != 4 && this.P == null) {
                if (this.O != null) {
                    u6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.O.getAccuracy(), new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f9938j0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                u6Var.b(string2, str);
                this.N.setHasLocation(!this.f9938j0);
                return;
            }
            if (!TextUtils.isEmpty(this.Q)) {
                str = this.Q;
            } else if (!TextUtils.isEmpty(this.R)) {
                str = this.R;
            } else {
                Location location = this.P;
                if ((location == null && this.O == null) || this.Z) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.P.getLongitude()));
                } else {
                    Location location2 = this.O;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.O.getLongitude()));
                    } else if (!this.f9938j0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f9934f0) {
                this.N.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.N.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.N.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.N.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.T;
        int i14 = 6;
        if (i13 != 6 && i13 != 5 && i13 != 4 && !this.e) {
            int i15 = 0;
            if (this.W != null) {
                if (this.Y.isEmpty()) {
                    if (!this.f9935g0) {
                        i15 = 1;
                    }
                } else {
                    i15 = this.Y.size() + 3;
                }
                i12 = 2 + i15;
            } else if (i13 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(this.U);
                int size = this.Y.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i15 = 1;
                }
                i12 = size + i15;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.f9929a0;
                if (!z10 && this.f9678f) {
                    ArrayList arrayList = this.f9681s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f9680r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f9933e0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f9938j0;
                if (!z12 && (this.h || !this.f9678f)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                int i16 = i11 + (z11 ? 1 : 0);
                if (!z12) {
                    i12 = 0;
                }
                i12 = (i16 - i12) + i14;
            }
        }
        if (this.f9936h0 != null && this.f9937i0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: gg.t0.j(int):int");
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.Z = false;
        this.S = location;
        int i10 = this.T;
        if (i10 == 8) {
            this.R = str2;
        } else {
            this.R = str;
        }
        if (i10 == 7 && this.f9939k0) {
            this.f9932d0 = null;
            this.f9933e0 = null;
        }
        if (this.f9933e0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.f9932d0 = tL_messageMediaVenue;
            this.f9933e0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f9933e0 == null) {
                    u(2);
                    return;
                } else {
                    o(2);
                    return;
                }
            }
            q(1, 2);
            return;
        }
        Q();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        long j3;
        int i12;
        int i13 = c1Var.f42932f;
        View view = c1Var.f42929a;
        int i14 = this.T;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                s4.p0 p0Var = (s4.p0) view.getLayoutParams();
                if (p0Var == null) {
                    p0Var = new s4.p0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) p0Var).height = this.M;
                }
                view.setLayoutParams(p0Var);
                return;
            case 1:
                this.N = (u6) view;
                Q();
                return;
            case 2:
                m4 m4Var = (m4) view;
                if (this.W != null) {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f9933e0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f9678f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f9680r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        u4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f9681s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                u4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((w4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                u6 u6Var = (u6) view;
                if (this.O != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z11 = true;
                }
                u6Var.f21617s = z11;
                u6Var.invalidate();
                return;
            case 7:
                u6 u6Var2 = (u6) view;
                if (this.O != null) {
                    z11 = true;
                }
                u6Var2.setHasLocation(z11);
                return;
            case 8:
                w7 w7Var = (w7) view;
                if (i14 == 6) {
                    w7Var.b(this.W, this.O, this.f9938j0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.X;
                long j10 = this.U;
                if (tL_channelLocation != null) {
                    TextView textView = w7Var.d;
                    Location location = w7Var.v;
                    w9 w9Var = w7Var.f21767a;
                    w7Var.f21775x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    w7Var.f21770f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(w7Var.f21775x).getUser(Long.valueOf(j10));
                        if (user != null) {
                            w7Var.f21770f = new h9(0, user);
                            str2 = UserObject.getUserName(user);
                            w9Var.e(user, w7Var.f21770f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(w7Var.f21775x).getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            h9 h9Var = new h9(chat);
                            w7Var.f21770f = h9Var;
                            str2 = chat.title;
                            w9Var.e(chat, h9Var);
                        }
                    }
                    w7Var.f21768b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    w7Var.e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.W;
                if (messageObject != null && i10 == 1) {
                    w7Var.b(messageObject, this.O, this.f9938j0);
                    return;
                }
                if (messageObject != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(j10);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.Y.size()) {
                    dd0 dd0Var = (dd0) this.Y.get(i18);
                    Location location2 = this.O;
                    TextView textView2 = w7Var.d;
                    w9 w9Var2 = w7Var.f21767a;
                    j5 j5Var = w7Var.f21768b;
                    Location location3 = w7Var.v;
                    w7Var.f21773s = dd0Var;
                    if (DialogObject.isUserDialog(dd0Var.f32940a)) {
                        TLRPC.User user2 = MessagesController.getInstance(w7Var.f21775x).getUser(Long.valueOf(dd0Var.f32940a));
                        if (user2 != null) {
                            w7Var.f21770f.m(w7Var.f21775x, user2);
                            j5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            w9Var2.e(user2, w7Var.f21770f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(w7Var.f21775x).getChat(Long.valueOf(-dd0Var.f32940a));
                        if (chat2 != null) {
                            w7Var.f21770f.k(w7Var.f21775x, chat2);
                            j5Var.l(chat2.title, false);
                            w9Var2.e(chat2, w7Var.f21770f);
                        }
                    }
                    IMapsProvider.LatLng position = dd0Var.e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = dd0Var.f32941b;
                    int i19 = message.edit_date;
                    if (i19 != 0) {
                        j3 = i19;
                    } else {
                        j3 = message.date;
                    }
                    String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(j3);
                    if (location2 != null) {
                        textView2.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                        return;
                    }
                    textView2.setText(formatLocationUpdateDate);
                    return;
                }
                return;
            case 11:
                if (this.f9938j0) {
                    i12 = j6.f19151i5;
                } else {
                    i12 = j6.f19133h5;
                }
                view.setBackgroundColor(j6.v0(i12, this.f9930b0));
                return;
            case 12:
                u4 u4Var2 = (u4) view;
                if (this.f9939k0) {
                    u4Var2.b(null, 2, (i10 != 1 || this.f9933e0 == null) ? false : false, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f9932d0;
                    if (this.f9933e0 != null) {
                        z11 = true;
                    }
                    u4Var2.b(tL_messageMediaVenue2, 2, z11, this.f9931c0);
                    return;
                } else {
                    u4Var2.b(this.f9933e0, 2, false, this.f9931c0);
                    return;
                }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j3 = this.U;
        e6 e6Var = this.f9930b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f9940l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f9940l0.setLayoutParams(new s4.p0(-1, this.M));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new u6(context, e6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, e6Var);
                break;
            case 3:
                view2 = new u4(context, e6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
                frameLayout2.f21760a = radialProgressView;
                frameLayout2.addView(radialProgressView, y5.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f21762c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.W5, e6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f21761b = textView;
                textView.setTextColor(j6.v0(j6.X5, e6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, y5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, y5.e(-2, -2, 17));
                TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
                int i12 = j6.A6;
                g10.setTextColor(j6.v0(i12, e6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, y5.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i12, e6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, y5.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(j6.v0(i12, e6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, y5.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                u6 u6Var = new u6(context, e6Var, true, false);
                u6Var.setDialogId(j3);
                view2 = u6Var;
                break;
            case 7:
                u6 u6Var2 = new u6(context, e6Var, true, true);
                u6Var2.setDialogId(j3);
                view2 = u6Var2;
                break;
            case 8:
                int i13 = this.T;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new w7(i11, context, e6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f21647a = frameLayout5;
                frameLayout5.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, j6.v0(j6.Oh, e6Var)));
                frameLayout4.addView(frameLayout5, y5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                j5 j5Var = new j5(context);
                j5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                j5Var.setGravity(17);
                j5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                j5Var.setTextColor(j6.v0(j6.Sh, e6Var));
                j5Var.setTextSize(14);
                j5Var.l(LocaleController.getString(R.string.Directions), false);
                j5Var.setLeftDrawable(R.drawable.filled_directions);
                j5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(j5Var, y5.c(-1.0f, -1));
                frameLayout5.setOutlineProvider(yf.k0.f47098b);
                frameLayout5.setClipToOutline(true);
                a6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new ai.v0(this, 22));
                view2 = frameLayout4;
                break;
            case 10:
                View b7Var = new b7(context, (org.telegram.ui.Cells.c1) null);
                new pq(new ColorDrawable(j6.v0(j6.f19006a7, e6Var)), j6.V0(context, R.drawable.greydivider_bottom, j6.f19026b7)).f27303w = true;
                view2 = b7Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, e6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.f9936h0;
                break;
        }
        return new s4.c1(view2);
    }

    public void K() {
    }
}
