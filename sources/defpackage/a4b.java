package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a4b {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static a4b a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.a = tL_storyAlbum.album_id;
        obj.b = tL_storyAlbum.title;
        obj.c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
