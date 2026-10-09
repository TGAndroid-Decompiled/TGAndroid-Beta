package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f9 {
    public int f1033a;
    public String f1034b;
    public TLRPC.Photo f1035c;
    public TLRPC.Document d;

    public static f9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f1033a = tL_storyAlbum.album_id;
        obj.f1034b = tL_storyAlbum.title;
        obj.f1035c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
