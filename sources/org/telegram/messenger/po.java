package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class po {
    public final long f24785a;
    public boolean f24788e;
    public final hp h;
    public final ArrayList f24786b = new ArrayList();
    public boolean f24787c = true;
    public boolean d = false;
    public int f24789f = -1;
    public int f24790g = -1;

    public po(hp hpVar, long j10) {
        this.h = hpVar;
        this.f24785a = j10;
    }

    public final void a(final int i3, final int i10) {
        if (!this.f24788e && i10 > 0 && i3 >= 0) {
            if (i10 != this.f24790g || i3 != this.f24789f) {
                this.f24788e = true;
                this.f24789f = i3;
                this.f24790g = i10;
                long j10 = this.f24785a;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                hp hpVar = this.h;
                if (i11 >= 0) {
                    TLRPC.User a22 = hpVar.a2(Long.valueOf(j10));
                    if (a22 == null) {
                        this.f24788e = false;
                        return;
                    }
                    TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                    tL_photos_getUserPhotos.offset = i3;
                    tL_photos_getUserPhotos.limit = i10;
                    tL_photos_getUserPhotos.max_id = 0L;
                    tL_photos_getUserPhotos.user_id = hpVar.q1(a22);
                    hpVar.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                        public final po f24581b;

                        {
                            this.f24581b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    if (tL_error == null) {
                                        TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                        po poVar = this.f24581b;
                                        poVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                        g0.h3(new k2.a0(poVar, photos_photos, i3, i10, 5));
                                        return;
                                    }
                                    return;
                                default:
                                    if (tL_error == null) {
                                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                        po poVar2 = this.f24581b;
                                        poVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                        g0.h3(new k2.a0(poVar2, messages_messages, i3, i10, 6));
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
                tL_messages_search.add_offset = i3;
                tL_messages_search.limit = i10;
                tL_messages_search.offset_id = 0;
                tL_messages_search.f27112q = "";
                tL_messages_search.peer = hpVar.j1(j10);
                hpVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                    public final po f24581b;

                    {
                        this.f24581b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                    po poVar = this.f24581b;
                                    poVar.h.getMessagesStorage().m1(photos_photos.users, null, true, true);
                                    g0.h3(new k2.a0(poVar, photos_photos, i3, i10, 5));
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                    po poVar2 = this.f24581b;
                                    poVar2.h.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                                    g0.h3(new k2.a0(poVar2, messages_messages, i3, i10, 6));
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(int i3, boolean z10) {
        ArrayList arrayList = this.f24786b;
        int i10 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i3 < 0) {
            i3 += arrayList.size();
        }
        if (i3 >= arrayList.size()) {
            i3 -= arrayList.size();
        }
        if (i3 >= 0 && i3 < arrayList.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) == null) {
                    if (z10) {
                        while (arrayList.get(i3) != null) {
                            i3++;
                            if (i3 >= arrayList.size()) {
                                i3 = 0;
                            }
                        }
                        while (i10 <= 80) {
                            int i12 = i3 + i10;
                            if (i12 >= arrayList.size() || arrayList.get(i12) != null) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 > 0) {
                            a(i3, i10);
                            return;
                        }
                        return;
                    }
                    while (arrayList.get(i3) != null) {
                        i3--;
                        if (i3 < 0) {
                            i3 = arrayList.size() - 1;
                        }
                    }
                    while (i10 <= 80) {
                        int i13 = i3 - i10;
                        if (i13 < 0 || arrayList.get(i13) != null) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 > 0) {
                        a(i3 - i10, i10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void c(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f24786b;
            if (i3 < arrayList.size()) {
                arrayList.add(0, (TLRPC.Photo) arrayList.remove(i3));
                g();
                this.h.getNotificationCenter().k(hs.f23222e3, this);
            }
        }
    }

    public final void d(int i3, int i10, TLRPC.photos_Photos photos_photos) {
        boolean z10;
        TLRPC.Photo photo;
        boolean z11 = this.d;
        this.f24788e = false;
        this.d = true;
        this.f24787c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.f24786b;
        if (max == arrayList.size() && i3 + i10 <= arrayList.size()) {
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
                int i12 = i3 + i11;
                if (arrayList.get(i12) != null && ((TLRPC.Photo) arrayList.get(i12)).f27025id != photos_photos.photos.get(i11).f27025id) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            arrayList.clear();
            for (int i13 = 0; i13 < photos_photos.count; i13++) {
                int i14 = i13 - i3;
                if (i14 >= 0 && i14 < photos_photos.photos.size()) {
                    photo = photos_photos.photos.get(i14);
                } else {
                    photo = null;
                }
                arrayList.add(photo);
            }
        } else {
            for (int i15 = 0; i15 < photos_photos.photos.size(); i15++) {
                arrayList.set(i3 + i15, photos_photos.photos.get(i15));
            }
        }
        g();
        this.h.getNotificationCenter().k(hs.f23222e3, this);
        if (!z11 && i3 == 0 && i10 < arrayList.size() && arrayList.size() - i10 > 80) {
            a(arrayList.size() - 80, 80);
        }
    }

    public final void e(long j10) {
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f24786b;
            if (i3 >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i3);
            if (photo != null && photo.f27025id == j10) {
                arrayList.remove(i3);
                i3--;
                z10 = true;
            }
            i3++;
        }
        if (z10) {
            g();
            this.h.getNotificationCenter().k(hs.f23222e3, this);
        }
    }

    public final void f() {
        this.f24786b.clear();
        this.f24789f = -1;
        this.f24790g = -1;
        this.f24787c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().f24934a.c(new no(this, 1));
    }
}
