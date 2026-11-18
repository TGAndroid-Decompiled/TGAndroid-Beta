package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uo {
    public final long f27198a;
    public boolean f27201e;
    public final mp h;
    public final ArrayList f27199b = new ArrayList();
    public boolean f27200c = true;
    public boolean d = false;
    public int f27202f = -1;
    public int f27203g = -1;

    public uo(mp mpVar, long j3) {
        this.h = mpVar;
        this.f27198a = j3;
    }

    public final void a(final int i7, final int i10) {
        if (!this.f27201e && i10 > 0 && i7 >= 0) {
            if (i10 != this.f27203g || i7 != this.f27202f) {
                this.f27201e = true;
                this.f27202f = i7;
                this.f27203g = i10;
                long j3 = this.f27198a;
                int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                mp mpVar = this.h;
                if (i11 >= 0) {
                    TLRPC.User c22 = mpVar.c2(Long.valueOf(j3));
                    if (c22 == null) {
                        this.f27201e = false;
                        return;
                    }
                    TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                    tL_photos_getUserPhotos.offset = i7;
                    tL_photos_getUserPhotos.limit = i10;
                    tL_photos_getUserPhotos.max_id = 0L;
                    tL_photos_getUserPhotos.user_id = mpVar.s1(c22);
                    mpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                        public final uo f27039b;

                        {
                            this.f27039b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    if (tL_error == null) {
                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                        uo uoVar = this.f27039b;
                                        uoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                        g0.g3(new l2.x(uoVar, photos_photos, i7, i10, 5));
                                        return;
                                    }
                                    return;
                                default:
                                    if (tL_error == null) {
                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                        uo uoVar2 = this.f27039b;
                                        uoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                        g0.g3(new l2.x(uoVar2, messages_messages, i7, i10, 6));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
                tL_messages_search.add_offset = i7;
                tL_messages_search.limit = i10;
                tL_messages_search.offset_id = 0;
                tL_messages_search.f28514q = "";
                tL_messages_search.peer = mpVar.l1(j3);
                mpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                    public final uo f27039b;

                    {
                        this.f27039b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                    uo uoVar = this.f27039b;
                                    uoVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                    g0.g3(new l2.x(uoVar, photos_photos, i7, i10, 5));
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    uo uoVar2 = this.f27039b;
                                    uoVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                    g0.g3(new l2.x(uoVar2, messages_messages, i7, i10, 6));
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(int i7, boolean z10) {
        ArrayList arrayList = this.f27199b;
        int i10 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i7 < 0) {
            i7 += arrayList.size();
        }
        if (i7 >= arrayList.size()) {
            i7 -= arrayList.size();
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) == null) {
                    if (z10) {
                        while (arrayList.get(i7) != null) {
                            i7++;
                            if (i7 >= arrayList.size()) {
                                i7 = 0;
                            }
                        }
                        while (i10 <= 80) {
                            int i12 = i7 + i10;
                            if (i12 >= arrayList.size() || arrayList.get(i12) != null) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 > 0) {
                            a(i7, i10);
                            return;
                        }
                        return;
                    }
                    while (arrayList.get(i7) != null) {
                        i7--;
                        if (i7 < 0) {
                            i7 = arrayList.size() - 1;
                        }
                    }
                    while (i10 <= 80) {
                        int i13 = i7 - i10;
                        if (i13 < 0 || arrayList.get(i13) != null) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 > 0) {
                        a(i7 - i10, i10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f27199b;
            if (i7 < arrayList.size()) {
                arrayList.add(0, (TLRPC.Photo) arrayList.remove(i7));
                g();
                this.h.getNotificationCenter().k(ks.f25119g3, this);
            }
        }
    }

    public final void d(int i7, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z10;
        TLRPC.Photo photo;
        boolean z11 = this.d;
        this.f27201e = false;
        this.d = true;
        this.f27200c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.f27199b;
        if (max == arrayList.size() && i7 + i10 <= arrayList.size()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i11 = 0;
            while (true) {
                if (i11 >= photos_photos.photos.size()) {
                    break;
                }
                int i12 = i7 + i11;
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).f28427id != photos_photos.photos.get(i11).f28427id) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            arrayList.clear();
            for (int i13 = 0; i13 < photos_photos.count; i13++) {
                int i14 = i13 - i7;
                if (i14 >= 0 && i14 < photos_photos.photos.size()) {
                    photo = photos_photos.photos.get(i14);
                } else {
                    photo = null;
                }
                arrayList.add(photo);
            }
        } else {
            for (int i15 = 0; i15 < photos_photos.photos.size(); i15++) {
                arrayList.set(i7 + i15, photos_photos.photos.get(i15));
            }
        }
        g();
        this.h.getNotificationCenter().k(ks.f25119g3, this);
        if (!z11 && i7 == 0 && i10 < arrayList.size() && arrayList.size() - i10 > 80) {
            a(arrayList.size() - 80, 80);
        }
    }

    public final void e(long j3) {
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f27199b;
            if (i7 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i7);
            if (photo != null && photo.f28427id == j3) {
                arrayList.remove(i7);
                i7--;
                z10 = true;
            }
            i7++;
        }
        if (z10) {
            g();
            this.h.getNotificationCenter().k(ks.f25119g3, this);
        }
    }

    public final void f() {
        this.f27199b.clear();
        this.f27202f = -1;
        this.f27203g = -1;
        this.f27200c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().f27052a.c(new so(this, 1));
    }
}
