package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class r1 {

    public static final Field f17440a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e9) {
            e9.printStackTrace();
        }
        f17440a = declaredField;
    }
}
