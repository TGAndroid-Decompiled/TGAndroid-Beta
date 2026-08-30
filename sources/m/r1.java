package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;
public abstract class r1 {
    public static final Field f13616a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f13616a = field;
    }
}
