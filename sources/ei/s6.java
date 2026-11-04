package ei;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 {
    public int f11008a;
    public String f11009b;
    public TLRPC.Photo f11010c;
    public TLRPC.Document d;

    public static s6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f11008a = tL_storyAlbum.album_id;
        obj.f11009b = tL_storyAlbum.title;
        obj.f11010c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
