package ih;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 {
    public int f11901a;
    public String f11902b;
    public TLRPC.Photo f11903c;
    public TLRPC.Document d;

    public static o6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f11901a = tL_storyAlbum.album_id;
        obj.f11902b = tL_storyAlbum.title;
        obj.f11903c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
