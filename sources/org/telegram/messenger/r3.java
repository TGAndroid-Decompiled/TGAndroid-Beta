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
import org.telegram.ui.x30;
public final class r3 {
    public static int R;
    public s3 A;
    public boolean B;
    public c C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean f25048a;
    public TLRPC.GroupCall f25049b;
    public long f25050c;
    public String f25064s;
    public boolean f25065t;
    public boolean f25066u;
    public boolean v;
    public boolean f25067w;
    public boolean f25068x;
    public int f25069y;
    public s3 f25070z;
    public a0.h d = new a0.h();
    public final ArrayList f25051e = new ArrayList();
    public final ArrayList f25052f = new ArrayList();
    public final ArrayList f25053g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f25054i = new HashMap();
    public final ArrayList f25055j = new ArrayList();
    public final HashMap f25056k = new HashMap();
    public final ArrayList f25057l = new ArrayList();
    public final ArrayList f25058m = new ArrayList();
    public final HashSet f25059n = new HashSet();
    public final ArrayList f25060o = new ArrayList();
    public final SparseArray f25061p = new SparseArray();
    public final SparseArray f25062q = new SparseArray();
    public final SparseArray f25063r = new SparseArray();
    public final j3 D = new j3(this, 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final a0.h P = new a0.h();
    public final p3 Q = new p3(this);

    public static boolean C(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, r3 r3Var) {
        VoIPService sharedInstance;
        s3 s3Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            if (sharedInstance.getVideoState(z10) != 2) {
                return false;
            }
            return true;
        }
        s3 s3Var2 = r3Var.A;
        if ((s3Var2 != null && s3Var2.f25270a == groupCallParticipant) || (((s3Var = r3Var.f25070z) != null && s3Var.f25270a == groupCallParticipant) || r3Var.d.f(zi.C1(groupCallParticipant.peer)) != null)) {
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
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i3);
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i3);
                        if (TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) && tL_groupCallParticipantVideoSourceGroup.sources.size() == tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                            int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                if (tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i10))) {
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

    public final void A(int i3, String str) {
        boolean z10;
        this.f25067w = !this.f25067w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = g(this.f25048a);
        togglegroupcallrecord.start = this.f25067w;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i3 == 1 || i3 == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            togglegroupcallrecord.video_portrait = z10;
        }
        ConnectionsManager.getInstance(this.C.f21919a).sendRequest(togglegroupcallrecord, new k3(this, 2));
        hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
    }

    public final void B() {
        z();
        hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE, 0L);
    }

    public final void a(long j10) {
        if (this.d.f(j10) == null) {
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.f25059n;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(j10));
                this.f25055j.add(Long.valueOf(j10));
                this.f25060o.remove(Long.valueOf(j10));
                z();
                hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
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
            tL_groupCallParticipant.video_joined = this.f25049b.can_start_video;
            TLRPC.Chat M0 = hp.s1(this.C.f21919a).M0(Long.valueOf(this.f25050c));
            if (this.f25049b.join_muted && !t3.w(14, M0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            tL_groupCallParticipant.can_self_unmute = z11;
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.f21919a).getCurrentTime();
            if (t3.w(14, M0) || !t3.T(M0) || M0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f21919a).getCurrentTime();
            }
            if (h > 0) {
                TLRPC.UserFull b22 = hp.s1(this.C.f21919a).b2(h);
                if (b22 != null) {
                    tL_groupCallParticipant.about = b22.about;
                }
            } else {
                TLRPC.ChatFull N0 = hp.s1(this.C.f21919a).N0(-h);
                if (N0 != null) {
                    tL_groupCallParticipant.about = N0.about;
                }
            }
            this.d.k(tL_groupCallParticipant, h);
            this.f25051e.add(tL_groupCallParticipant);
            z();
            if (z10) {
                hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        if (!this.f25068x || (((sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall != this || (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(true) != 2)) && this.f25069y >= this.f25049b.unmuted_video_limit)) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z10 = this.E;
        j3 j3Var = this.D;
        if (z10) {
            g0.r(j3Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.f21919a).getCurrentTime();
        ArrayList arrayList = this.f25051e;
        int size = arrayList.size();
        int i3 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i10);
            int i11 = currentTime - groupCallParticipant.active_date;
            if (i11 < 5) {
                i3 = Math.min(i11, i3);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            g0.i3(j3Var, i3 * 1000);
            this.E = true;
        }
    }

    public final void e() {
        if (this.f25070z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.f25050c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.f25070z = new s3(tL_groupCallParticipant, false);
    }

    public final void f(List list) {
        TLRPC.GroupCallParticipant tL_groupCallParticipant;
        if (this.B && this.A != null) {
            return;
        }
        s3 s3Var = this.A;
        if (s3Var != null) {
            tL_groupCallParticipant = s3Var.f25270a;
        } else {
            tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        }
        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
        tL_groupCallParticipant.peer = tL_peerChat;
        tL_peerChat.channel_id = this.f25050c;
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
        this.A = new s3(tL_groupCallParticipant, false);
        z();
        g0.h3(new j3(this, 0));
    }

    public final TLRPC.InputGroupCall g(boolean z10) {
        TLRPC.GroupCall groupCall = this.f25049b;
        if (groupCall == null) {
            return null;
        }
        if (z10) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) t4.c.d(1, Uri.parse(this.f25049b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.f25049b;
        tL_inputGroupCall.f27018id = groupCall2.f27011id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long h() {
        TLRPC.Peer peer = this.J;
        if (peer != null) {
            return zi.C1(peer);
        }
        return h10.i(this.C.f21919a).e();
    }

    public final boolean j() {
        if ((this.f25049b.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void k(boolean z10) {
        int i3;
        if (z10) {
            if (!this.v) {
                this.f25065t = false;
                this.f25064s = null;
            } else {
                return;
            }
        }
        if (!this.f25065t && this.f25051e.size() <= 5000) {
            if (z10) {
                this.v = true;
            }
            this.f25066u = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f25048a);
            String str = this.f25064s;
            if (str == null) {
                str = "";
            }
            getgroupparticipants.offset = str;
            if (this.f25048a) {
                i3 = hp.s1(this.C.f21919a).P6;
            } else {
                i3 = 20;
            }
            getgroupparticipants.limit = i3;
            ConnectionsManager.getInstance(this.C.f21919a).sendRequest(getgroupparticipants, new n3(this, z10, getgroupparticipants, 0));
        }
    }

    public final void l(final ArrayList arrayList, boolean z10, final ci.i iVar) {
        HashSet hashSet;
        if (z10) {
            hashSet = this.K;
        } else {
            hashSet = this.L;
        }
        final HashSet hashSet2 = hashSet;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            if (hashSet2.contains(arrayList.get(i3))) {
                arrayList.remove(i3);
                i3--;
                size--;
            }
            i3++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final int i10 = this.F + 1;
        this.F = i10;
        this.G.add(Integer.valueOf(i10));
        hashSet2.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = g(this.f25048a);
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (z10) {
                getgroupparticipants.ids.add(hp.s1(this.C.f21919a).j1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.f21919a).sendRequest(getgroupparticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                g0.h3(new cg.k0(r3.this, i10, tLObject, iVar, arrayList, hashSet2));
            }
        });
    }

    public final void m(ArrayList arrayList, boolean z10, String str, String str2, int i3, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(h());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.f25051e;
        a0.h hVar = null;
        if (isEmpty) {
            if (this.d.m() != 0) {
                hVar = this.d;
                this.d = new a0.h();
            } else {
                this.d.b();
            }
            arrayList2.clear();
            this.f25061p.clear();
            this.f25062q.clear();
            this.f25063r.clear();
            this.G.clear();
        }
        this.f25064s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.f25064s)) {
            this.f25065t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.f25049b;
            groupCall.version = i3;
            groupCall.participants_count = i10;
            if (r2.f25040a) {
                k2.p1.q(this.f25049b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hs.f(this.C.f21919a).k(hs.B2, Long.valueOf(elapsedRealtime));
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 <= size; i11++) {
            if (i11 == size) {
                if (z10 && groupCallParticipant3 != null && !z11) {
                    groupCallParticipant = groupCallParticipant3;
                }
            } else {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                if (groupCallParticipant.self) {
                    z11 = true;
                }
            }
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(zi.C1(groupCallParticipant.peer));
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
            } else if (hVar != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) hVar.f(zi.C1(groupCallParticipant.peer))) != null) {
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
            this.d.k(groupCallParticipant, zi.C1(groupCallParticipant.peer));
            arrayList2.add(groupCallParticipant);
            n(groupCallParticipant, true);
        }
        if (this.f25049b.participants_count < this.d.m()) {
            this.f25049b.participants_count = this.d.m();
        }
        z();
        hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
        w();
    }

    public final void n(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        SparseArray sparseArray;
        int i3;
        int i10 = groupCallParticipant.source;
        SparseArray sparseArray2 = this.f25061p;
        if (i10 != 0) {
            if (z10) {
                sparseArray2.put(i10, groupCallParticipant);
            } else {
                sparseArray2.remove(i10);
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                tL_groupCallParticipantVideo = groupCallParticipant.video;
            } else {
                tL_groupCallParticipantVideo = groupCallParticipant.presentation;
            }
            if (tL_groupCallParticipantVideo != null) {
                if ((2 & tL_groupCallParticipantVideo.flags) != 0 && (i3 = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z10) {
                        sparseArray2.put(i3, groupCallParticipant);
                    } else {
                        sparseArray2.remove(i3);
                    }
                }
                if (i11 == 0) {
                    sparseArray = this.f25062q;
                } else {
                    sparseArray = this.f25063r;
                }
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i12);
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i13).intValue();
                        if (z10) {
                            sparseArray.put(intValue, groupCallParticipant);
                        } else {
                            sparseArray.remove(intValue);
                        }
                    }
                }
                if (z10) {
                    if (i11 == 0) {
                        groupCallParticipant.videoEndpoint = tL_groupCallParticipantVideo.endpoint;
                    } else {
                        groupCallParticipant.presentationEndpoint = tL_groupCallParticipantVideo.endpoint;
                    }
                } else if (i11 == 0) {
                    groupCallParticipant.videoEndpoint = null;
                } else {
                    groupCallParticipant.presentationEndpoint = null;
                }
            }
        }
    }

    public final void o(TLRPC.GroupCall groupCall) {
        boolean z10;
        if (this.f25049b.version < groupCall.version) {
            this.f25064s = null;
            k(true);
        }
        dg.d.a(this.f25049b, groupCall);
        this.f25049b = groupCall;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(h());
        if (this.f25049b.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25067w = z10;
        hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
    }

    public final void p(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z10) {
        int i3;
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
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (tL_updateGroupCallParticipants.participants.get(i10).versioned) {
                        z11 = true;
                        break;
                    }
                    i10++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11 && this.f25049b.version + 1 < tL_updateGroupCallParticipants.version) {
                if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                    this.f25064s = null;
                    k(true);
                    return;
                }
                if (this.I == 0) {
                    this.I = System.currentTimeMillis();
                }
                if (r2.f25040a) {
                    k2.p1.q(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                }
                this.H.add(tL_updateGroupCallParticipants);
                if (this.M == null) {
                    j3 j3Var = new j3(this, 2);
                    this.M = j3Var;
                    g0.i3(j3Var, 1500L);
                    return;
                }
                return;
            } else if (z11 && tL_updateGroupCallParticipants.version < this.f25049b.version) {
                if (r2.f25040a) {
                    a8.b("ignore processParticipantsUpdate because of version");
                    return;
                }
                return;
            }
        }
        long h = h();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.f25051e;
        if (!arrayList.isEmpty()) {
            i3 = ((TLRPC.GroupCallParticipant) k2.p1.h(1, arrayList)).date;
        } else {
            i3 = 0;
        }
        hs.f(this.C.f21919a).k(hs.B2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j12 = 0;
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (i11 < size2) {
            long j13 = j11;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i11);
            boolean z18 = z12;
            long C1 = zi.C1(groupCallParticipant.peer);
            if (r2.f25040a) {
                StringBuilder t10 = a1.g.t(C1, "process participant ", " left = ");
                t10.append(groupCallParticipant.left);
                t10.append(" versioned ");
                t10.append(groupCallParticipant.versioned);
                t10.append(" flags = ");
                t10.append(groupCallParticipant.flags);
                t10.append(" self = ");
                t10.append(h);
                t10.append(" volume = ");
                k2.p1.q(groupCallParticipant.volume, t10);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(C1);
            boolean z19 = groupCallParticipant.left;
            int i12 = size2;
            long j14 = h;
            a0.h hVar = this.P;
            if (z19) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.f25049b.version) {
                    if (r2.f25040a) {
                        a8.b("unknowd participant left, reload call");
                    }
                    z13 = z18;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(C1);
                    n(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.f25053g.remove(groupCallParticipant2);
                    if (hVar.g(null, C1) != null) {
                        if (C1 > j13) {
                            j10 = elapsedRealtime;
                            TLRPC.User a22 = hp.s1(this.C.f21919a).a2(Long.valueOf(C1));
                            StringBuilder t11 = a1.g.t(C1, "left remove from speaking ", " ");
                            if (a22 == null) {
                                str4 = null;
                            } else {
                                str4 = a22.first_name;
                            }
                            t11.append(str4);
                            Log.d("GroupCall", t11.toString());
                        } else {
                            j10 = elapsedRealtime;
                            TLRPC.Chat M0 = hp.s1(this.C.f21919a).M0(Long.valueOf(-C1));
                            StringBuilder t12 = a1.g.t(C1, "left remove from speaking ", " ");
                            if (M0 == null) {
                                str3 = null;
                            } else {
                                str3 = M0.title;
                            }
                            t12.append(str3);
                            Log.d("GroupCall", t12.toString());
                        }
                        hVar.l(C1);
                        z16 = z18;
                    } else {
                        j10 = elapsedRealtime;
                    }
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f25052f;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (zi.C1(((s3) arrayList2.get(i13)).f25270a.peer) == zi.C1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i13);
                            i13--;
                        }
                        i13++;
                    }
                } else {
                    j10 = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.f25049b;
                int i14 = groupCall.participants_count - 1;
                groupCall.participants_count = i14;
                if (i14 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j10 = elapsedRealtime;
                Long valueOf = Long.valueOf(C1);
                HashSet hashSet = this.f25059n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(C1);
                    hashSet.remove(valueOf2);
                    this.f25055j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (r2.f25040a) {
                        a8.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && hVar.g(null, C1) != null) {
                        hVar.l(C1);
                        if (C1 > j13) {
                            TLRPC.User a23 = hp.s1(this.C.f21919a).a2(Long.valueOf(C1));
                            StringBuilder t13 = a1.g.t(C1, "muted remove from speaking ", " ");
                            if (a23 == null) {
                                str2 = null;
                            } else {
                                str2 = a23.first_name;
                            }
                            t13.append(str2);
                            Log.d("GroupCall", t13.toString());
                        } else {
                            TLRPC.Chat M02 = hp.s1(this.C.f21919a).M0(Long.valueOf(-C1));
                            StringBuilder t14 = a1.g.t(C1, "muted remove from speaking ", " ");
                            if (M02 == null) {
                                str = null;
                            } else {
                                str = M02.title;
                            }
                            t14.append(str);
                            Log.d("GroupCall", t14.toString());
                        }
                        z16 = z18;
                    }
                    if (!groupCallParticipant.min) {
                        groupCallParticipant2.volume = groupCallParticipant.volume;
                        groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                    } else {
                        int i15 = groupCallParticipant.flags;
                        if ((i15 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                            groupCallParticipant.flags = i15 & (-129);
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
                        TLRPC.GroupCall groupCall2 = this.f25049b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (r2.f25040a) {
                                a8.b("new participant, just joined, reload call");
                            }
                            z13 = true;
                        } else if (r2.f25040a) {
                            a8.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j13) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (C1 == j14 || arrayList.size() < 20 || groupCallParticipant.date <= i3 || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.f25065t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(groupCallParticipant, C1);
                    n(groupCallParticipant, true);
                }
                if (C1 == j14 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f21919a).getCurrentTime();
                }
                z15 = true;
            }
            if (C1 == j14) {
                z17 = true;
            }
            i11++;
            j11 = j13;
            size2 = i12;
            h = j14;
            elapsedRealtime = j10;
            z12 = true;
            z14 = true;
        }
        int i16 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.f25049b;
        if (i16 > groupCall3.version) {
            groupCall3.version = i16;
            if (!z10) {
                r();
            }
        }
        if (this.f25049b.participants_count < this.d.m()) {
            this.f25049b.participants_count = this.d.m();
        }
        if (r2.f25040a) {
            k2.p1.q(this.f25049b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z13 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f25048a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.f21919a).sendRequest(getgroupparticipants, new k3(this, 0));
        }
        if (z14) {
            if (z15) {
                z();
            }
            hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.valueOf(z17), Long.valueOf(j12));
        }
        if (z16) {
            hs.f(this.C.f21919a).k(hs.f23342y2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
        }
    }

    public final void q(int i3, ArrayList arrayList) {
        hs.f(this.C.f21919a).k(hs.B2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Long l10 = (Long) arrayList.get(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l10.longValue());
            if (groupCallParticipant != null) {
                if (i3 - groupCallParticipant.lastTypingDate > 10) {
                    if (groupCallParticipant.lastVisibleDate != i3) {
                        groupCallParticipant.active_date = i3;
                    }
                    groupCallParticipant.lastTypingDate = i3;
                    z10 = true;
                }
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(l10);
            }
        }
        if (arrayList2 != null) {
            l(arrayList2, true, null);
        }
        if (z10) {
            z();
            hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
        }
    }

    public final void r() {
        char c2;
        o0.a aVar = new o0.a(3);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, aVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z10 = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i3 = this.f25049b.version;
                int i10 = i3 + 1;
                int i11 = tL_updateGroupCallParticipants.version;
                if (i10 != i11 && i3 != i11) {
                    if (i3 < i11) {
                        c2 = 1;
                    } else {
                        c2 = 2;
                    }
                } else {
                    c2 = 0;
                }
                if (c2 == 0) {
                    p(tL_updateGroupCallParticipants, true);
                    arrayList.remove(0);
                    z10 = true;
                } else if (c2 == 1) {
                    if (this.I != 0 && (z10 || Math.abs(System.currentTimeMillis() - this.I) <= 1500)) {
                        if (r2.f25040a) {
                            a8.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                        }
                        if (z10) {
                            this.I = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    if (r2.f25040a) {
                        a8.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                    }
                    this.I = 0L;
                    arrayList.clear();
                    this.f25064s = null;
                    k(true);
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (r2.f25040a) {
                a8.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void s() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = g(this.f25048a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.f21919a).sendRequest(getgroupcall, new k3(this, 3));
    }

    public final void t(long j10) {
        this.f25059n.remove(Long.valueOf(j10));
        this.f25055j.remove(Long.valueOf(j10));
        z();
        hs.f(this.C.f21919a).k(hs.f23328w2, Long.valueOf(this.f25050c), Long.valueOf(this.f25049b.f27011id), Boolean.FALSE);
    }

    public final void u(c cVar, long j10, TL_phone.groupCall groupcall) {
        boolean z10;
        this.f25050c = j10;
        this.C = cVar;
        TLRPC.GroupCall groupCall = this.f25049b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        dg.d.a(groupCall, groupCall2);
        this.f25049b = groupCall2;
        int i3 = groupCall2.record_start_date;
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25067w = z10;
        int size = groupcall.participants.size();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i11);
            this.d.k(groupCallParticipant, zi.C1(groupCallParticipant.peer));
            this.f25051e.add(groupCallParticipant);
            n(groupCallParticipant, true);
            i10 = Math.min(i10, groupCallParticipant.date);
        }
        z();
        this.f25064s = groupcall.participants_next_offset;
        k(true);
        e();
        if (this.f25049b.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void v(c cVar, TLRPC.GroupCall groupCall) {
        boolean z10;
        this.f25050c = 0L;
        this.C = cVar;
        dg.d.a(this.f25049b, groupCall);
        this.f25049b = groupCall;
        if (groupCall.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25067w = z10;
        z();
        k(true);
        e();
        if (groupCall.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.C.f21919a && sharedInstance.getChat() != null && sharedInstance.getChat().f27001id == (-this.f25050c)) {
            sharedInstance.setParticipantsVolume();
        }
    }

    public final void x(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = h10.i(this.C.f21919a).e();
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
        TLRPC.GroupCall groupCall = this.f25049b;
        if (groupCall.participants_count <= 0 && !groupCall.rtmp_stream && !j()) {
            return false;
        }
        return true;
    }

    public final void z() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i3;
        String str;
        int size;
        String str2;
        s3 s3Var;
        char c2;
        boolean z10;
        int i10;
        ArrayList arrayList3 = this.f25052f;
        arrayList3.clear();
        ArrayList arrayList4 = this.f25053g;
        arrayList4.clear();
        TLRPC.Chat M0 = hp.s1(this.C.f21919a).M0(Long.valueOf(this.f25050c));
        final boolean w10 = t3.w(14, M0);
        s3 s3Var2 = this.A;
        if (s3Var2 != null) {
            arrayList3.add(s3Var2);
        }
        final long h = h();
        VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(h);
        this.f25068x = true;
        int i11 = 0;
        this.f25069y = 0;
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.f25051e;
            int size2 = arrayList.size();
            arrayList2 = this.f25060o;
            if (i12 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i12);
            boolean C = C(groupCallParticipant3, false, this);
            boolean C2 = C(groupCallParticipant3, true, this);
            if (!groupCallParticipant3.self && (C || C2)) {
                this.f25069y++;
            }
            if (arrayList2.contains(Long.valueOf(m5.o(groupCallParticipant3.peer)))) {
                arrayList.remove(i12);
                i12--;
            }
            if (!C && !C2) {
                if (groupCallParticipant3.self || !this.f25068x || (groupCallParticipant3.video == null && groupCallParticipant3.presentation == null)) {
                    groupCallParticipant3.videoIndex = 0;
                }
            } else {
                if (this.f25068x) {
                    if (groupCallParticipant3.videoIndex == 0) {
                        if (groupCallParticipant3.self) {
                            groupCallParticipant3.videoIndex = Integer.MAX_VALUE;
                        } else {
                            int i13 = R + 1;
                            R = i13;
                            groupCallParticipant3.videoIndex = i13;
                        }
                    }
                } else {
                    groupCallParticipant3.videoIndex = 0;
                }
                z11 = true;
            }
            i12++;
        }
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(java.lang.Object r11, java.lang.Object r12) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m3.compare(java.lang.Object, java.lang.Object):int");
                }
            });
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            groupCallParticipant = null;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) k2.p1.h(1, arrayList);
        }
        char c10 = 2;
        if ((C(groupCallParticipant, false, this) || C(groupCallParticipant, true, this)) && (i3 = this.f25049b.unmuted_video_count) > this.f25069y) {
            this.f25069y = i3;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.f25069y--;
            }
        }
        int i14 = 5000;
        if (arrayList.size() > 5000 && (!t3.w(14, M0) || groupCallParticipant.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i15 = 5000;
            while (i15 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i14);
                char c11 = c10;
                if (groupCallParticipant4.raise_hand_rating != 0) {
                    c2 = c11;
                    z10 = z11;
                    i10 = 5000;
                } else {
                    n(groupCallParticipant4, false);
                    c2 = c11;
                    z10 = z11;
                    this.d.l(zi.C1(groupCallParticipant4.peer));
                    i10 = 5000;
                    arrayList.remove(5000);
                }
                i15++;
                z11 = z10;
                i14 = i10;
                c10 = c2;
            }
        }
        boolean z12 = z11;
        d();
        if (!this.f25068x && z12 && (s3Var = this.f25070z) != null) {
            arrayList3.add(s3Var);
        }
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i17);
            if (this.f25068x && groupCallParticipant5.videoIndex != 0) {
                boolean z13 = groupCallParticipant5.self;
                HashMap hashMap = this.f25054i;
                if (!z13 && C(groupCallParticipant5, true, this) && C(groupCallParticipant5, false, this)) {
                    s3 s3Var3 = (s3) hashMap.get(groupCallParticipant5.videoEndpoint);
                    if (s3Var3 == null) {
                        s3Var3 = new s3(groupCallParticipant5, false);
                        hashMap.put(groupCallParticipant5.videoEndpoint, s3Var3);
                    } else {
                        s3Var3.f25270a = groupCallParticipant5;
                        s3Var3.f25271b = false;
                    }
                    s3 s3Var4 = (s3) hashMap.get(groupCallParticipant5.presentationEndpoint);
                    if (s3Var4 == null) {
                        s3Var4 = new s3(groupCallParticipant5, true);
                    } else {
                        s3Var4.f25270a = groupCallParticipant5;
                        s3Var4.f25271b = true;
                    }
                    arrayList3.add(s3Var3);
                    if (s3Var3.f25272c > 1.0f) {
                        i16 = arrayList3.size() - 1;
                    }
                    arrayList3.add(s3Var4);
                    if (s3Var4.f25272c > 1.0f) {
                        size = arrayList3.size();
                        i16 = size - 1;
                    }
                } else if (groupCallParticipant5.self) {
                    if (C(groupCallParticipant5, true, this)) {
                        arrayList3.add(new s3(groupCallParticipant5, true));
                    }
                    if (C(groupCallParticipant5, false, this)) {
                        arrayList3.add(new s3(groupCallParticipant5, false));
                    }
                } else {
                    boolean C3 = C(groupCallParticipant5, true, this);
                    if (C3) {
                        str = groupCallParticipant5.presentationEndpoint;
                    } else {
                        str = groupCallParticipant5.videoEndpoint;
                    }
                    s3 s3Var5 = (s3) hashMap.get(str);
                    if (s3Var5 == null) {
                        s3Var5 = new s3(groupCallParticipant5, C3);
                        if (C3) {
                            str2 = groupCallParticipant5.presentationEndpoint;
                        } else {
                            str2 = groupCallParticipant5.videoEndpoint;
                        }
                        hashMap.put(str2, s3Var5);
                    } else {
                        s3Var5.f25270a = groupCallParticipant5;
                        s3Var5.f25271b = C3;
                    }
                    arrayList3.add(s3Var5);
                    if (s3Var5.f25272c > 1.0f) {
                        size = arrayList3.size();
                        i16 = size - 1;
                    }
                }
            } else {
                arrayList4.add(groupCallParticipant5);
            }
        }
        int size4 = arrayList.size();
        int i18 = 0;
        while (i18 < size4) {
            TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i18);
            i18++;
            arrayList2.remove(Long.valueOf(m5.o(groupCallParticipant6.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.f25049b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i19 = 0;
            while (i19 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i19);
                i19++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(m5.o(groupCallParticipant7.peer)));
            }
            ArrayList arrayList5 = this.f25057l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.f25058m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i11 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant8 = arrayList.get(i11);
                i11++;
                long o10 = m5.o(groupCallParticipant8.peer);
                Long valueOf = Long.valueOf(o10);
                HashSet hashSet = this.f25059n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(o10));
                    this.f25055j.remove(Long.valueOf(o10));
                }
            }
        }
        if (!x30.f51713x5 && arrayList3.size() % 2 == 1) {
            arrayList3.add((s3) arrayList3.remove(i16));
        }
    }
}
