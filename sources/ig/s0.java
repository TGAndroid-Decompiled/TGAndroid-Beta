package ig;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Cells.z4;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.d3;
import org.telegram.ui.fc0;
import org.telegram.ui.jc0;
public class s0 extends c implements LocationController.LocationFetchCallback {
    public final int K;
    public final Context L;
    public int M;
    public x6 N;
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
    public final boolean f14231a0;
    public final u6 f14232b0;
    public boolean f14233c0;
    public TLRPC.TL_messageMediaVenue f14234d0;
    public TLRPC.TL_messageMediaVenue f14235e0;
    public boolean f14236f0;
    public final boolean f14237g0;
    public fc0 f14238h0;
    public boolean f14239i0;
    public boolean f14240j0;
    public boolean f14241k0;
    public FrameLayout f14242l0;

    public s0(Context context, int i10, long j10, boolean z10, u6 u6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = UserConfig.selectedAccount;
        this.V = -1;
        this.Y = new ArrayList();
        this.f14233c0 = true;
        this.f14240j0 = false;
        this.f14241k0 = false;
        this.f14237g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j10;
        this.f14231a0 = z10;
        this.f14232b0 = u6Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
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
        ArrayList arrayList = this.f14012s;
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
                if (this.f14235e0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f14011r;
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
            if (((jc0) this.Y.get(i10)).f40553a == clientUserId || ((jc0) this.Y.get(i10)).f40554b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f14240j0 == z10 && this.f14241k0 == z11) {
            return;
        }
        this.f14240j0 = z10;
        this.f14241k0 = z11;
        if (z11) {
            this.f14234d0 = null;
            this.f14235e0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.f14242l0;
        if (frameLayout != null) {
            s4.q0 q0Var = (s4.q0) frameLayout.getLayoutParams();
            if (q0Var == null) {
                q0Var = new s4.q0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) q0Var).height = this.M;
            }
            this.f14242l0.setLayoutParams(q0Var);
            this.f14242l0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        x6 x6Var = this.N;
        if (x6Var != null) {
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
                    x6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.O.getAccuracy(), new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f14240j0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                x6Var.b(string2, str);
                this.N.setHasLocation(!this.f14240j0);
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
                    } else if (!this.f14240j0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f14236f0) {
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
                    if (!this.f14237g0) {
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
                boolean z11 = this.f14231a0;
                if (!z10 && this.f14009f) {
                    ArrayList arrayList = this.f14012s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f14011r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f14235e0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f14240j0;
                if (!z12 && (this.h || !this.f14009f)) {
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
        if (this.f14238h0 != null && this.f14239i0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: ig.s0.j(int):int");
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
        if (i10 == 7 && this.f14241k0) {
            this.f14234d0 = null;
            this.f14235e0 = null;
        }
        if (this.f14235e0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.f14234d0 = tL_messageMediaVenue;
            this.f14235e0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f14235e0 == null) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13 = e1Var.f47741f;
        View view = e1Var.f47738a;
        int i14 = this.T;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                s4.q0 q0Var = (s4.q0) view.getLayoutParams();
                if (q0Var == null) {
                    q0Var = new s4.q0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) q0Var).height = this.M;
                }
                view.setLayoutParams(q0Var);
                return;
            case 1:
                this.N = (x6) view;
                Q();
                return;
            case 2:
                q4 q4Var = (q4) view;
                if (this.W != null) {
                    q4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                y4 y4Var = (y4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f14235e0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f14009f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f14011r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        y4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f14012s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                y4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((a5) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                x6 x6Var = (x6) view;
                if (this.O != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z11 = true;
                }
                x6Var.f25717x = z11;
                x6Var.invalidate();
                return;
            case 7:
                x6 x6Var2 = (x6) view;
                if (this.O != null) {
                    z11 = true;
                }
                x6Var2.setHasLocation(z11);
                return;
            case 8:
                z7 z7Var = (z7) view;
                if (i14 == 6) {
                    z7Var.b(this.W, this.O, this.f14240j0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.X;
                long j11 = this.U;
                if (tL_channelLocation != null) {
                    TextView textView = z7Var.f25802f;
                    Location location = z7Var.f25807x;
                    y9 y9Var = z7Var.f25801c;
                    z7Var.E = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    z7Var.f25803n = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(z7Var.E).getUser(Long.valueOf(j11));
                        if (user != null) {
                            z7Var.f25803n = new j9(0, user);
                            str2 = UserObject.getUserName(user);
                            y9Var.f(user, z7Var.f25803n);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(z7Var.E).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            j9 j9Var = new j9(chat);
                            z7Var.f25803n = j9Var;
                            str2 = chat.title;
                            y9Var.f(chat, j9Var);
                        }
                    }
                    z7Var.d.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    z7Var.h = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.W;
                if (messageObject != null && i10 == 1) {
                    z7Var.b(messageObject, this.O, this.f14240j0);
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
                    jc0 jc0Var = (jc0) this.Y.get(i18);
                    Location location2 = this.O;
                    TextView textView2 = z7Var.f25802f;
                    y9 y9Var2 = z7Var.f25801c;
                    b6 b6Var = z7Var.d;
                    Location location3 = z7Var.f25807x;
                    z7Var.f25806w = jc0Var;
                    if (DialogObject.isUserDialog(jc0Var.f40553a)) {
                        TLRPC.User user2 = MessagesController.getInstance(z7Var.E).getUser(Long.valueOf(jc0Var.f40553a));
                        if (user2 != null) {
                            z7Var.f25803n.m(z7Var.E, user2);
                            b6Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            y9Var2.f(user2, z7Var.f25803n);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(z7Var.E).getChat(Long.valueOf(-jc0Var.f40553a));
                        if (chat2 != null) {
                            z7Var.f25803n.k(z7Var.E, chat2);
                            b6Var.l(chat2.title, false);
                            y9Var2.f(chat2, z7Var.f25803n);
                        }
                    }
                    IMapsProvider.LatLng position = jc0Var.e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = jc0Var.f40554b;
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
                if (this.f14240j0) {
                    i12 = y6.f23447i5;
                } else {
                    i12 = y6.f23427h5;
                }
                f7.i(i12, view, this.f14232b0);
                return;
            case 12:
                y4 y4Var2 = (y4) view;
                if (this.f14241k0) {
                    if (i10 != 1 || this.f14235e0 == null) {
                        z12 = false;
                    }
                    y4Var2.b(null, 2, z12, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f14234d0;
                    if (this.f14235e0 != null) {
                        z11 = true;
                    }
                    y4Var2.b(tL_messageMediaVenue2, 2, z11, this.f14233c0);
                    return;
                } else {
                    y4Var2.b(this.f14235e0, 2, false, this.f14233c0);
                    return;
                }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j10 = this.U;
        u6 u6Var = this.f14232b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f14242l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f14242l0.setLayoutParams(new s4.q0(-1, this.M));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new x6(context, u6Var, false, false);
                break;
            case 2:
                view2 = new q4(context, u6Var);
                break;
            case 3:
                view2 = new y4(context, u6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
                frameLayout2.f23854a = radialProgressView;
                frameLayout2.addView(radialProgressView, gb1.i(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f23856c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                f7.t(imageView, y6.W5, u6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView, gb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f23855b = textView;
                f7.V(textView, y6.X5, u6Var);
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, gb1.h(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, gb1.i(-2, -2, 17));
                TextView g7 = org.telegram.messenger.t.g(context, 1, 16.0f);
                int i12 = y6.A6;
                f7.V(g7, i12, u6Var);
                g7.setText("Powered by");
                linearLayout.addView(g7, gb1.r(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                f7.t(imageView2, i12, u6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, gb1.r(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                f7.V(textView2, i12, u6Var);
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, gb1.r(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                x6 x6Var = new x6(context, u6Var, true, false);
                x6Var.setDialogId(j10);
                view2 = x6Var;
                break;
            case 7:
                x6 x6Var2 = new x6(context, u6Var, true, true);
                x6Var2.setDialogId(j10);
                view2 = x6Var2;
                break;
            case 8:
                int i13 = this.T;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new z7(i11, context, u6Var, true);
                break;
            case 9:
                z4 z4Var = new z4(context, u6Var);
                z4Var.setOnButtonClick(new d0(this, 1));
                view2 = z4Var;
                break;
            case 10:
                View f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                new ar(new ColorDrawable(y6.w0(y6.f23299a7, u6Var)), y6.X0(context, R.drawable.greydivider_bottom, y6.f23318b7)).f26599w = true;
                view2 = f7Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                y4 y4Var = new y4(context, u6Var);
                y4Var.setAllowTextAnimation(true);
                view2 = y4Var;
                break;
            case 13:
                view2 = this.f14238h0;
                break;
        }
        return new s4.e1(view2);
    }

    public void K() {
    }
}
