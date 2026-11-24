package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class fc2 {
    public static int R;
    public gc2 A;
    public boolean B;
    public j5 C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean a;
    public TLRPC.GroupCall b;
    public long c;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public gc2 z;
    public vf6 d = new vf6();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final HashSet n = new HashSet();
    public final ArrayList o = new ArrayList();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final zb2 D = new zb2(this, (byte) 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final vf6 P = new vf6();
    public final dc2 Q = new dc2(this);

    public static boolean E(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, fc2 fc2Var) {
        VoIPService sharedInstance;
        gc2 gc2Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            if (sharedInstance.getVideoState(z) != 2) {
                return false;
            }
            return true;
        }
        gc2 gc2Var2 = fc2Var.A;
        if ((gc2Var2 != null && gc2Var2.a == groupCallParticipant) || (((gc2Var = fc2Var.z) != null && gc2Var.a == groupCallParticipant) || fc2Var.d.f(k27.B1(groupCallParticipant.peer)) != null)) {
            if (z) {
                if (groupCallParticipant.presentation == null) {
                    return false;
                }
                return true;
            } else if (groupCallParticipant.video != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2) {
        if (tL_groupCallParticipantVideo == null) {
            if (tL_groupCallParticipantVideo2 != null) {
                return false;
            }
            return true;
        }
        if (tL_groupCallParticipantVideo2 != null && TextUtils.equals(tL_groupCallParticipantVideo.endpoint, tL_groupCallParticipantVideo2.endpoint) && tL_groupCallParticipantVideo.source_groups.size() == tL_groupCallParticipantVideo2.source_groups.size()) {
            int size = tL_groupCallParticipantVideo.source_groups.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i);
                if (TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) && tL_groupCallParticipantVideoSourceGroup.sources.size() == tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i2))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A() {
        TLRPC.GroupCall groupCall = this.b;
        if (groupCall.participants_count <= 0 && !groupCall.rtmp_stream && !k()) {
            return false;
        }
        return true;
    }

    public final void B() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i;
        String str;
        int size;
        String str2;
        gc2 gc2Var;
        char c;
        boolean z;
        int i2;
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        ArrayList arrayList4 = this.g;
        arrayList4.clear();
        TLRPC.Chat K0 = na7.q1(this.C.a).K0(Long.valueOf(this.c));
        final boolean w = hc2.w(14, K0);
        gc2 gc2Var2 = this.A;
        if (gc2Var2 != null) {
            arrayList3.add(gc2Var2);
        }
        final long i3 = i();
        VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(i3);
        this.x = true;
        int i4 = 0;
        this.y = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            arrayList = this.e;
            int size2 = arrayList.size();
            arrayList2 = this.o;
            if (i5 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i5);
            boolean E = E(groupCallParticipant3, false, this);
            boolean E2 = E(groupCallParticipant3, true, this);
            if (!groupCallParticipant3.self && (E || E2)) {
                this.y++;
            }
            if (arrayList2.contains(Long.valueOf(cf3.n(groupCallParticipant3.peer)))) {
                arrayList.remove(i5);
                i5--;
            }
            if (!E && !E2) {
                if (groupCallParticipant3.self || !this.x || (groupCallParticipant3.video == null && groupCallParticipant3.presentation == null)) {
                    groupCallParticipant3.videoIndex = 0;
                }
            } else {
                if (this.x) {
                    if (groupCallParticipant3.videoIndex == 0) {
                        if (groupCallParticipant3.self) {
                            groupCallParticipant3.videoIndex = Integer.MAX_VALUE;
                        } else {
                            int i6 = R + 1;
                            R = i6;
                            groupCallParticipant3.videoIndex = i6;
                        }
                    }
                } else {
                    groupCallParticipant3.videoIndex = 0;
                }
                z2 = true;
            }
            i5++;
        }
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(java.lang.Object r9, java.lang.Object r10) {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.compare(java.lang.Object, java.lang.Object):int");
                }
            });
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            groupCallParticipant = null;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) b00.f(1, arrayList);
        }
        char c2 = 2;
        if ((E(groupCallParticipant, false, this) || E(groupCallParticipant, true, this)) && (i = this.b.unmuted_video_count) > this.y) {
            this.y = i;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.y--;
            }
        }
        int i7 = 5000;
        if (arrayList.size() > 5000 && (!hc2.w(14, K0) || groupCallParticipant.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i8 = 5000;
            while (i8 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i7);
                char c3 = c2;
                if (groupCallParticipant4.raise_hand_rating != 0) {
                    c = c3;
                    z = z2;
                    i2 = 5000;
                } else {
                    o(groupCallParticipant4, false);
                    c = c3;
                    z = z2;
                    this.d.l(k27.B1(groupCallParticipant4.peer));
                    i2 = 5000;
                    arrayList.remove(5000);
                }
                i8++;
                z2 = z;
                i7 = i2;
                c2 = c;
            }
        }
        boolean z3 = z2;
        d();
        if (!this.x && z3 && (gc2Var = this.z) != null) {
            arrayList3.add(gc2Var);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i10);
            if (this.x && groupCallParticipant5.videoIndex != 0) {
                boolean z4 = groupCallParticipant5.self;
                HashMap hashMap = this.i;
                if (!z4 && E(groupCallParticipant5, true, this) && E(groupCallParticipant5, false, this)) {
                    gc2 gc2Var3 = (gc2) hashMap.get(groupCallParticipant5.videoEndpoint);
                    if (gc2Var3 == null) {
                        gc2Var3 = new gc2(groupCallParticipant5, false);
                        hashMap.put(groupCallParticipant5.videoEndpoint, gc2Var3);
                    } else {
                        gc2Var3.a = groupCallParticipant5;
                        gc2Var3.b = false;
                    }
                    gc2 gc2Var4 = (gc2) hashMap.get(groupCallParticipant5.presentationEndpoint);
                    if (gc2Var4 == null) {
                        gc2Var4 = new gc2(groupCallParticipant5, true);
                    } else {
                        gc2Var4.a = groupCallParticipant5;
                        gc2Var4.b = true;
                    }
                    arrayList3.add(gc2Var3);
                    if (gc2Var3.c > 1.0f) {
                        i9 = arrayList3.size() - 1;
                    }
                    arrayList3.add(gc2Var4);
                    if (gc2Var4.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                } else if (groupCallParticipant5.self) {
                    if (E(groupCallParticipant5, true, this)) {
                        arrayList3.add(new gc2(groupCallParticipant5, true));
                    }
                    if (E(groupCallParticipant5, false, this)) {
                        arrayList3.add(new gc2(groupCallParticipant5, false));
                    }
                } else {
                    boolean E3 = E(groupCallParticipant5, true, this);
                    if (E3) {
                        str = groupCallParticipant5.presentationEndpoint;
                    } else {
                        str = groupCallParticipant5.videoEndpoint;
                    }
                    gc2 gc2Var5 = (gc2) hashMap.get(str);
                    if (gc2Var5 == null) {
                        gc2Var5 = new gc2(groupCallParticipant5, E3);
                        if (E3) {
                            str2 = groupCallParticipant5.presentationEndpoint;
                        } else {
                            str2 = groupCallParticipant5.videoEndpoint;
                        }
                        hashMap.put(str2, gc2Var5);
                    } else {
                        gc2Var5.a = groupCallParticipant5;
                        gc2Var5.b = E3;
                    }
                    arrayList3.add(gc2Var5);
                    if (gc2Var5.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                }
            } else {
                arrayList4.add(groupCallParticipant5);
            }
        }
        int size4 = arrayList.size();
        int i11 = 0;
        while (i11 < size4) {
            TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i11);
            i11++;
            arrayList2.remove(Long.valueOf(cf3.n(groupCallParticipant6.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i12 = 0;
            while (i12 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i12);
                i12++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(cf3.n(groupCallParticipant7.peer)));
            }
            ArrayList arrayList5 = this.l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i4 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant8 = arrayList.get(i4);
                i4++;
                long n = cf3.n(groupCallParticipant8.peer);
                Long valueOf = Long.valueOf(n);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(n));
                    this.j.remove(Long.valueOf(n));
                }
            }
        }
        if (!h75.u5 && arrayList3.size() % 2 == 1) {
            arrayList3.add((gc2) arrayList3.remove(i9));
        }
    }

    public final void C(int i, String str) {
        boolean z;
        this.w = !this.w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = h(this.a);
        togglegroupcallrecord.start = this.w;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i == 1 || i == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            togglegroupcallrecord.video_portrait = z;
        }
        ConnectionsManager.getInstance(this.C.a).sendRequest(togglegroupcallrecord, new ac2(this, (byte) 2));
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void D() {
        B();
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE, 0L);
    }

    public final void a(long j) {
        if (this.d.f(j) == null) {
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.n;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(j));
                this.j.add(Long.valueOf(j));
                this.o.remove(Long.valueOf(j));
                B();
                kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
            }
        }
    }

    public final void b(boolean z) {
        boolean z2;
        long i = i();
        if (this.d.h(i) < 0) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            tL_groupCallParticipant.peer = this.J;
            tL_groupCallParticipant.muted = true;
            tL_groupCallParticipant.self = true;
            tL_groupCallParticipant.video_joined = this.b.can_start_video;
            TLRPC.Chat K0 = na7.q1(this.C.a).K0(Long.valueOf(this.c));
            if (this.b.join_muted && !hc2.w(14, K0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            tL_groupCallParticipant.can_self_unmute = z2;
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            if (hc2.w(14, K0) || !hc2.T(K0) || K0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            }
            int i2 = (i > 0L ? 1 : (i == 0L ? 0 : -1));
            j5 j5Var = this.C;
            if (i2 > 0) {
                TLRPC.UserFull W1 = na7.q1(j5Var.a).W1(i);
                if (W1 != null) {
                    tL_groupCallParticipant.about = W1.about;
                }
            } else {
                TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(-i);
                if (L0 != null) {
                    tL_groupCallParticipant.about = L0.about;
                }
            }
            this.d.k(tL_groupCallParticipant, i);
            this.e.add(tL_groupCallParticipant);
            B();
            if (z) {
                kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        if (!this.x || (((sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall != this || (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(true) != 2)) && this.y >= this.b.unmuted_video_limit)) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z = this.E;
        zb2 zb2Var = this.D;
        if (z) {
            gl.r(zb2Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i2);
            int i3 = currentTime - groupCallParticipant.active_date;
            if (i3 < 5) {
                i = Math.min(i3, i);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i != Integer.MAX_VALUE) {
            gl.e3(zb2Var, i * 1000);
            this.E = true;
        }
    }

    public final void e() {
        this.M = null;
        if (this.I != 0 && System.currentTimeMillis() - this.I >= 1500) {
            if (w01.a) {
                fa4.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
            }
            s();
        }
        if (!this.H.isEmpty()) {
            zb2 zb2Var = new zb2(this, (byte) 3);
            this.M = zb2Var;
            gl.e3(zb2Var, 1000L);
        }
    }

    public final void f() {
        if (this.z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.z = new gc2(tL_groupCallParticipant, false);
    }

    public final void g(List list) {
        TLRPC.GroupCallParticipant tL_groupCallParticipant;
        if (this.B && this.A != null) {
            return;
        }
        gc2 gc2Var = this.A;
        if (gc2Var != null) {
            tL_groupCallParticipant = gc2Var.a;
        } else {
            tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        }
        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
        tL_groupCallParticipant.peer = tL_peerChat;
        tL_peerChat.channel_id = this.c;
        tL_groupCallParticipant.video = new TLRPC.TL_groupCallParticipantVideo();
        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
        tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) it.next()).channel));
        }
        tL_groupCallParticipant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
        tL_groupCallParticipant.video.endpoint = "unified";
        tL_groupCallParticipant.videoEndpoint = "unified";
        this.A = new gc2(tL_groupCallParticipant, false);
        B();
        gl.d3(new zb2(this, (byte) 0));
    }

    public final TLRPC.InputGroupCall h(boolean z) {
        TLRPC.GroupCall groupCall = this.b;
        if (groupCall == null) {
            return null;
        }
        if (z) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) oo1.m(1, Uri.parse(this.b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.b;
        tL_inputGroupCall.id = groupCall2.id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long i() {
        TLRPC.Peer peer = this.J;
        if (peer != null) {
            return k27.B1(peer);
        }
        return y6c.h(this.C.a).e();
    }

    public final boolean k() {
        if ((this.b.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void l(boolean z) {
        int i;
        if (z) {
            if (!this.v) {
                this.t = false;
                this.s = null;
            } else {
                return;
            }
        }
        if (!this.t && this.e.size() <= 5000) {
            if (z) {
                this.v = true;
            }
            this.u = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = h(this.a);
            String str = this.s;
            if (str == null) {
                str = "";
            }
            getgroupparticipants.offset = str;
            if (this.a) {
                i = na7.q1(this.C.a).k4.w3.f();
            } else {
                i = 20;
            }
            getgroupparticipants.limit = i;
            ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new mi1(this, z, getgroupparticipants, (byte) 1));
        }
    }

    public final void m(ArrayList arrayList, boolean z, hs0 hs0Var) {
        HashSet hashSet;
        if (z) {
            hashSet = this.K;
        } else {
            hashSet = this.L;
        }
        HashSet hashSet2 = hashSet;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (hashSet2.contains(arrayList.get(i))) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = this.F + 1;
        this.F = i2;
        this.G.add(Integer.valueOf(i2));
        hashSet2.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = h(this.a);
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (z) {
                getgroupparticipants.ids.add(na7.q1(this.C.a).h1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new vt0(this, i2, hs0Var, arrayList, hashSet2, (byte) 2));
    }

    public final void n(ArrayList arrayList, boolean z, String str, String str2, int i, int i2) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int max;
        int max2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(i());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.e;
        vf6 vf6Var = null;
        if (isEmpty) {
            int m = this.d.m();
            vf6 vf6Var2 = this.d;
            if (m != 0) {
                this.d = new vf6();
                vf6Var = vf6Var2;
            } else {
                vf6Var2.b();
            }
            arrayList2.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
            this.G.clear();
        }
        this.s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.s)) {
            this.t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.b;
            groupCall.version = i;
            groupCall.participants_count = i2;
            if (w01.a) {
                b00.p(this.b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(elapsedRealtime));
        int size = arrayList.size();
        int i3 = 0;
        boolean z4 = false;
        while (i3 <= size) {
            if (i3 == size) {
                if (z && groupCallParticipant3 != null && !z4) {
                    groupCallParticipant = groupCallParticipant3;
                    z4 = z4;
                } else {
                    z2 = z3;
                    i3++;
                    z3 = z2;
                    z4 = z4;
                }
            } else {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                z4 = z4;
                if (groupCallParticipant.self) {
                    z4 = true;
                }
            }
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(k27.B1(groupCallParticipant.peer));
            if (groupCallParticipant4 != null) {
                arrayList2.remove(groupCallParticipant4);
                o(groupCallParticipant4, z3);
                if (groupCallParticipant4.self) {
                    max2 = groupCallParticipant4.active_date;
                    groupCallParticipant.lastTypingDate = max2;
                } else {
                    max2 = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                    groupCallParticipant.lastTypingDate = max2;
                }
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max2;
                }
            } else if (vf6Var != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) vf6Var.f(k27.B1(groupCallParticipant.peer))) != null) {
                if (groupCallParticipant2.self) {
                    max = groupCallParticipant2.active_date;
                    groupCallParticipant.lastTypingDate = max;
                } else {
                    max = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                    groupCallParticipant.lastTypingDate = max;
                }
                z2 = z3;
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max;
                } else {
                    groupCallParticipant.active_date = groupCallParticipant2.active_date;
                }
                this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
                arrayList2.add(groupCallParticipant);
                o(groupCallParticipant, true);
                i3++;
                z3 = z2;
                z4 = z4;
            }
            z2 = z3;
            this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
            arrayList2.add(groupCallParticipant);
            o(groupCallParticipant, true);
            i3++;
            z3 = z2;
            z4 = z4;
        }
        boolean z5 = z3;
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        B();
        kk7 f = kk7.f(this.C.a);
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.b.id);
        Object[] objArr = new Object[3];
        objArr[z5 ? 1 : 0] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = Boolean.FALSE;
        f.k(kk7.v2, objArr);
        x();
    }

    public final void o(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        SparseArray sparseArray;
        int i;
        int i2 = groupCallParticipant.source;
        SparseArray sparseArray2 = this.p;
        if (i2 != 0) {
            if (z) {
                sparseArray2.put(i2, groupCallParticipant);
            } else {
                sparseArray2.remove(i2);
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                tL_groupCallParticipantVideo = groupCallParticipant.video;
            } else {
                tL_groupCallParticipantVideo = groupCallParticipant.presentation;
            }
            if (tL_groupCallParticipantVideo != null) {
                if ((tL_groupCallParticipantVideo.flags & 2) != 0 && (i = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z) {
                        sparseArray2.put(i, groupCallParticipant);
                    } else {
                        sparseArray2.remove(i);
                    }
                }
                if (i3 == 0) {
                    sparseArray = this.q;
                } else {
                    sparseArray = this.r;
                }
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i4);
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i5).intValue();
                        if (z) {
                            sparseArray.put(intValue, groupCallParticipant);
                        } else {
                            sparseArray.remove(intValue);
                        }
                    }
                }
                if (z) {
                    String str = tL_groupCallParticipantVideo.endpoint;
                    if (i3 == 0) {
                        groupCallParticipant.videoEndpoint = str;
                    } else {
                        groupCallParticipant.presentationEndpoint = str;
                    }
                } else if (i3 == 0) {
                    groupCallParticipant.videoEndpoint = null;
                } else {
                    groupCallParticipant.presentationEndpoint = null;
                }
            }
        }
    }

    public final void p(TLRPC.GroupCall groupCall) {
        boolean z;
        if (this.b.version < groupCall.version) {
            this.s = null;
            l(true);
        }
        apb.a(this.b, groupCall);
        this.b = groupCall;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(i());
        if (this.b.record_start_date != 0) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void q(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z) {
        int i;
        long j;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String str;
        String str2;
        String str3;
        String str4;
        long j2 = 0;
        boolean z2 = true;
        if (!z) {
            int size = tL_updateGroupCallParticipants.participants.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (tL_updateGroupCallParticipants.participants.get(i2).versioned) {
                    int i3 = this.b.version;
                    int i4 = i3 + 1;
                    int i5 = tL_updateGroupCallParticipants.version;
                    if (i4 < i5) {
                        if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                            this.s = null;
                            l(true);
                            return;
                        }
                        if (this.I == 0) {
                            this.I = System.currentTimeMillis();
                        }
                        if (w01.a) {
                            b00.p(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                        }
                        this.H.add(tL_updateGroupCallParticipants);
                        if (this.M == null) {
                            zb2 zb2Var = new zb2(this, (byte) 2);
                            this.M = zb2Var;
                            gl.e3(zb2Var, 1500L);
                            return;
                        }
                        return;
                    } else if (i5 < i3) {
                        if (w01.a) {
                            fa4.b("ignore processParticipantsUpdate because of version");
                            return;
                        }
                        return;
                    }
                } else {
                    i2++;
                }
            }
        }
        long i6 = i();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            i = ((TLRPC.GroupCallParticipant) b00.f(1, arrayList)).date;
        } else {
            i = 0;
        }
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j3 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i7 < size2) {
            long j4 = j2;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i7);
            boolean z8 = z2;
            long B1 = k27.B1(groupCallParticipant.peer);
            if (w01.a) {
                StringBuilder o = ug8.o(B1, "process participant ", " left = ");
                o.append(groupCallParticipant.left);
                o.append(" versioned ");
                o.append(groupCallParticipant.versioned);
                o.append(" flags = ");
                o.append(groupCallParticipant.flags);
                o.append(" self = ");
                o.append(i6);
                o.append(" volume = ");
                b00.p(groupCallParticipant.volume, o);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(B1);
            boolean z9 = groupCallParticipant.left;
            int i8 = size2;
            long j5 = i6;
            vf6 vf6Var = this.P;
            if (z9) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.b.version) {
                    if (w01.a) {
                        fa4.b("unknowd participant left, reload call");
                    }
                    z3 = z8;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(B1);
                    o(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.g.remove(groupCallParticipant2);
                    if (vf6Var.g(null, B1) != null) {
                        int i9 = (B1 > j4 ? 1 : (B1 == j4 ? 0 : -1));
                        j5 j5Var = this.C;
                        if (i9 > 0) {
                            j = elapsedRealtime;
                            TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(B1));
                            StringBuilder o2 = ug8.o(B1, "left remove from speaking ", " ");
                            if (V1 == null) {
                                str4 = null;
                            } else {
                                str4 = V1.first_name;
                            }
                            ir2.x(o2, str4, "GroupCall");
                        } else {
                            j = elapsedRealtime;
                            TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-B1));
                            StringBuilder o3 = ug8.o(B1, "left remove from speaking ", " ");
                            if (K0 == null) {
                                str3 = null;
                            } else {
                                str3 = K0.title;
                            }
                            ir2.x(o3, str3, "GroupCall");
                        }
                        vf6Var.l(B1);
                        z6 = z8;
                    } else {
                        j = elapsedRealtime;
                    }
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f;
                        if (i10 >= arrayList2.size()) {
                            break;
                        }
                        if (k27.B1(((gc2) arrayList2.get(i10)).a.peer) == k27.B1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                } else {
                    j = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.b;
                int i11 = groupCall.participants_count - 1;
                groupCall.participants_count = i11;
                if (i11 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j = elapsedRealtime;
                Long valueOf = Long.valueOf(B1);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(B1);
                    hashSet.remove(valueOf2);
                    this.j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (w01.a) {
                        fa4.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && vf6Var.g(null, B1) != null) {
                        vf6Var.l(B1);
                        int i12 = (B1 > j4 ? 1 : (B1 == j4 ? 0 : -1));
                        j5 j5Var2 = this.C;
                        if (i12 > 0) {
                            TLRPC.User V12 = na7.q1(j5Var2.a).V1(Long.valueOf(B1));
                            StringBuilder o4 = ug8.o(B1, "muted remove from speaking ", " ");
                            if (V12 == null) {
                                str2 = null;
                            } else {
                                str2 = V12.first_name;
                            }
                            ir2.x(o4, str2, "GroupCall");
                        } else {
                            TLRPC.Chat K02 = na7.q1(j5Var2.a).K0(Long.valueOf(-B1));
                            StringBuilder o5 = ug8.o(B1, "muted remove from speaking ", " ");
                            if (K02 == null) {
                                str = null;
                            } else {
                                str = K02.title;
                            }
                            ir2.x(o5, str, "GroupCall");
                        }
                        z6 = z8;
                    }
                    if (!groupCallParticipant.min) {
                        groupCallParticipant2.volume = groupCallParticipant.volume;
                        groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                    } else {
                        int i13 = groupCallParticipant.flags;
                        if ((i13 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                            groupCallParticipant.flags = i13 & (-129);
                        }
                        if (groupCallParticipant.volume_by_admin && groupCallParticipant2.volume_by_admin) {
                            groupCallParticipant2.volume = groupCallParticipant.volume;
                        }
                    }
                    groupCallParticipant2.flags = groupCallParticipant.flags;
                    groupCallParticipant2.can_self_unmute = groupCallParticipant.can_self_unmute;
                    groupCallParticipant2.video_joined = groupCallParticipant.video_joined;
                    if (groupCallParticipant2.raise_hand_rating == j4 && groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                    groupCallParticipant2.date = groupCallParticipant.date;
                    int max = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                    groupCallParticipant2.lastTypingDate = max;
                    if (j != groupCallParticipant2.lastVisibleDate) {
                        groupCallParticipant2.active_date = max;
                    }
                    if (groupCallParticipant2.source == groupCallParticipant.source && j(groupCallParticipant2.video, groupCallParticipant.video) && j(groupCallParticipant2.presentation, groupCallParticipant.presentation)) {
                        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                        if (tL_groupCallParticipantVideo2 != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            tL_groupCallParticipantVideo2.paused = tL_groupCallParticipantVideo.paused;
                        }
                    } else {
                        o(groupCallParticipant2, false);
                        groupCallParticipant2.video = groupCallParticipant.video;
                        groupCallParticipant2.presentation = groupCallParticipant.presentation;
                        groupCallParticipant2.source = groupCallParticipant.source;
                        o(groupCallParticipant2, z8);
                        groupCallParticipant.presentationEndpoint = groupCallParticipant2.presentationEndpoint;
                        groupCallParticipant.videoEndpoint = groupCallParticipant2.videoEndpoint;
                        groupCallParticipant.videoIndex = groupCallParticipant2.videoIndex;
                    }
                } else {
                    if (groupCallParticipant.just_joined) {
                        if (B1 != j5) {
                            j3 = B1;
                        }
                        TLRPC.GroupCall groupCall2 = this.b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (w01.a) {
                                fa4.b("new participant, just joined, reload call");
                            }
                            z3 = true;
                        } else if (w01.a) {
                            fa4.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (B1 == j5 || arrayList.size() < 20 || groupCallParticipant.date <= i || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(groupCallParticipant, B1);
                    o(groupCallParticipant, true);
                }
                if (B1 == j5 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
                }
                z5 = true;
            }
            if (B1 == j5) {
                z7 = true;
            }
            i7++;
            j2 = j4;
            size2 = i8;
            i6 = j5;
            elapsedRealtime = j;
            z2 = true;
            z4 = true;
        }
        int i14 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.b;
        if (i14 > groupCall3.version) {
            groupCall3.version = i14;
            if (!z) {
                s();
            }
        }
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        if (w01.a) {
            b00.p(this.b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z3 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = h(this.a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new ac2(this, (byte) 0));
        }
        if (z4) {
            if (z5) {
                B();
            }
            kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.valueOf(z7), Long.valueOf(j3));
        }
        if (z6) {
            kk7.f(this.C.a).k(kk7.x2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void r(int i, ArrayList arrayList) {
        kk7.f(this.C.a).k(kk7.A2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            Long l = (Long) arrayList.get(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l.longValue());
            if (groupCallParticipant != null) {
                if (i - groupCallParticipant.lastTypingDate > 10) {
                    if (groupCallParticipant.lastVisibleDate != i) {
                        groupCallParticipant.active_date = i;
                    }
                    groupCallParticipant.lastTypingDate = i;
                    z = true;
                }
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(l);
            }
        }
        if (arrayList2 != null) {
            m(arrayList2, true, null);
        }
        if (z) {
            B();
            kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void s() {
        char c;
        sa saVar = new sa((byte) 25);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, saVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i = this.b.version;
                int i2 = i + 1;
                int i3 = tL_updateGroupCallParticipants.version;
                if (i2 != i3 && i != i3) {
                    if (i < i3) {
                        c = 1;
                    } else {
                        c = 2;
                    }
                } else {
                    c = 0;
                }
                if (c == 0) {
                    q(tL_updateGroupCallParticipants, true);
                    arrayList.remove(0);
                    z = true;
                } else if (c == 1) {
                    if (this.I != 0 && (z || Math.abs(System.currentTimeMillis() - this.I) <= 1500)) {
                        if (w01.a) {
                            fa4.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                        }
                        if (z) {
                            this.I = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    if (w01.a) {
                        fa4.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                    }
                    this.I = 0L;
                    arrayList.clear();
                    this.s = null;
                    l(true);
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (w01.a) {
                fa4.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void t() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = h(this.a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupcall, new ac2(this, (byte) 3));
    }

    public final void u(long j) {
        this.n.remove(Long.valueOf(j));
        this.j.remove(Long.valueOf(j));
        B();
        kk7.f(this.C.a).k(kk7.v2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void v(j5 j5Var, long j, TL_phone.groupCall groupcall) {
        boolean z;
        this.c = j;
        this.C = j5Var;
        TLRPC.GroupCall groupCall = this.b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        apb.a(groupCall, groupCall2);
        this.b = groupCall2;
        int i = groupCall2.record_start_date;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        int size = groupcall.participants.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i2);
            this.d.k(groupCallParticipant, k27.B1(groupCallParticipant.peer));
            this.e.add(groupCallParticipant);
            o(groupCallParticipant, true);
        }
        B();
        this.s = groupcall.participants_next_offset;
        l(true);
        f();
        if (this.b.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void w(j5 j5Var, TLRPC.GroupCall groupCall) {
        boolean z;
        this.c = 0L;
        this.C = j5Var;
        apb.a(this.b, groupCall);
        this.b = groupCall;
        if (groupCall.record_start_date != 0) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        B();
        l(true);
        f();
        if (groupCall.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void x() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.C.a && sharedInstance.getChat() != null && sharedInstance.getChat().id == (-this.c)) {
            sharedInstance.setParticipantsVolume();
        }
    }

    public final void y(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = y6c.h(this.C.a).e();
        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.J = tL_peerUser2;
            tL_peerUser2.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.J = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        } else {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.J = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        }
    }

    public final void z(String str) {
        TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
        editgroupcalltitle.call = h(this.a);
        editgroupcalltitle.title = str;
        ConnectionsManager.getInstance(this.C.a).sendRequest(editgroupcalltitle, new ac2(this, (byte) 1));
    }
}
