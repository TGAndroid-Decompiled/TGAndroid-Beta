package of;

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
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import java.util.Locale;
import kh.x8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.fc0;
import org.telegram.ui.jc0;
public class p0 extends c implements LocationController.LocationFetchCallback {
    public final int G;
    public final Context H;
    public int I;
    public s6 J;
    public Location K;
    public Location L;
    public String M;
    public String N;
    public Location O;
    public final int P;
    public final long Q;
    public int R;
    public MessageObject S;
    public TLRPC.TL_channelLocation T;
    public ArrayList U;
    public boolean V;
    public final boolean W;
    public final b6 X;
    public boolean Y;
    public TLRPC.TL_messageMediaVenue Z;
    public TLRPC.TL_messageMediaVenue f19450a0;
    public boolean f19451b0;
    public final boolean f19452c0;
    public fc0 f19453d0;
    public boolean f19454e0;
    public boolean f19455f0;
    public boolean f19456g0;
    public FrameLayout f19457h0;

    public p0(Context context, int i9, long j10, boolean z10, b6 b6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.G = UserConfig.selectedAccount;
        this.R = -1;
        this.U = new ArrayList();
        this.Y = true;
        this.f19455f0 = false;
        this.f19456g0 = false;
        this.f19452c0 = z12;
        this.H = context;
        this.P = i9;
        this.Q = j10;
        this.W = z10;
        this.X = b6Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 6) {
            if (LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) == null && this.K == null) {
                return false;
            }
        } else if (i9 != 1 && i9 != 3 && i9 != 8 && i9 != 12 && i9 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i9;
        int i10 = this.P;
        if (i10 == 8) {
            Location location = this.L;
            if (location != null || (location = this.K) != null) {
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location, this.f19253e ? 1 : 0, this);
            }
        } else if (i10 == 4) {
            Location location2 = this.L;
            if (location2 != null || (location2 = this.K) != null) {
                Location location3 = this.O;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location2, this);
            }
        } else {
            Location location4 = this.L;
            if (location4 != null) {
                Location location5 = this.O;
                if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                if (this.d) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                LocationController.fetchLocationAddress(location4, i9, this);
            }
        }
    }

    public final Object J(int i9) {
        int i10 = this.P;
        int i11 = 4;
        if (i10 == 4) {
            if (this.N == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.N;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.L;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.K;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.K.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.S;
        ArrayList arrayList = this.f19257s;
        if (messageObject != null) {
            if (i9 == 1) {
                return messageObject;
            }
            if (i9 > 4 && i9 < arrayList.size() + 4) {
                return this.U.get(i9 - 5);
            }
        } else {
            int i12 = 2;
            if (i10 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i9 < i12) {
                    return null;
                }
                return this.U.get(i9 - i12);
            } else if (i10 == 1) {
                if (i9 > 4 && i9 < arrayList.size() + 5) {
                    return arrayList.get(i9 - 5);
                }
            } else if (i10 == 7) {
                if (this.f19450a0 == null) {
                    i11 = 3;
                }
                ArrayList arrayList2 = this.f19256r;
                if (i9 > i11) {
                    int i13 = i11 + 1;
                    if (i9 < arrayList2.size() + i13) {
                        return arrayList2.get(i9 - i13);
                    }
                }
                int size = arrayList2.size() + i11;
                if (i9 > size) {
                    int i14 = size + 1;
                    if (i9 < arrayList.size() + i14) {
                        return arrayList.get(i9 - i14);
                    }
                }
            } else if (i9 > 3 && i9 < arrayList.size() + 4) {
                return arrayList.get(i9 - 4);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.L = location;
        I();
        Q();
    }

    public final void M(Location location) {
        boolean z10;
        int i9;
        if (this.K == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = location;
        if (this.L == null) {
            I();
        }
        if (z10 && (i9 = this.R) > 0) {
            m(i9);
        }
        if (this.S != null) {
            n(1, new Object());
            if (!this.U.isEmpty()) {
                r(2, this.U.size(), new Object());
            }
        } else if (this.P != 2) {
            Q();
        } else if (!this.U.isEmpty()) {
            r(2, this.U.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.U = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.G).getClientUserId();
        for (int i9 = 0; i9 < this.U.size(); i9++) {
            if (((jc0) this.U.get(i9)).f39436a == clientUserId || ((jc0) this.U.get(i9)).f39437b.out) {
                this.U.remove(i9);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f19455f0 == z10 && this.f19456g0 == z11) {
            return;
        }
        this.f19455f0 = z10;
        this.f19456g0 = z11;
        if (z11) {
            this.Z = null;
            this.f19450a0 = null;
        }
        l();
    }

    public final void P(int i9) {
        this.I = i9;
        FrameLayout frameLayout = this.f19457h0;
        if (frameLayout != null) {
            f2.a1 a1Var = (f2.a1) frameLayout.getLayoutParams();
            if (a1Var == null) {
                a1Var = new f2.a1(-1, this.I);
            } else {
                ((ViewGroup.MarginLayoutParams) a1Var).height = this.I;
            }
            this.f19457h0.setLayoutParams(a1Var);
            this.f19457h0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        s6 s6Var = this.J;
        if (s6Var != null) {
            int i9 = this.P;
            if (i9 == 8) {
                if (!TextUtils.isEmpty(this.M)) {
                    string = this.M;
                } else if (!TextUtils.isEmpty(this.N)) {
                    string = this.N;
                } else if (this.V) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.J.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.J.setHasLocation(true);
                return;
            }
            String str = "";
            if (i9 != 4 && this.L == null) {
                if (this.K != null) {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.K.getAccuracy(), new Object[0])));
                    this.J.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f19455f0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                s6Var.b(string2, str);
                this.J.setHasLocation(!this.f19455f0);
                return;
            }
            if (!TextUtils.isEmpty(this.M)) {
                str = this.M;
            } else if (!TextUtils.isEmpty(this.N)) {
                str = this.N;
            } else {
                Location location = this.L;
                if ((location == null && this.K == null) || this.V) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.L.getLongitude()));
                } else {
                    Location location2 = this.K;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.K.getLongitude()));
                    } else if (!this.f19455f0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f19451b0) {
                this.J.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i9 == 4) {
                this.J.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.J.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.J.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i9;
        int i10;
        int i11 = 2;
        int i12 = this.P;
        int i13 = 6;
        if (i12 != 6 && i12 != 5 && i12 != 4 && !this.f19253e) {
            int i14 = 0;
            if (this.S != null) {
                if (this.U.isEmpty()) {
                    if (!this.f19452c0) {
                        i14 = 1;
                    }
                } else {
                    i14 = this.U.size() + 3;
                }
                i11 = 2 + i14;
            } else if (i12 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                int size = this.U.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i14 = 1;
                }
                i11 = size + i14;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.W;
                if (!z10 && this.f19254f) {
                    ArrayList arrayList = this.f19257s;
                    if (!arrayList.isEmpty()) {
                        if (i12 != 1) {
                            i13 = 5;
                        }
                        i11 = arrayList.size() + this.f19256r.size() + (z11 ? 1 : 0) + i13;
                    }
                }
                if (i12 == 0) {
                    i13 = 5;
                } else if (i12 == 7) {
                    if (this.f19450a0 != null) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    i13 = i9 + 5;
                }
                boolean z12 = this.f19455f0;
                if (!z12 && (this.h || !this.f19254f)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i15 = i10 + (z11 ? 1 : 0);
                if (!z12) {
                    i11 = 0;
                }
                i11 = (i15 - i11) + i13;
            }
        }
        if (this.f19453d0 != null && this.f19454e0) {
            return i11 + 1;
        }
        return i11;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: of.p0.j(int):int");
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.O = location;
        int i9 = this.P;
        if (i9 == 8) {
            this.N = str2;
        } else {
            this.N = str;
        }
        if (i9 == 7 && this.f19456g0) {
            this.Z = null;
            this.f19450a0 = null;
        }
        if (this.f19450a0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 == 7) {
            this.Z = tL_messageMediaVenue;
            this.f19450a0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f19450a0 == null) {
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        long j10;
        int i11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i13 = this.P;
        int i14 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i12) {
            case 0:
                f2.a1 a1Var = (f2.a1) view.getLayoutParams();
                if (a1Var == null) {
                    a1Var = new f2.a1(-1, this.I);
                } else {
                    ((ViewGroup.MarginLayoutParams) a1Var).height = this.I;
                }
                view.setLayoutParams(a1Var);
                return;
            case 1:
                this.J = (s6) view;
                Q();
                return;
            case 2:
                m4 m4Var = (m4) view;
                if (this.S != null) {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i13 == 0) {
                    i10 = i9 - 4;
                } else {
                    if (i13 == 7 || i13 == 8) {
                        int i15 = i9 - 4;
                        if (this.f19450a0 == null) {
                            i10 = i15;
                        }
                    }
                    i10 = i9 - 5;
                }
                if (this.f19254f && (i13 != 7 || !this.h)) {
                    ArrayList arrayList = this.f19256r;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        u4Var.b(tL_messageMediaVenue, i14, true, false);
                        return;
                    }
                    int size = i10 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f19257s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i14 = i10;
                u4Var.b(tL_messageMediaVenue, i14, true, false);
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
                s6 s6Var = (s6) view;
                if (this.K != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s6Var.setHasLocation(z10);
                int i16 = i9 + 1;
                if (i16 < h() && j(i16) == 7) {
                    z11 = true;
                }
                s6Var.f25276s = z11;
                s6Var.invalidate();
                return;
            case 7:
                s6 s6Var2 = (s6) view;
                if (this.K != null) {
                    z11 = true;
                }
                s6Var2.setHasLocation(z11);
                return;
            case 8:
                u7 u7Var = (u7) view;
                if (i13 == 6) {
                    u7Var.b(this.S, this.K, this.f19455f0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.T;
                long j11 = this.Q;
                if (tL_channelLocation != null) {
                    TextView textView = u7Var.d;
                    Location location = u7Var.v;
                    o9 o9Var = u7Var.f25749a;
                    u7Var.f25758x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    u7Var.f25753f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(u7Var.f25758x).getUser(Long.valueOf(j11));
                        if (user != null) {
                            u7Var.f25753f = new z8(0, user);
                            str2 = UserObject.getUserName(user);
                            o9Var.e(user, u7Var.f25753f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(u7Var.f25758x).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            z8 z8Var = new z8(chat);
                            u7Var.f25753f = z8Var;
                            str2 = chat.title;
                            o9Var.e(chat, z8Var);
                        }
                    }
                    u7Var.f25750b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    u7Var.f25752e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.S;
                if (messageObject != null && i9 == 1) {
                    u7Var.b(messageObject, this.K, this.f19455f0);
                    return;
                }
                if (messageObject != null) {
                    i14 = 5;
                }
                int i17 = i9 - i14;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(j11);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i17--;
                }
                if (i17 >= 0 && i17 < this.U.size()) {
                    jc0 jc0Var = (jc0) this.U.get(i17);
                    Location location2 = this.K;
                    TextView textView2 = u7Var.d;
                    o9 o9Var2 = u7Var.f25749a;
                    h5 h5Var = u7Var.f25750b;
                    Location location3 = u7Var.v;
                    u7Var.f25756s = jc0Var;
                    if (DialogObject.isUserDialog(jc0Var.f39436a)) {
                        TLRPC.User user2 = MessagesController.getInstance(u7Var.f25758x).getUser(Long.valueOf(jc0Var.f39436a));
                        if (user2 != null) {
                            u7Var.f25753f.m(u7Var.f25758x, user2);
                            h5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            o9Var2.e(user2, u7Var.f25753f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(u7Var.f25758x).getChat(Long.valueOf(-jc0Var.f39436a));
                        if (chat2 != null) {
                            u7Var.f25753f.k(u7Var.f25758x, chat2);
                            h5Var.l(chat2.title, false);
                            o9Var2.e(chat2, u7Var.f25753f);
                        }
                    }
                    IMapsProvider.LatLng position = jc0Var.f39439e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = jc0Var.f39437b;
                    int i18 = message.edit_date;
                    if (i18 != 0) {
                        j10 = i18;
                    } else {
                        j10 = message.date;
                    }
                    String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(j10);
                    if (location2 != null) {
                        textView2.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                        return;
                    }
                    textView2.setText(formatLocationUpdateDate);
                    return;
                }
                return;
            case 11:
                if (this.f19455f0) {
                    i11 = f6.f23091i5;
                } else {
                    i11 = f6.f23072h5;
                }
                view.setBackgroundColor(f6.v0(i11, this.X));
                return;
            case 12:
                u4 u4Var2 = (u4) view;
                if (this.f19456g0) {
                    u4Var2.b(null, 2, (i9 != 1 || this.f19450a0 == null) ? false : false, false);
                    return;
                } else if (i9 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.Z;
                    if (this.f19450a0 != null) {
                        z11 = true;
                    }
                    u4Var2.b(tL_messageMediaVenue2, 2, z11, this.Y);
                    return;
                } else {
                    u4Var2.b(this.f19450a0, 2, false, this.Y);
                    return;
                }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        int i10;
        long j10 = this.Q;
        b6 b6Var = this.X;
        Context context = this.H;
        switch (i9) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f19457h0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f19457h0.setLayoutParams(new f2.a1(-1, this.I));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new s6(context, b6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, b6Var);
                break;
            case 3:
                view2 = new u4(context, b6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, b6Var);
                frameLayout2.f25896a = radialProgressView;
                frameLayout2.addView(radialProgressView, e6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f25898c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.W5, b6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f25897b = textView;
                textView.setTextColor(f6.v0(f6.X5, b6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, e6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, e6.e(-2, -2, 17));
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
                int i11 = f6.A6;
                g10.setTextColor(f6.v0(i11, b6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, e6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i11, b6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, e6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(f6.v0(i11, b6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, e6.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                s6 s6Var = new s6(context, b6Var, true, false);
                s6Var.setDialogId(j10);
                view2 = s6Var;
                break;
            case 7:
                s6 s6Var2 = new s6(context, b6Var, true, true);
                s6Var2.setDialogId(j10);
                view2 = s6Var2;
                break;
            case 8:
                int i12 = this.P;
                if (i12 != 4 && i12 != 5 && i12 != 3) {
                    i10 = 54;
                } else {
                    i10 = 16;
                }
                view2 = new u7(i10, context, b6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f25791a = frameLayout5;
                frameLayout5.setBackground(v5.e(new float[]{8.0f}, f6.v0(f6.Oh, b6Var)));
                frameLayout4.addView(frameLayout5, e6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(f6.v0(f6.Sh, b6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(h5Var, e6.c(-1.0f, -1));
                frameLayout5.setOutlineProvider(ff.r0.f6255b);
                frameLayout5.setClipToOutline(true);
                g6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new x8(this, 10));
                view2 = frameLayout4;
                break;
            case 10:
                View z6Var = new z6(context, (j2) null);
                new fq(new ColorDrawable(f6.v0(f6.f22947a7, b6Var)), f6.V0(context, R.drawable.greydivider_bottom, f6.f22966b7)).f28550w = true;
                view2 = z6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, b6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.f19453d0;
                break;
        }
        return new f2.q1(view2);
    }

    public void K() {
    }
}
