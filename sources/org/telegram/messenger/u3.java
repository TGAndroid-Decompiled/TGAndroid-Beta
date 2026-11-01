package org.telegram.messenger;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.a50;
public final class u3 {
    public static int R;
    public v3 A;
    public boolean B;
    public c C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean f18360a;
    public TLRPC.GroupCall f18361b;
    public long f18362c;
    public String f18375s;
    public boolean f18376t;
    public boolean f18377u;
    public boolean v;
    public boolean f18378w;
    public boolean f18379x;
    public int f18380y;
    public v3 f18381z;
    public a0.h d = new a0.h();
    public final ArrayList e = new ArrayList();
    public final ArrayList f18363f = new ArrayList();
    public final ArrayList f18364g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f18365i = new HashMap();
    public final ArrayList f18366j = new ArrayList();
    public final HashMap f18367k = new HashMap();
    public final ArrayList f18368l = new ArrayList();
    public final ArrayList f18369m = new ArrayList();
    public final HashSet f18370n = new HashSet();
    public final ArrayList f18371o = new ArrayList();
    public final SparseArray f18372p = new SparseArray();
    public final SparseArray f18373q = new SparseArray();
    public final SparseArray f18374r = new SparseArray();
    public final o3 D = new o3(this, 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final a0.h P = new a0.h();
    public final s3 Q = new s3(this);

    public static boolean C(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, u3 u3Var) {
        VoIPService sharedInstance;
        v3 v3Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            if (sharedInstance.getVideoState(z10) != 2) {
                return false;
            }
            return true;
        }
        v3 v3Var2 = u3Var.A;
        if ((v3Var2 != null && v3Var2.f18588a == groupCallParticipant) || (((v3Var = u3Var.f18381z) != null && v3Var.f18588a == groupCallParticipant) || u3Var.d.f(kj.C1(groupCallParticipant.peer)) != null)) {
            if (z10) {
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

    public static boolean i(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2) {
        if (tL_groupCallParticipantVideo == null && tL_groupCallParticipantVideo2 != null) {
            return false;
        }
        if (tL_groupCallParticipantVideo == null || tL_groupCallParticipantVideo2 != null) {
            if (tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo2 != null) {
                if (TextUtils.equals(tL_groupCallParticipantVideo.endpoint, tL_groupCallParticipantVideo2.endpoint) && tL_groupCallParticipantVideo.source_groups.size() == tL_groupCallParticipantVideo2.source_groups.size()) {
                    int size = tL_groupCallParticipantVideo.source_groups.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i10);
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i10);
                        if (TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) && tL_groupCallParticipantVideoSourceGroup.sources.size() == tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                            int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                if (tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i11))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void A(int i10, String str) {
        boolean z10;
        this.f18378w = !this.f18378w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = g(this.f18360a);
        togglegroupcallrecord.start = this.f18378w;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i10 == 1 || i10 == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            togglegroupcallrecord.video_portrait = z10;
        }
        ConnectionsManager.getInstance(this.C.f15043a).sendRequest(togglegroupcallrecord, new m3(this, 2));
        at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
    }

    public final void B() {
        z();
        at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE, 0L);
    }

    public final void a(long j10) {
        if (this.d.f(j10) == null) {
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.f18370n;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(j10));
                this.f18366j.add(Long.valueOf(j10));
                this.f18371o.remove(Long.valueOf(j10));
                z();
                at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
            }
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        long h = h();
        if (this.d.h(h) < 0) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            tL_groupCallParticipant.peer = this.J;
            tL_groupCallParticipant.muted = true;
            tL_groupCallParticipant.self = true;
            tL_groupCallParticipant.video_joined = this.f18361b.can_start_video;
            TLRPC.Chat L0 = wp.r1(this.C.f15043a).L0(Long.valueOf(this.f18362c));
            if (this.f18361b.join_muted && !w3.w(14, L0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            tL_groupCallParticipant.can_self_unmute = z11;
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.f15043a).getCurrentTime();
            if (w3.w(14, L0) || !w3.T(L0) || L0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f15043a).getCurrentTime();
            }
            if (h > 0) {
                TLRPC.UserFull a2 = wp.r1(this.C.f15043a).a2(h);
                if (a2 != null) {
                    tL_groupCallParticipant.about = a2.about;
                }
            } else {
                TLRPC.ChatFull M0 = wp.r1(this.C.f15043a).M0(-h);
                if (M0 != null) {
                    tL_groupCallParticipant.about = M0.about;
                }
            }
            this.d.k(tL_groupCallParticipant, h);
            this.e.add(tL_groupCallParticipant);
            z();
            if (z10) {
                at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        if (!this.f18379x || (((sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall != this || (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(true) != 2)) && this.f18380y >= this.f18361b.unmuted_video_limit)) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z10 = this.E;
        o3 o3Var = this.D;
        if (z10) {
            i0.r(o3Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.f15043a).getCurrentTime();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
            int i12 = currentTime - groupCallParticipant.active_date;
            if (i12 < 5) {
                i10 = Math.min(i12, i10);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            i0.h3(o3Var, i10 * 1000);
            this.E = true;
        }
    }

    public final void e() {
        if (this.f18381z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.f18362c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.f18381z = new v3(tL_groupCallParticipant, false);
    }

    public final void f(List list) {
        TLRPC.GroupCallParticipant tL_groupCallParticipant;
        if (this.B && this.A != null) {
            return;
        }
        v3 v3Var = this.A;
        if (v3Var != null) {
            tL_groupCallParticipant = v3Var.f18588a;
        } else {
            tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        }
        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
        tL_groupCallParticipant.peer = tL_peerChat;
        tL_peerChat.channel_id = this.f18362c;
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
        this.A = new v3(tL_groupCallParticipant, false);
        z();
        i0.g3(new o3(this, 0));
    }

    public final TLRPC.InputGroupCall g(boolean z10) {
        TLRPC.GroupCall groupCall = this.f18361b;
        if (groupCall == null) {
            return null;
        }
        if (z10) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) sc.e.g(1, Uri.parse(this.f18361b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.f18361b;
        tL_inputGroupCall.f19811id = groupCall2.f19804id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long h() {
        TLRPC.Peer peer = this.J;
        if (peer != null) {
            return kj.C1(peer);
        }
        return e20.i(this.C.f15043a).e();
    }

    public final boolean j() {
        if ((this.f18361b.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void k(boolean z10) {
        int i10;
        if (z10) {
            if (!this.v) {
                this.f18376t = false;
                this.f18375s = null;
            } else {
                return;
            }
        }
        if (!this.f18376t && this.e.size() <= 5000) {
            if (z10) {
                this.v = true;
            }
            this.f18377u = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f18360a);
            String str = this.f18375s;
            if (str == null) {
                str = "";
            }
            getgroupparticipants.offset = str;
            if (this.f18360a) {
                i10 = wp.r1(this.C.f15043a).Q6;
            } else {
                i10 = 20;
            }
            getgroupparticipants.limit = i10;
            ConnectionsManager.getInstance(this.C.f15043a).sendRequest(getgroupparticipants, new q3(this, z10, getgroupparticipants, 0));
        }
    }

    public final void l(final ArrayList arrayList, boolean z10, final org.telegram.messenger.voip.d0 d0Var) {
        HashSet hashSet;
        if (z10) {
            hashSet = this.K;
        } else {
            hashSet = this.L;
        }
        final HashSet hashSet2 = hashSet;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            if (hashSet2.contains(arrayList.get(i10))) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final int i11 = this.F + 1;
        this.F = i11;
        this.G.add(Integer.valueOf(i11));
        hashSet2.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = g(this.f18360a);
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            long longValue = ((Long) arrayList.get(i12)).longValue();
            if (z10) {
                getgroupparticipants.ids.add(wp.r1(this.C.f15043a).i1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.f15043a).sendRequest(getgroupparticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                i0.g3(new m4.a1(u3.this, i11, tLObject, d0Var, arrayList, hashSet2, 1));
            }
        });
    }

    public final void m(ArrayList arrayList, boolean z10, String str, String str2, int i10, int i11) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(h());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.e;
        a0.h hVar = null;
        if (isEmpty) {
            if (this.d.m() != 0) {
                hVar = this.d;
                this.d = new a0.h();
            } else {
                this.d.b();
            }
            arrayList2.clear();
            this.f18372p.clear();
            this.f18373q.clear();
            this.f18374r.clear();
            this.G.clear();
        }
        this.f18375s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.f18375s)) {
            this.f18376t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.f18361b;
            groupCall.version = i10;
            groupCall.participants_count = i11;
            if (v2.f18578a) {
                i0.a.p(this.f18361b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        at.f(this.C.f15043a).k(at.B2, Long.valueOf(elapsedRealtime));
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 <= size; i12++) {
            if (i12 == size) {
                if (z10 && groupCallParticipant3 != null && !z11) {
                    groupCallParticipant = groupCallParticipant3;
                }
            } else {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i12);
                if (groupCallParticipant.self) {
                    z11 = true;
                }
            }
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(kj.C1(groupCallParticipant.peer));
            if (groupCallParticipant4 != null) {
                arrayList2.remove(groupCallParticipant4);
                n(groupCallParticipant4, false);
                if (groupCallParticipant4.self) {
                    groupCallParticipant.lastTypingDate = groupCallParticipant4.active_date;
                } else {
                    groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                }
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                }
            } else if (hVar != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) hVar.f(kj.C1(groupCallParticipant.peer))) != null) {
                if (groupCallParticipant2.self) {
                    groupCallParticipant.lastTypingDate = groupCallParticipant2.active_date;
                } else {
                    groupCallParticipant.lastTypingDate = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                }
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = groupCallParticipant.lastTypingDate;
                } else {
                    groupCallParticipant.active_date = groupCallParticipant2.active_date;
                }
            }
            this.d.k(groupCallParticipant, kj.C1(groupCallParticipant.peer));
            arrayList2.add(groupCallParticipant);
            n(groupCallParticipant, true);
        }
        if (this.f18361b.participants_count < this.d.m()) {
            this.f18361b.participants_count = this.d.m();
        }
        z();
        at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
        w();
    }

    public final void n(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        SparseArray sparseArray;
        int i10;
        int i11 = groupCallParticipant.source;
        SparseArray sparseArray2 = this.f18372p;
        if (i11 != 0) {
            if (z10) {
                sparseArray2.put(i11, groupCallParticipant);
            } else {
                sparseArray2.remove(i11);
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                tL_groupCallParticipantVideo = groupCallParticipant.video;
            } else {
                tL_groupCallParticipantVideo = groupCallParticipant.presentation;
            }
            if (tL_groupCallParticipantVideo != null) {
                if ((2 & tL_groupCallParticipantVideo.flags) != 0 && (i10 = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z10) {
                        sparseArray2.put(i10, groupCallParticipant);
                    } else {
                        sparseArray2.remove(i10);
                    }
                }
                if (i12 == 0) {
                    sparseArray = this.f18373q;
                } else {
                    sparseArray = this.f18374r;
                }
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i13);
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i14).intValue();
                        if (z10) {
                            sparseArray.put(intValue, groupCallParticipant);
                        } else {
                            sparseArray.remove(intValue);
                        }
                    }
                }
                if (z10) {
                    if (i12 == 0) {
                        groupCallParticipant.videoEndpoint = tL_groupCallParticipantVideo.endpoint;
                    } else {
                        groupCallParticipant.presentationEndpoint = tL_groupCallParticipantVideo.endpoint;
                    }
                } else if (i12 == 0) {
                    groupCallParticipant.videoEndpoint = null;
                } else {
                    groupCallParticipant.presentationEndpoint = null;
                }
            }
        }
    }

    public final void o(TLRPC.GroupCall groupCall) {
        boolean z10;
        if (this.f18361b.version < groupCall.version) {
            this.f18375s = null;
            k(true);
        }
        sf.d.a(this.f18361b, groupCall);
        this.f18361b = groupCall;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(h());
        if (this.f18361b.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18378w = z10;
        at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
    }

    public final void p(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z10) {
        int i10;
        long j10;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        long j11 = 0;
        boolean z12 = true;
        if (!z10) {
            int size = tL_updateGroupCallParticipants.participants.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (tL_updateGroupCallParticipants.participants.get(i11).versioned) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11 && this.f18361b.version + 1 < tL_updateGroupCallParticipants.version) {
                if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                    this.f18375s = null;
                    k(true);
                    return;
                }
                if (this.I == 0) {
                    this.I = System.currentTimeMillis();
                }
                if (v2.f18578a) {
                    i0.a.p(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                }
                this.H.add(tL_updateGroupCallParticipants);
                if (this.M == null) {
                    o3 o3Var = new o3(this, 2);
                    this.M = o3Var;
                    i0.h3(o3Var, 1500L);
                    return;
                }
                return;
            } else if (z11 && tL_updateGroupCallParticipants.version < this.f18361b.version) {
                if (v2.f18578a) {
                    f8.b("ignore processParticipantsUpdate because of version");
                    return;
                }
                return;
            }
        }
        long h = h();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            i10 = ((TLRPC.GroupCallParticipant) i0.a.g(1, arrayList)).date;
        } else {
            i10 = 0;
        }
        at.f(this.C.f15043a).k(at.B2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j12 = 0;
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (i12 < size2) {
            long j13 = j11;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i12);
            boolean z18 = z12;
            long C1 = kj.C1(groupCallParticipant.peer);
            if (v2.f18578a) {
                StringBuilder s10 = a1.g.s(C1, "process participant ", " left = ");
                s10.append(groupCallParticipant.left);
                s10.append(" versioned ");
                s10.append(groupCallParticipant.versioned);
                s10.append(" flags = ");
                s10.append(groupCallParticipant.flags);
                s10.append(" self = ");
                s10.append(h);
                s10.append(" volume = ");
                i0.a.p(groupCallParticipant.volume, s10);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(C1);
            boolean z19 = groupCallParticipant.left;
            int i13 = size2;
            long j14 = h;
            a0.h hVar = this.P;
            if (z19) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.f18361b.version) {
                    if (v2.f18578a) {
                        f8.b("unknowd participant left, reload call");
                    }
                    z13 = z18;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(C1);
                    n(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.f18364g.remove(groupCallParticipant2);
                    if (hVar.g(null, C1) != null) {
                        if (C1 > j13) {
                            j10 = elapsedRealtime;
                            TLRPC.User Z1 = wp.r1(this.C.f15043a).Z1(Long.valueOf(C1));
                            StringBuilder s11 = a1.g.s(C1, "left remove from speaking ", " ");
                            if (Z1 == null) {
                                str4 = null;
                            } else {
                                str4 = Z1.first_name;
                            }
                            s11.append(str4);
                            Log.d("GroupCall", s11.toString());
                        } else {
                            j10 = elapsedRealtime;
                            TLRPC.Chat L0 = wp.r1(this.C.f15043a).L0(Long.valueOf(-C1));
                            StringBuilder s12 = a1.g.s(C1, "left remove from speaking ", " ");
                            if (L0 == null) {
                                str3 = null;
                            } else {
                                str3 = L0.title;
                            }
                            s12.append(str3);
                            Log.d("GroupCall", s12.toString());
                        }
                        hVar.l(C1);
                        z16 = z18;
                    } else {
                        j10 = elapsedRealtime;
                    }
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f18363f;
                        if (i14 >= arrayList2.size()) {
                            break;
                        }
                        if (kj.C1(((v3) arrayList2.get(i14)).f18588a.peer) == kj.C1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                } else {
                    j10 = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.f18361b;
                int i15 = groupCall.participants_count - 1;
                groupCall.participants_count = i15;
                if (i15 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j10 = elapsedRealtime;
                Long valueOf = Long.valueOf(C1);
                HashSet hashSet = this.f18370n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(C1);
                    hashSet.remove(valueOf2);
                    this.f18366j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (v2.f18578a) {
                        f8.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && hVar.g(null, C1) != null) {
                        hVar.l(C1);
                        if (C1 > j13) {
                            TLRPC.User Z12 = wp.r1(this.C.f15043a).Z1(Long.valueOf(C1));
                            StringBuilder s13 = a1.g.s(C1, "muted remove from speaking ", " ");
                            if (Z12 == null) {
                                str2 = null;
                            } else {
                                str2 = Z12.first_name;
                            }
                            s13.append(str2);
                            Log.d("GroupCall", s13.toString());
                        } else {
                            TLRPC.Chat L02 = wp.r1(this.C.f15043a).L0(Long.valueOf(-C1));
                            StringBuilder s14 = a1.g.s(C1, "muted remove from speaking ", " ");
                            if (L02 == null) {
                                str = null;
                            } else {
                                str = L02.title;
                            }
                            s14.append(str);
                            Log.d("GroupCall", s14.toString());
                        }
                        z16 = z18;
                    }
                    if (!groupCallParticipant.min) {
                        groupCallParticipant2.volume = groupCallParticipant.volume;
                        groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                    } else {
                        int i16 = groupCallParticipant.flags;
                        if ((i16 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                            groupCallParticipant.flags = i16 & (-129);
                        }
                        if (groupCallParticipant.volume_by_admin && groupCallParticipant2.volume_by_admin) {
                            groupCallParticipant2.volume = groupCallParticipant.volume;
                        }
                    }
                    groupCallParticipant2.flags = groupCallParticipant.flags;
                    groupCallParticipant2.can_self_unmute = groupCallParticipant.can_self_unmute;
                    groupCallParticipant2.video_joined = groupCallParticipant.video_joined;
                    if (groupCallParticipant2.raise_hand_rating == j13 && groupCallParticipant.raise_hand_rating != j13) {
                        groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                    groupCallParticipant2.date = groupCallParticipant.date;
                    int max = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                    groupCallParticipant2.lastTypingDate = max;
                    if (j10 != groupCallParticipant2.lastVisibleDate) {
                        groupCallParticipant2.active_date = max;
                    }
                    if (groupCallParticipant2.source == groupCallParticipant.source && i(groupCallParticipant2.video, groupCallParticipant.video) && i(groupCallParticipant2.presentation, groupCallParticipant.presentation)) {
                        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                        if (tL_groupCallParticipantVideo2 != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            tL_groupCallParticipantVideo2.paused = tL_groupCallParticipantVideo.paused;
                        }
                    } else {
                        n(groupCallParticipant2, false);
                        groupCallParticipant2.video = groupCallParticipant.video;
                        groupCallParticipant2.presentation = groupCallParticipant.presentation;
                        groupCallParticipant2.source = groupCallParticipant.source;
                        n(groupCallParticipant2, z18);
                        groupCallParticipant.presentationEndpoint = groupCallParticipant2.presentationEndpoint;
                        groupCallParticipant.videoEndpoint = groupCallParticipant2.videoEndpoint;
                        groupCallParticipant.videoIndex = groupCallParticipant2.videoIndex;
                    }
                } else {
                    if (groupCallParticipant.just_joined) {
                        if (C1 != j14) {
                            j12 = C1;
                        }
                        TLRPC.GroupCall groupCall2 = this.f18361b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (v2.f18578a) {
                                f8.b("new participant, just joined, reload call");
                            }
                            z13 = true;
                        } else if (v2.f18578a) {
                            f8.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j13) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (C1 == j14 || arrayList.size() < 20 || groupCallParticipant.date <= i10 || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.f18376t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(groupCallParticipant, C1);
                    n(groupCallParticipant, true);
                }
                if (C1 == j14 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f15043a).getCurrentTime();
                }
                z15 = true;
            }
            if (C1 == j14) {
                z17 = true;
            }
            i12++;
            j11 = j13;
            size2 = i13;
            h = j14;
            elapsedRealtime = j10;
            z12 = true;
            z14 = true;
        }
        int i17 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.f18361b;
        if (i17 > groupCall3.version) {
            groupCall3.version = i17;
            if (!z10) {
                r();
            }
        }
        if (this.f18361b.participants_count < this.d.m()) {
            this.f18361b.participants_count = this.d.m();
        }
        if (v2.f18578a) {
            i0.a.p(this.f18361b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z13 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f18360a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.f15043a).sendRequest(getgroupparticipants, new m3(this, 0));
        }
        if (z14) {
            if (z15) {
                z();
            }
            at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.valueOf(z17), Long.valueOf(j12));
        }
        if (z16) {
            at.f(this.C.f15043a).k(at.f14823y2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
        }
    }

    public final void q(int i10, ArrayList arrayList) {
        at.f(this.C.f15043a).k(at.B2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            Long l4 = (Long) arrayList.get(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l4.longValue());
            if (groupCallParticipant != null) {
                if (i10 - groupCallParticipant.lastTypingDate > 10) {
                    if (groupCallParticipant.lastVisibleDate != i10) {
                        groupCallParticipant.active_date = i10;
                    }
                    groupCallParticipant.lastTypingDate = i10;
                    z10 = true;
                }
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(l4);
            }
        }
        if (arrayList2 != null) {
            l(arrayList2, true, null);
        }
        if (z10) {
            z();
            at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
        }
    }

    public final void r() {
        char c10;
        a4.d dVar = new a4.d(15);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, dVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z10 = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i10 = this.f18361b.version;
                int i11 = i10 + 1;
                int i12 = tL_updateGroupCallParticipants.version;
                if (i11 != i12 && i10 != i12) {
                    if (i10 < i12) {
                        c10 = 1;
                    } else {
                        c10 = 2;
                    }
                } else {
                    c10 = 0;
                }
                if (c10 == 0) {
                    p(tL_updateGroupCallParticipants, true);
                    arrayList.remove(0);
                    z10 = true;
                } else if (c10 == 1) {
                    if (this.I != 0 && (z10 || Math.abs(System.currentTimeMillis() - this.I) <= 1500)) {
                        if (v2.f18578a) {
                            f8.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                        }
                        if (z10) {
                            this.I = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    if (v2.f18578a) {
                        f8.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                    }
                    this.I = 0L;
                    arrayList.clear();
                    this.f18375s = null;
                    k(true);
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (v2.f18578a) {
                f8.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void s() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = g(this.f18360a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.f15043a).sendRequest(getgroupcall, new m3(this, 3));
    }

    public final void t(long j10) {
        this.f18370n.remove(Long.valueOf(j10));
        this.f18366j.remove(Long.valueOf(j10));
        z();
        at.f(this.C.f15043a).k(at.f14809w2, Long.valueOf(this.f18362c), Long.valueOf(this.f18361b.f19804id), Boolean.FALSE);
    }

    public final void u(c cVar, long j10, TL_phone.groupCall groupcall) {
        boolean z10;
        this.f18362c = j10;
        this.C = cVar;
        TLRPC.GroupCall groupCall = this.f18361b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        sf.d.a(groupCall, groupCall2);
        this.f18361b = groupCall2;
        int i10 = groupCall2.record_start_date;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18378w = z10;
        int size = groupcall.participants.size();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i12);
            this.d.k(groupCallParticipant, kj.C1(groupCallParticipant.peer));
            this.e.add(groupCallParticipant);
            n(groupCallParticipant, true);
            i11 = Math.min(i11, groupCallParticipant.date);
        }
        z();
        this.f18375s = groupcall.participants_next_offset;
        k(true);
        e();
        if (this.f18361b.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void v(c cVar, TLRPC.GroupCall groupCall) {
        boolean z10;
        this.f18362c = 0L;
        this.C = cVar;
        sf.d.a(this.f18361b, groupCall);
        this.f18361b = groupCall;
        if (groupCall.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18378w = z10;
        z();
        k(true);
        e();
        if (groupCall.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.C.f15043a && sharedInstance.getChat() != null && sharedInstance.getChat().f19794id == (-this.f18362c)) {
            sharedInstance.setParticipantsVolume();
        }
    }

    public final void x(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = e20.i(this.C.f15043a).e();
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

    public final boolean y() {
        TLRPC.GroupCall groupCall = this.f18361b;
        if (groupCall.participants_count <= 0 && !groupCall.rtmp_stream && !j()) {
            return false;
        }
        return true;
    }

    public final void z() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i10;
        String str;
        int size;
        String str2;
        v3 v3Var;
        char c10;
        boolean z10;
        int i11;
        ArrayList arrayList3 = this.f18363f;
        arrayList3.clear();
        ArrayList arrayList4 = this.f18364g;
        arrayList4.clear();
        TLRPC.Chat L0 = wp.r1(this.C.f15043a).L0(Long.valueOf(this.f18362c));
        final boolean w9 = w3.w(14, L0);
        v3 v3Var2 = this.A;
        if (v3Var2 != null) {
            arrayList3.add(v3Var2);
        }
        final long h = h();
        VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(h);
        this.f18379x = true;
        int i12 = 0;
        this.f18380y = 0;
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.e;
            int size2 = arrayList.size();
            arrayList2 = this.f18371o;
            if (i13 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i13);
            boolean C = C(groupCallParticipant3, false, this);
            boolean C2 = C(groupCallParticipant3, true, this);
            if (!groupCallParticipant3.self && (C || C2)) {
                this.f18380y++;
            }
            if (arrayList2.contains(Long.valueOf(o5.o(groupCallParticipant3.peer)))) {
                arrayList.remove(i13);
                i13--;
            }
            if (!C && !C2) {
                if (groupCallParticipant3.self || !this.f18379x || (groupCallParticipant3.video == null && groupCallParticipant3.presentation == null)) {
                    groupCallParticipant3.videoIndex = 0;
                }
            } else {
                if (this.f18379x) {
                    if (groupCallParticipant3.videoIndex == 0) {
                        if (groupCallParticipant3.self) {
                            groupCallParticipant3.videoIndex = Integer.MAX_VALUE;
                        } else {
                            int i14 = R + 1;
                            R = i14;
                            groupCallParticipant3.videoIndex = i14;
                        }
                    }
                } else {
                    groupCallParticipant3.videoIndex = 0;
                }
                z11 = true;
            }
            i13++;
        }
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(java.lang.Object r11, java.lang.Object r12) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.p3.compare(java.lang.Object, java.lang.Object):int");
                }
            });
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            groupCallParticipant = null;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) i0.a.g(1, arrayList);
        }
        char c11 = 2;
        if ((C(groupCallParticipant, false, this) || C(groupCallParticipant, true, this)) && (i10 = this.f18361b.unmuted_video_count) > this.f18380y) {
            this.f18380y = i10;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.f18380y--;
            }
        }
        int i15 = 5000;
        if (arrayList.size() > 5000 && (!w3.w(14, L0) || groupCallParticipant.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i16 = 5000;
            while (i16 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i15);
                char c12 = c11;
                if (groupCallParticipant4.raise_hand_rating != 0) {
                    c10 = c12;
                    z10 = z11;
                    i11 = 5000;
                } else {
                    n(groupCallParticipant4, false);
                    c10 = c12;
                    z10 = z11;
                    this.d.l(kj.C1(groupCallParticipant4.peer));
                    i11 = 5000;
                    arrayList.remove(5000);
                }
                i16++;
                z11 = z10;
                i15 = i11;
                c11 = c10;
            }
        }
        boolean z12 = z11;
        d();
        if (!this.f18379x && z12 && (v3Var = this.f18381z) != null) {
            arrayList3.add(v3Var);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i18);
            if (this.f18379x && groupCallParticipant5.videoIndex != 0) {
                boolean z13 = groupCallParticipant5.self;
                HashMap hashMap = this.f18365i;
                if (!z13 && C(groupCallParticipant5, true, this) && C(groupCallParticipant5, false, this)) {
                    v3 v3Var3 = (v3) hashMap.get(groupCallParticipant5.videoEndpoint);
                    if (v3Var3 == null) {
                        v3Var3 = new v3(groupCallParticipant5, false);
                        hashMap.put(groupCallParticipant5.videoEndpoint, v3Var3);
                    } else {
                        v3Var3.f18588a = groupCallParticipant5;
                        v3Var3.f18589b = false;
                    }
                    v3 v3Var4 = (v3) hashMap.get(groupCallParticipant5.presentationEndpoint);
                    if (v3Var4 == null) {
                        v3Var4 = new v3(groupCallParticipant5, true);
                    } else {
                        v3Var4.f18588a = groupCallParticipant5;
                        v3Var4.f18589b = true;
                    }
                    arrayList3.add(v3Var3);
                    if (v3Var3.f18590c > 1.0f) {
                        i17 = arrayList3.size() - 1;
                    }
                    arrayList3.add(v3Var4);
                    if (v3Var4.f18590c > 1.0f) {
                        size = arrayList3.size();
                        i17 = size - 1;
                    }
                } else if (groupCallParticipant5.self) {
                    if (C(groupCallParticipant5, true, this)) {
                        arrayList3.add(new v3(groupCallParticipant5, true));
                    }
                    if (C(groupCallParticipant5, false, this)) {
                        arrayList3.add(new v3(groupCallParticipant5, false));
                    }
                } else {
                    boolean C3 = C(groupCallParticipant5, true, this);
                    if (C3) {
                        str = groupCallParticipant5.presentationEndpoint;
                    } else {
                        str = groupCallParticipant5.videoEndpoint;
                    }
                    v3 v3Var5 = (v3) hashMap.get(str);
                    if (v3Var5 == null) {
                        v3Var5 = new v3(groupCallParticipant5, C3);
                        if (C3) {
                            str2 = groupCallParticipant5.presentationEndpoint;
                        } else {
                            str2 = groupCallParticipant5.videoEndpoint;
                        }
                        hashMap.put(str2, v3Var5);
                    } else {
                        v3Var5.f18588a = groupCallParticipant5;
                        v3Var5.f18589b = C3;
                    }
                    arrayList3.add(v3Var5);
                    if (v3Var5.f18590c > 1.0f) {
                        size = arrayList3.size();
                        i17 = size - 1;
                    }
                }
            } else {
                arrayList4.add(groupCallParticipant5);
            }
        }
        int size4 = arrayList.size();
        int i19 = 0;
        while (i19 < size4) {
            TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i19);
            i19++;
            arrayList2.remove(Long.valueOf(o5.o(groupCallParticipant6.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.f18361b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i20 = 0;
            while (i20 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i20);
                i20++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(o5.o(groupCallParticipant7.peer)));
            }
            ArrayList arrayList5 = this.f18368l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.f18369m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i12 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant8 = arrayList.get(i12);
                i12++;
                long o10 = o5.o(groupCallParticipant8.peer);
                Long valueOf = Long.valueOf(o10);
                HashSet hashSet = this.f18370n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(o10));
                    this.f18366j.remove(Long.valueOf(o10));
                }
            }
        }
        if (!a50.f35575w5 && arrayList3.size() % 2 == 1) {
            arrayList3.add((v3) arrayList3.remove(i17));
        }
    }
}
