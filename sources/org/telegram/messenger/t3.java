package org.telegram.messenger;

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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.f40;
public final class t3 {
    public static int R;
    public u3 A;
    public boolean B;
    public c C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean f26934a;
    public TLRPC.GroupCall f26935b;
    public long f26936c;
    public String f26950s;
    public boolean f26951t;
    public boolean f26952u;
    public boolean v;
    public boolean f26953w;
    public boolean f26954x;
    public int f26955y;
    public u3 f26956z;
    public a0.h d = new a0.h();
    public final ArrayList f26937e = new ArrayList();
    public final ArrayList f26938f = new ArrayList();
    public final ArrayList f26939g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap f26940i = new HashMap();
    public final ArrayList f26941j = new ArrayList();
    public final HashMap f26942k = new HashMap();
    public final ArrayList f26943l = new ArrayList();
    public final ArrayList f26944m = new ArrayList();
    public final HashSet f26945n = new HashSet();
    public final ArrayList f26946o = new ArrayList();
    public final SparseArray f26947p = new SparseArray();
    public final SparseArray f26948q = new SparseArray();
    public final SparseArray f26949r = new SparseArray();
    public final l3 D = new l3(this, 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final a0.h P = new a0.h();
    public final r3 Q = new r3(this);

    public static boolean C(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, t3 t3Var) {
        VoIPService sharedInstance;
        u3 u3Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            if (sharedInstance.getVideoState(z10) != 2) {
                return false;
            }
            return true;
        }
        u3 u3Var2 = t3Var.A;
        if ((u3Var2 != null && u3Var2.f27117a == groupCallParticipant) || (((u3Var = t3Var.f26956z) != null && u3Var.f27117a == groupCallParticipant) || t3Var.d.f(fj.B1(groupCallParticipant.peer)) != null)) {
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
                    for (int i7 = 0; i7 < size; i7++) {
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i7);
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i7);
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

    public final void A(int i7, String str) {
        boolean z10;
        this.f26953w = !this.f26953w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = g(this.f26934a);
        togglegroupcallrecord.start = this.f26953w;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i7 == 1 || i7 == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            togglegroupcallrecord.video_portrait = z10;
        }
        ConnectionsManager.getInstance(this.C.f23218a).sendRequest(togglegroupcallrecord, new m3(this, 2));
        ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
    }

    public final void B() {
        z();
        ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE, 0L);
    }

    public final void a(long j3) {
        if (this.d.f(j3) == null) {
            Long valueOf = Long.valueOf(j3);
            HashSet hashSet = this.f26945n;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(j3));
                this.f26941j.add(Long.valueOf(j3));
                this.f26946o.remove(Long.valueOf(j3));
                z();
                ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
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
            tL_groupCallParticipant.video_joined = this.f26935b.can_start_video;
            TLRPC.Chat O0 = mp.u1(this.C.f23218a).O0(Long.valueOf(this.f26936c));
            if (this.f26935b.join_muted && !v3.w(14, O0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            tL_groupCallParticipant.can_self_unmute = z11;
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.f23218a).getCurrentTime();
            if (v3.w(14, O0) || !v3.T(O0) || O0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f23218a).getCurrentTime();
            }
            if (h > 0) {
                TLRPC.UserFull d2 = mp.u1(this.C.f23218a).d2(h);
                if (d2 != null) {
                    tL_groupCallParticipant.about = d2.about;
                }
            } else {
                TLRPC.ChatFull P0 = mp.u1(this.C.f23218a).P0(-h);
                if (P0 != null) {
                    tL_groupCallParticipant.about = P0.about;
                }
            }
            this.d.k(tL_groupCallParticipant, h);
            this.f26937e.add(tL_groupCallParticipant);
            z();
            if (z10) {
                ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        if (!this.f26954x || (((sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall != this || (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(true) != 2)) && this.f26955y >= this.f26935b.unmuted_video_limit)) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z10 = this.E;
        l3 l3Var = this.D;
        if (z10) {
            g0.r(l3Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.f23218a).getCurrentTime();
        ArrayList arrayList = this.f26937e;
        int size = arrayList.size();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i10);
            int i11 = currentTime - groupCallParticipant.active_date;
            if (i11 < 5) {
                i7 = Math.min(i11, i7);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i7 != Integer.MAX_VALUE) {
            g0.h3(l3Var, i7 * 1000);
            this.E = true;
        }
    }

    public final void e() {
        if (this.f26956z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.f26936c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.f26956z = new u3(tL_groupCallParticipant, false);
    }

    public final void f(List list) {
        TLRPC.GroupCallParticipant tL_groupCallParticipant;
        if (this.B && this.A != null) {
            return;
        }
        u3 u3Var = this.A;
        if (u3Var != null) {
            tL_groupCallParticipant = u3Var.f27117a;
        } else {
            tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        }
        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
        tL_groupCallParticipant.peer = tL_peerChat;
        tL_peerChat.channel_id = this.f26936c;
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
        this.A = new u3(tL_groupCallParticipant, false);
        z();
        g0.g3(new l3(this, 0));
    }

    public final TLRPC.InputGroupCall g(boolean z10) {
        TLRPC.GroupCall groupCall = this.f26935b;
        if (groupCall == null) {
            return null;
        }
        if (z10) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) p5.c.h(1, Uri.parse(this.f26935b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.f26935b;
        tL_inputGroupCall.f28420id = groupCall2.f28413id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long h() {
        TLRPC.Peer peer = this.J;
        if (peer != null) {
            return fj.B1(peer);
        }
        return j10.i(this.C.f23218a).e();
    }

    public final boolean j() {
        if ((this.f26935b.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void k(boolean z10) {
        int i7;
        if (z10) {
            if (!this.v) {
                this.f26951t = false;
                this.f26950s = null;
            } else {
                return;
            }
        }
        if (!this.f26951t && this.f26937e.size() <= 5000) {
            if (z10) {
                this.v = true;
            }
            this.f26952u = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f26934a);
            String str = this.f26950s;
            if (str == null) {
                str = "";
            }
            getgroupparticipants.offset = str;
            if (this.f26934a) {
                i7 = mp.u1(this.C.f23218a).S6;
            } else {
                i7 = 20;
            }
            getgroupparticipants.limit = i7;
            ConnectionsManager.getInstance(this.C.f23218a).sendRequest(getgroupparticipants, new p3(this, z10, getgroupparticipants, 0));
        }
    }

    public final void l(final ArrayList arrayList, boolean z10, final di.h hVar) {
        HashSet hashSet;
        if (z10) {
            hashSet = this.K;
        } else {
            hashSet = this.L;
        }
        final HashSet hashSet2 = hashSet;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            if (hashSet2.contains(arrayList.get(i7))) {
                arrayList.remove(i7);
                i7--;
                size--;
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final int i10 = this.F + 1;
        this.F = i10;
        this.G.add(Integer.valueOf(i10));
        hashSet2.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = g(this.f26934a);
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (z10) {
                getgroupparticipants.ids.add(mp.u1(this.C.f23218a).l1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.f23218a).sendRequest(getgroupparticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                g0.g3(new bg.m0(t3.this, i10, tLObject, hVar, arrayList, hashSet2));
            }
        });
    }

    public final void m(ArrayList arrayList, boolean z10, String str, String str2, int i7, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(h());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.f26937e;
        a0.h hVar = null;
        if (isEmpty) {
            if (this.d.m() != 0) {
                hVar = this.d;
                this.d = new a0.h();
            } else {
                this.d.b();
            }
            arrayList2.clear();
            this.f26947p.clear();
            this.f26948q.clear();
            this.f26949r.clear();
            this.G.clear();
        }
        this.f26950s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.f26950s)) {
            this.f26951t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.f26935b;
            groupCall.version = i7;
            groupCall.participants_count = i10;
            if (s2.f26721a) {
                i5.c.t(this.f26935b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ks.f(this.C.f23218a).k(ks.B2, Long.valueOf(elapsedRealtime));
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
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(fj.B1(groupCallParticipant.peer));
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
            } else if (hVar != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) hVar.f(fj.B1(groupCallParticipant.peer))) != null) {
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
            this.d.k(groupCallParticipant, fj.B1(groupCallParticipant.peer));
            arrayList2.add(groupCallParticipant);
            n(groupCallParticipant, true);
        }
        if (this.f26935b.participants_count < this.d.m()) {
            this.f26935b.participants_count = this.d.m();
        }
        z();
        ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
        w();
    }

    public final void n(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        SparseArray sparseArray;
        int i7;
        int i10 = groupCallParticipant.source;
        SparseArray sparseArray2 = this.f26947p;
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
                if ((2 & tL_groupCallParticipantVideo.flags) != 0 && (i7 = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z10) {
                        sparseArray2.put(i7, groupCallParticipant);
                    } else {
                        sparseArray2.remove(i7);
                    }
                }
                if (i11 == 0) {
                    sparseArray = this.f26948q;
                } else {
                    sparseArray = this.f26949r;
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
        if (this.f26935b.version < groupCall.version) {
            this.f26950s = null;
            k(true);
        }
        cg.d.a(this.f26935b, groupCall);
        this.f26935b = groupCall;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(h());
        if (this.f26935b.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26953w = z10;
        ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
    }

    public final void p(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z10) {
        int i7;
        long j3;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        long j10 = 0;
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
            if (z11 && this.f26935b.version + 1 < tL_updateGroupCallParticipants.version) {
                if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                    this.f26950s = null;
                    k(true);
                    return;
                }
                if (this.I == 0) {
                    this.I = System.currentTimeMillis();
                }
                if (s2.f26721a) {
                    i5.c.t(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                }
                this.H.add(tL_updateGroupCallParticipants);
                if (this.M == null) {
                    l3 l3Var = new l3(this, 2);
                    this.M = l3Var;
                    g0.h3(l3Var, 1500L);
                    return;
                }
                return;
            } else if (z11 && tL_updateGroupCallParticipants.version < this.f26935b.version) {
                if (s2.f26721a) {
                    a8.b("ignore processParticipantsUpdate because of version");
                    return;
                }
                return;
            }
        }
        long h = h();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.f26937e;
        if (!arrayList.isEmpty()) {
            i7 = ((TLRPC.GroupCallParticipant) i5.c.h(1, arrayList)).date;
        } else {
            i7 = 0;
        }
        ks.f(this.C.f23218a).k(ks.B2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j11 = 0;
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (i11 < size2) {
            long j12 = j10;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i11);
            boolean z18 = z12;
            long B1 = fj.B1(groupCallParticipant.peer);
            if (s2.f26721a) {
                StringBuilder t6 = a8.p0.t(B1, "process participant ", " left = ");
                t6.append(groupCallParticipant.left);
                t6.append(" versioned ");
                t6.append(groupCallParticipant.versioned);
                t6.append(" flags = ");
                t6.append(groupCallParticipant.flags);
                t6.append(" self = ");
                t6.append(h);
                t6.append(" volume = ");
                i5.c.t(groupCallParticipant.volume, t6);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(B1);
            boolean z19 = groupCallParticipant.left;
            int i12 = size2;
            long j13 = h;
            a0.h hVar = this.P;
            if (z19) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.f26935b.version) {
                    if (s2.f26721a) {
                        a8.b("unknowd participant left, reload call");
                    }
                    z13 = z18;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(B1);
                    n(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.f26939g.remove(groupCallParticipant2);
                    if (hVar.g(null, B1) != null) {
                        if (B1 > j12) {
                            j3 = elapsedRealtime;
                            TLRPC.User c22 = mp.u1(this.C.f23218a).c2(Long.valueOf(B1));
                            StringBuilder t10 = a8.p0.t(B1, "left remove from speaking ", " ");
                            if (c22 == null) {
                                str4 = null;
                            } else {
                                str4 = c22.first_name;
                            }
                            p5.c.t(t10, str4, "GroupCall");
                        } else {
                            j3 = elapsedRealtime;
                            TLRPC.Chat O0 = mp.u1(this.C.f23218a).O0(Long.valueOf(-B1));
                            StringBuilder t11 = a8.p0.t(B1, "left remove from speaking ", " ");
                            if (O0 == null) {
                                str3 = null;
                            } else {
                                str3 = O0.title;
                            }
                            p5.c.t(t11, str3, "GroupCall");
                        }
                        hVar.l(B1);
                        z16 = z18;
                    } else {
                        j3 = elapsedRealtime;
                    }
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f26938f;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (fj.B1(((u3) arrayList2.get(i13)).f27117a.peer) == fj.B1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i13);
                            i13--;
                        }
                        i13++;
                    }
                } else {
                    j3 = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.f26935b;
                int i14 = groupCall.participants_count - 1;
                groupCall.participants_count = i14;
                if (i14 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j3 = elapsedRealtime;
                Long valueOf = Long.valueOf(B1);
                HashSet hashSet = this.f26945n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(B1);
                    hashSet.remove(valueOf2);
                    this.f26941j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (s2.f26721a) {
                        a8.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && hVar.g(null, B1) != null) {
                        hVar.l(B1);
                        if (B1 > j12) {
                            TLRPC.User c23 = mp.u1(this.C.f23218a).c2(Long.valueOf(B1));
                            StringBuilder t12 = a8.p0.t(B1, "muted remove from speaking ", " ");
                            if (c23 == null) {
                                str2 = null;
                            } else {
                                str2 = c23.first_name;
                            }
                            p5.c.t(t12, str2, "GroupCall");
                        } else {
                            TLRPC.Chat O02 = mp.u1(this.C.f23218a).O0(Long.valueOf(-B1));
                            StringBuilder t13 = a8.p0.t(B1, "muted remove from speaking ", " ");
                            if (O02 == null) {
                                str = null;
                            } else {
                                str = O02.title;
                            }
                            p5.c.t(t13, str, "GroupCall");
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
                    if (groupCallParticipant2.raise_hand_rating == j12 && groupCallParticipant.raise_hand_rating != j12) {
                        groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                    groupCallParticipant2.date = groupCallParticipant.date;
                    int max = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                    groupCallParticipant2.lastTypingDate = max;
                    if (j3 != groupCallParticipant2.lastVisibleDate) {
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
                        if (B1 != j13) {
                            j11 = B1;
                        }
                        TLRPC.GroupCall groupCall2 = this.f26935b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (s2.f26721a) {
                                a8.b("new participant, just joined, reload call");
                            }
                            z13 = true;
                        } else if (s2.f26721a) {
                            a8.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j12) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (B1 == j13 || arrayList.size() < 20 || groupCallParticipant.date <= i7 || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.f26951t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(groupCallParticipant, B1);
                    n(groupCallParticipant, true);
                }
                if (B1 == j13 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.f23218a).getCurrentTime();
                }
                z15 = true;
            }
            if (B1 == j13) {
                z17 = true;
            }
            i11++;
            j10 = j12;
            size2 = i12;
            h = j13;
            elapsedRealtime = j3;
            z12 = true;
            z14 = true;
        }
        int i16 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.f26935b;
        if (i16 > groupCall3.version) {
            groupCall3.version = i16;
            if (!z10) {
                r();
            }
        }
        if (this.f26935b.participants_count < this.d.m()) {
            this.f26935b.participants_count = this.d.m();
        }
        if (s2.f26721a) {
            i5.c.t(this.f26935b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z13 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = g(this.f26934a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.f23218a).sendRequest(getgroupparticipants, new m3(this, 0));
        }
        if (z14) {
            if (z15) {
                z();
            }
            ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.valueOf(z17), Long.valueOf(j11));
        }
        if (z16) {
            ks.f(this.C.f23218a).k(ks.f25227y2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
        }
    }

    public final void q(int i7, ArrayList arrayList) {
        ks.f(this.C.f23218a).k(ks.B2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Long l10 = (Long) arrayList.get(i10);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l10.longValue());
            if (groupCallParticipant != null) {
                if (i7 - groupCallParticipant.lastTypingDate > 10) {
                    if (groupCallParticipant.lastVisibleDate != i7) {
                        groupCallParticipant.active_date = i7;
                    }
                    groupCallParticipant.lastTypingDate = i7;
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
            ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
        }
    }

    public final void r() {
        char c10;
        jg.w wVar = new jg.w(12);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, wVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z10 = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i7 = this.f26935b.version;
                int i10 = i7 + 1;
                int i11 = tL_updateGroupCallParticipants.version;
                if (i10 != i11 && i7 != i11) {
                    if (i7 < i11) {
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
                        if (s2.f26721a) {
                            a8.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                        }
                        if (z10) {
                            this.I = System.currentTimeMillis();
                            return;
                        }
                        return;
                    }
                    if (s2.f26721a) {
                        a8.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                    }
                    this.I = 0L;
                    arrayList.clear();
                    this.f26950s = null;
                    k(true);
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (s2.f26721a) {
                a8.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void s() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = g(this.f26934a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.f23218a).sendRequest(getgroupcall, new m3(this, 3));
    }

    public final void t(long j3) {
        this.f26945n.remove(Long.valueOf(j3));
        this.f26941j.remove(Long.valueOf(j3));
        z();
        ks.f(this.C.f23218a).k(ks.f25213w2, Long.valueOf(this.f26936c), Long.valueOf(this.f26935b.f28413id), Boolean.FALSE);
    }

    public final void u(c cVar, long j3, TL_phone.groupCall groupcall) {
        boolean z10;
        this.f26936c = j3;
        this.C = cVar;
        TLRPC.GroupCall groupCall = this.f26935b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        cg.d.a(groupCall, groupCall2);
        this.f26935b = groupCall2;
        int i7 = groupCall2.record_start_date;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26953w = z10;
        int size = groupcall.participants.size();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i11);
            this.d.k(groupCallParticipant, fj.B1(groupCallParticipant.peer));
            this.f26937e.add(groupCallParticipant);
            n(groupCallParticipant, true);
            i10 = Math.min(i10, groupCallParticipant.date);
        }
        z();
        this.f26950s = groupcall.participants_next_offset;
        k(true);
        e();
        if (this.f26935b.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void v(c cVar, TLRPC.GroupCall groupCall) {
        boolean z10;
        this.f26936c = 0L;
        this.C = cVar;
        cg.d.a(this.f26935b, groupCall);
        this.f26935b = groupCall;
        if (groupCall.record_start_date != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26953w = z10;
        z();
        k(true);
        e();
        if (groupCall.rtmp_stream) {
            f(Collections.EMPTY_LIST);
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.C.f23218a && sharedInstance.getChat() != null && sharedInstance.getChat().f28403id == (-this.f26936c)) {
            sharedInstance.setParticipantsVolume();
        }
    }

    public final void x(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = j10.i(this.C.f23218a).e();
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
        TLRPC.GroupCall groupCall = this.f26935b;
        if (groupCall.participants_count <= 0 && !groupCall.rtmp_stream && !j()) {
            return false;
        }
        return true;
    }

    public final void z() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i7;
        String str;
        int size;
        String str2;
        u3 u3Var;
        char c10;
        boolean z10;
        int i10;
        ArrayList arrayList3 = this.f26938f;
        arrayList3.clear();
        ArrayList arrayList4 = this.f26939g;
        arrayList4.clear();
        TLRPC.Chat O0 = mp.u1(this.C.f23218a).O0(Long.valueOf(this.f26936c));
        final boolean w10 = v3.w(14, O0);
        u3 u3Var2 = this.A;
        if (u3Var2 != null) {
            arrayList3.add(u3Var2);
        }
        final long h = h();
        VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(h);
        this.f26954x = true;
        int i11 = 0;
        this.f26955y = 0;
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            arrayList = this.f26937e;
            int size2 = arrayList.size();
            arrayList2 = this.f26946o;
            if (i12 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i12);
            boolean C = C(groupCallParticipant3, false, this);
            boolean C2 = C(groupCallParticipant3, true, this);
            if (!groupCallParticipant3.self && (C || C2)) {
                this.f26955y++;
            }
            if (arrayList2.contains(Long.valueOf(n5.o(groupCallParticipant3.peer)))) {
                arrayList.remove(i12);
                i12--;
            }
            if (!C && !C2) {
                if (groupCallParticipant3.self || !this.f26954x || (groupCallParticipant3.video == null && groupCallParticipant3.presentation == null)) {
                    groupCallParticipant3.videoIndex = 0;
                }
            } else {
                if (this.f26954x) {
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
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o3.compare(java.lang.Object, java.lang.Object):int");
                }
            });
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            groupCallParticipant = null;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) i5.c.h(1, arrayList);
        }
        char c11 = 2;
        if ((C(groupCallParticipant, false, this) || C(groupCallParticipant, true, this)) && (i7 = this.f26935b.unmuted_video_count) > this.f26955y) {
            this.f26955y = i7;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.f26955y--;
            }
        }
        int i14 = 5000;
        if (arrayList.size() > 5000 && (!v3.w(14, O0) || groupCallParticipant.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i15 = 5000;
            while (i15 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i14);
                char c12 = c11;
                if (groupCallParticipant4.raise_hand_rating != 0) {
                    c10 = c12;
                    z10 = z11;
                    i10 = 5000;
                } else {
                    n(groupCallParticipant4, false);
                    c10 = c12;
                    z10 = z11;
                    this.d.l(fj.B1(groupCallParticipant4.peer));
                    i10 = 5000;
                    arrayList.remove(5000);
                }
                i15++;
                z11 = z10;
                i14 = i10;
                c11 = c10;
            }
        }
        boolean z12 = z11;
        d();
        if (!this.f26954x && z12 && (u3Var = this.f26956z) != null) {
            arrayList3.add(u3Var);
        }
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i17);
            if (this.f26954x && groupCallParticipant5.videoIndex != 0) {
                boolean z13 = groupCallParticipant5.self;
                HashMap hashMap = this.f26940i;
                if (!z13 && C(groupCallParticipant5, true, this) && C(groupCallParticipant5, false, this)) {
                    u3 u3Var3 = (u3) hashMap.get(groupCallParticipant5.videoEndpoint);
                    if (u3Var3 == null) {
                        u3Var3 = new u3(groupCallParticipant5, false);
                        hashMap.put(groupCallParticipant5.videoEndpoint, u3Var3);
                    } else {
                        u3Var3.f27117a = groupCallParticipant5;
                        u3Var3.f27118b = false;
                    }
                    u3 u3Var4 = (u3) hashMap.get(groupCallParticipant5.presentationEndpoint);
                    if (u3Var4 == null) {
                        u3Var4 = new u3(groupCallParticipant5, true);
                    } else {
                        u3Var4.f27117a = groupCallParticipant5;
                        u3Var4.f27118b = true;
                    }
                    arrayList3.add(u3Var3);
                    if (u3Var3.f27119c > 1.0f) {
                        i16 = arrayList3.size() - 1;
                    }
                    arrayList3.add(u3Var4);
                    if (u3Var4.f27119c > 1.0f) {
                        size = arrayList3.size();
                        i16 = size - 1;
                    }
                } else if (groupCallParticipant5.self) {
                    if (C(groupCallParticipant5, true, this)) {
                        arrayList3.add(new u3(groupCallParticipant5, true));
                    }
                    if (C(groupCallParticipant5, false, this)) {
                        arrayList3.add(new u3(groupCallParticipant5, false));
                    }
                } else {
                    boolean C3 = C(groupCallParticipant5, true, this);
                    if (C3) {
                        str = groupCallParticipant5.presentationEndpoint;
                    } else {
                        str = groupCallParticipant5.videoEndpoint;
                    }
                    u3 u3Var5 = (u3) hashMap.get(str);
                    if (u3Var5 == null) {
                        u3Var5 = new u3(groupCallParticipant5, C3);
                        if (C3) {
                            str2 = groupCallParticipant5.presentationEndpoint;
                        } else {
                            str2 = groupCallParticipant5.videoEndpoint;
                        }
                        hashMap.put(str2, u3Var5);
                    } else {
                        u3Var5.f27117a = groupCallParticipant5;
                        u3Var5.f27118b = C3;
                    }
                    arrayList3.add(u3Var5);
                    if (u3Var5.f27119c > 1.0f) {
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
            arrayList2.remove(Long.valueOf(n5.o(groupCallParticipant6.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.f26935b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i19 = 0;
            while (i19 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i19);
                i19++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(n5.o(groupCallParticipant7.peer)));
            }
            ArrayList arrayList5 = this.f26943l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.f26944m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i11 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant8 = arrayList.get(i11);
                i11++;
                long o4 = n5.o(groupCallParticipant8.peer);
                Long valueOf = Long.valueOf(o4);
                HashSet hashSet = this.f26945n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(o4));
                    this.f26941j.remove(Long.valueOf(o4));
                }
            }
        }
        if (!f40.E5 && arrayList3.size() % 2 == 1) {
            arrayList3.add((u3) arrayList3.remove(i16));
        }
    }
}
