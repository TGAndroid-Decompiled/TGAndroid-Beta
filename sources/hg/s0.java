package hg;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.dc0;
import org.telegram.ui.hc0;
import w7.b6;
import w7.z5;
public class s0 extends c implements LocationController.LocationFetchCallback {
    public final int K;
    public final Context L;
    public int M;
    public s6 N;
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
    public final boolean f12035a0;
    public final d6 f12036b0;
    public boolean f12037c0;
    public TLRPC.TL_messageMediaVenue f12038d0;
    public TLRPC.TL_messageMediaVenue f12039e0;
    public boolean f12040f0;
    public final boolean f12041g0;
    public dc0 f12042h0;
    public boolean f12043i0;
    public boolean f12044j0;
    public boolean f12045k0;
    public FrameLayout f12046l0;

    public s0(Context context, int i10, long j10, boolean z10, d6 d6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = UserConfig.selectedAccount;
        this.V = -1;
        this.Y = new ArrayList();
        this.f12037c0 = true;
        this.f12044j0 = false;
        this.f12045k0 = false;
        this.f12041g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j10;
        this.f12035a0 = z10;
        this.f12036b0 = d6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
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
        ArrayList arrayList = this.f11818s;
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
                if (this.f12039e0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f11817r;
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
            if (((hc0) this.Y.get(i10)).f37569a == clientUserId || ((hc0) this.Y.get(i10)).f37570b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f12044j0 == z10 && this.f12045k0 == z11) {
            return;
        }
        this.f12044j0 = z10;
        this.f12045k0 = z11;
        if (z11) {
            this.f12038d0 = null;
            this.f12039e0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.f12046l0;
        if (frameLayout != null) {
            s4.o0 o0Var = (s4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new s4.o0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
            }
            this.f12046l0.setLayoutParams(o0Var);
            this.f12046l0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        s6 s6Var = this.N;
        if (s6Var != null) {
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
                    s6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.O.getAccuracy(), new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f12044j0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                s6Var.b(string2, str);
                this.N.setHasLocation(!this.f12044j0);
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
                    } else if (!this.f12044j0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f12040f0) {
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
                    if (!this.f12041g0) {
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
                boolean z11 = this.f12035a0;
                if (!z10 && this.f11815f) {
                    ArrayList arrayList = this.f11818s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f11817r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f12039e0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f12044j0;
                if (!z12 && (this.h || !this.f11815f)) {
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
        if (this.f12042h0 != null && this.f12043i0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: hg.s0.j(int):int");
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
        if (i10 == 7 && this.f12045k0) {
            this.f12038d0 = null;
            this.f12039e0 = null;
        }
        if (this.f12039e0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.f12038d0 = tL_messageMediaVenue;
            this.f12039e0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f12039e0 == null) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13 = b1Var.f45920f;
        View view = b1Var.f45917a;
        int i14 = this.T;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                s4.o0 o0Var = (s4.o0) view.getLayoutParams();
                if (o0Var == null) {
                    o0Var = new s4.o0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
                }
                view.setLayoutParams(o0Var);
                return;
            case 1:
                this.N = (s6) view;
                Q();
                return;
            case 2:
                l4 l4Var = (l4) view;
                if (this.W != null) {
                    l4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                t4 t4Var = (t4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f12039e0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f11815f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f11817r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        t4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f11818s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                t4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((v4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                s6 s6Var = (s6) view;
                if (this.O != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z11 = true;
                }
                s6Var.f23019s = z11;
                s6Var.invalidate();
                return;
            case 7:
                s6 s6Var2 = (s6) view;
                if (this.O != null) {
                    z11 = true;
                }
                s6Var2.setHasLocation(z11);
                return;
            case 8:
                v7 v7Var = (v7) view;
                if (i14 == 6) {
                    v7Var.b(this.W, this.O, this.f12044j0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.X;
                long j11 = this.U;
                if (tL_channelLocation != null) {
                    TextView textView = v7Var.d;
                    Location location = v7Var.v;
                    w9 w9Var = v7Var.f23642a;
                    v7Var.f23650x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    v7Var.f23645f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(v7Var.f23650x).getUser(Long.valueOf(j11));
                        if (user != null) {
                            v7Var.f23645f = new h9(0, user);
                            str2 = UserObject.getUserName(user);
                            w9Var.e(user, v7Var.f23645f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(v7Var.f23650x).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            h9 h9Var = new h9(chat);
                            v7Var.f23645f = h9Var;
                            str2 = chat.title;
                            w9Var.e(chat, h9Var);
                        }
                    }
                    v7Var.f23643b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    v7Var.e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.W;
                if (messageObject != null && i10 == 1) {
                    v7Var.b(messageObject, this.O, this.f12044j0);
                    return;
                }
                if (messageObject != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.K).getSharingLocationInfo(j11);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.Y.size()) {
                    hc0 hc0Var = (hc0) this.Y.get(i18);
                    Location location2 = this.O;
                    TextView textView2 = v7Var.d;
                    w9 w9Var2 = v7Var.f23642a;
                    j5 j5Var = v7Var.f23643b;
                    Location location3 = v7Var.v;
                    v7Var.f23648s = hc0Var;
                    if (DialogObject.isUserDialog(hc0Var.f37569a)) {
                        TLRPC.User user2 = MessagesController.getInstance(v7Var.f23650x).getUser(Long.valueOf(hc0Var.f37569a));
                        if (user2 != null) {
                            v7Var.f23645f.m(v7Var.f23650x, user2);
                            j5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            w9Var2.e(user2, v7Var.f23645f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(v7Var.f23650x).getChat(Long.valueOf(-hc0Var.f37569a));
                        if (chat2 != null) {
                            v7Var.f23645f.k(v7Var.f23650x, chat2);
                            j5Var.l(chat2.title, false);
                            w9Var2.e(chat2, v7Var.f23645f);
                        }
                    }
                    IMapsProvider.LatLng position = hc0Var.e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = hc0Var.f37570b;
                    int i19 = message.edit_date;
                    if (i19 != 0) {
                        j10 = i19;
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
                if (this.f12044j0) {
                    i12 = h6.f21078i5;
                } else {
                    i12 = h6.f21061h5;
                }
                view.setBackgroundColor(h6.w0(i12, this.f12036b0));
                return;
            case 12:
                t4 t4Var2 = (t4) view;
                if (this.f12045k0) {
                    if (i10 != 1 || this.f12039e0 == null) {
                        z12 = false;
                    }
                    t4Var2.b(null, 2, z12, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f12038d0;
                    if (this.f12039e0 != null) {
                        z11 = true;
                    }
                    t4Var2.b(tL_messageMediaVenue2, 2, z11, this.f12037c0);
                    return;
                } else {
                    t4Var2.b(this.f12039e0, 2, false, this.f12037c0);
                    return;
                }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j10 = this.U;
        d6 d6Var = this.f12036b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f12046l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f12046l0.setLayoutParams(new s4.o0(-1, this.M));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new s6(context, d6Var, false, false);
                break;
            case 2:
                view2 = new l4(context, d6Var);
                break;
            case 3:
                view2 = new t4(context, d6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, d6Var);
                frameLayout2.f23634a = radialProgressView;
                frameLayout2.addView(radialProgressView, z5.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f23636c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.W5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f23635b = textView;
                textView.setTextColor(h6.w0(h6.X5, d6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, z5.e(-2, -2, 17));
                TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
                int i12 = h6.A6;
                f7.setTextColor(h6.w0(i12, d6Var));
                f7.setText("Powered by");
                linearLayout.addView(f7, z5.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(i12, d6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, z5.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(h6.w0(i12, d6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, z5.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                s6 s6Var = new s6(context, d6Var, true, false);
                s6Var.setDialogId(j10);
                view2 = s6Var;
                break;
            case 7:
                s6 s6Var2 = new s6(context, d6Var, true, true);
                s6Var2.setDialogId(j10);
                view2 = s6Var2;
                break;
            case 8:
                int i13 = this.T;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new v7(i11, context, d6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f23594a = frameLayout5;
                frameLayout5.setBackground(x5.e(new float[]{8.0f}, h6.w0(h6.Oh, d6Var)));
                frameLayout4.addView(frameLayout5, z5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                j5 j5Var = new j5(context);
                j5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                j5Var.setGravity(17);
                j5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                j5Var.setTextColor(h6.w0(h6.Sh, d6Var));
                j5Var.setTextSize(14);
                j5Var.l(LocaleController.getString(R.string.Directions), false);
                j5Var.setLeftDrawable(R.drawable.filled_directions);
                j5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(j5Var, z5.c(-1.0f, -1));
                frameLayout5.setOutlineProvider(zf.j0.f51582b);
                frameLayout5.setClipToOutline(true);
                b6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new r0(this, 0));
                view2 = frameLayout4;
                break;
            case 10:
                View z6Var = new z6(context, (org.telegram.ui.Cells.c1) null);
                new zq(new ColorDrawable(h6.w0(h6.f20932a7, d6Var)), h6.W0(context, R.drawable.greydivider_bottom, h6.f20952b7)).f33023w = true;
                view2 = z6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                t4 t4Var = new t4(context, d6Var);
                t4Var.setAllowTextAnimation(true);
                view2 = t4Var;
                break;
            case 13:
                view2 = this.f12042h0;
                break;
        }
        return new s4.b1(view2);
    }

    public void K() {
    }
}
