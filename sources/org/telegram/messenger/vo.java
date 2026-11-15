package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vo {
    public final long f27089a;
    public boolean f27092e;
    public final np h;
    public final ArrayList f27090b = new ArrayList();
    public boolean f27091c = true;
    public boolean d = false;
    public int f27093f = -1;
    public int f27094g = -1;

    public vo(np npVar, long j3) {
        this.h = npVar;
        this.f27089a = j3;
    }

    public final void a(final int i7, final int i10) {
        if (!this.f27092e && i10 > 0 && i7 >= 0) {
            if (i10 != this.f27094g || i7 != this.f27093f) {
                this.f27092e = true;
                this.f27093f = i7;
                this.f27094g = i10;
                long j3 = this.f27089a;
                int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                np npVar = this.h;
                if (i11 >= 0) {
                    TLRPC.User a22 = npVar.a2(Long.valueOf(j3));
                    if (a22 == null) {
                        this.f27092e = false;
                        return;
                    }
                    TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                    tL_photos_getUserPhotos.offset = i7;
                    tL_photos_getUserPhotos.limit = i10;
                    tL_photos_getUserPhotos.max_id = 0L;
                    tL_photos_getUserPhotos.user_id = npVar.q1(a22);
                    npVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                        public final vo f26852b;

                        {
                            this.f26852b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    if (tL_error == null) {
                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                        vo voVar = this.f26852b;
                                        voVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                        g0.h3(new l2.x(voVar, photos_photos, i7, i10, 5));
                                        return;
                                    }
                                    return;
                                default:
                                    if (tL_error == null) {
                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                        vo voVar2 = this.f26852b;
                                        voVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                        g0.h3(new l2.x(voVar2, messages_messages, i7, i10, 6));
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
                tL_messages_search.f28162q = "";
                tL_messages_search.peer = npVar.j1(j3);
                npVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                    public final vo f26852b;

                    {
                        this.f26852b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                    vo voVar = this.f26852b;
                                    voVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                    g0.h3(new l2.x(voVar, photos_photos, i7, i10, 5));
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    vo voVar2 = this.f26852b;
                                    voVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                    g0.h3(new l2.x(voVar2, messages_messages, i7, i10, 6));
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
        ArrayList arrayList = this.f27090b;
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
            ArrayList arrayList = this.f27090b;
            if (i7 < arrayList.size()) {
                arrayList.add(0, (TLRPC.Photo) arrayList.remove(i7));
                g();
                this.h.getNotificationCenter().k(ns.f25490e3, this);
            }
        }
    }

    public final void d(int i7, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z10;
        TLRPC.Photo photo;
        boolean z11 = this.d;
        this.f27092e = false;
        this.d = true;
        this.f27091c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.f27090b;
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
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).f28075id != photos_photos.photos.get(i11).f28075id) {
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
        this.h.getNotificationCenter().k(ns.f25490e3, this);
        if (!z11 && i7 == 0 && i10 < arrayList.size() && arrayList.size() - i10 > 80) {
            a(arrayList.size() - 80, 80);
        }
    }

    public final void e(long j3) {
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f27090b;
            if (i7 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i7);
            if (photo != null && photo.f28075id == j3) {
                arrayList.remove(i7);
                i7--;
                z10 = true;
            }
            i7++;
        }
        if (z10) {
            g();
            this.h.getNotificationCenter().k(ns.f25490e3, this);
        }
    }

    public final void f() {
        this.f27090b.clear();
        this.f27093f = -1;
        this.f27094g = -1;
        this.f27091c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().f27219a.c(new to(this, 1));
    }
}
