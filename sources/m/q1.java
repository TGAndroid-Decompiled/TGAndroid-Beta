package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;
public abstract class q1 {
    public static final Field f13303a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f13303a = field;
    }
}
