package ib;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.common.api.n;
import java.io.Closeable;
public interface c extends Closeable, s, n {
    @Override
    @b0(m.ON_DESTROY)
    void close();
}
